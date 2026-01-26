package app;

import repository.ConexionDB;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.awt.GridLayout;
import javax.swing.*; // Importamos librerías gráficas
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.JRException;

public class App {

    public static void main(String[] args) {
        
        System.out.println("Iniciando programa...");
        Connection miConexion = ConexionDB.conectar();

        if (miConexion != null) {
            
            try {
                JTextField fieldNombre = new JTextField();
                JTextField fieldEdad = new JTextField();

                JPanel panel = new JPanel(new GridLayout(0, 1)); 
                panel.add(new JLabel("Nombre:"));
                panel.add(fieldNombre);
                panel.add(new JLabel("Edad (vacío para mostrar todo):"));
                panel.add(fieldEdad);

                int resultado = JOptionPane.showConfirmDialog(null, panel, 
                        "Filtrar Reporte", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

                if (resultado == JOptionPane.OK_OPTION) {
                    
                    String nombreBusqueda = fieldNombre.getText();
                    String edadStr = fieldEdad.getText();
                    
                    Integer edadBusqueda = null;

                    if (edadStr != null && !edadStr.trim().isEmpty()) {
                        try {
                            edadBusqueda = Integer.parseInt(edadStr);
                        } catch (NumberFormatException e) {
                            System.out.println("Edad no válida, se mostrarán todas.");
                        }
                    }

                    System.out.println("Generando reporte para Nombre: " + nombreBusqueda + " | Edad: " + edadBusqueda);
                    
                    String rutaReporte = "src/main/java/resources/people_report.jrxml.xml";

                    Map<String, Object> parametros = new HashMap<>();
                    parametros.put("paramNombre", nombreBusqueda);
                    parametros.put("paramEdad", edadBusqueda);

                    JasperReport reporte = JasperCompileManager.compileReport(rutaReporte);

                    JasperPrint print = JasperFillManager.fillReport(reporte, parametros, miConexion);

                    JasperViewer.viewReport(print, false); 
                    
                } else {
                    System.out.println("Operación cancelada por el usuario.");
                }
                
            } catch (JRException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al generar reporte: " + e.getMessage());
            }
            
        } else {
            System.out.println("FALLO: La conexión es null.");
        }
    }
}