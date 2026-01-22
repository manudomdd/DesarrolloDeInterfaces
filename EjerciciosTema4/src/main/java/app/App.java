package app;

import dao.PersonaDAO;
import repository.ConexionDB;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane; // Importamos la librería para ventanas

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
                String nombreBusqueda = JOptionPane.showInputDialog(null, "Introduce el nombre a filtrar (pulse aceptar para ver todos los registros):");
                
                if (nombreBusqueda == null) {
                    nombreBusqueda = "";
                }

                System.out.println("Generando reporte para: " + nombreBusqueda);
                
                String rutaReporte = "src/main/java/resources/people_report.jrxml.xml";

                Map<String, Object> parametros = new HashMap<>();
                parametros.put("paramNombre", nombreBusqueda);

                JasperReport reporte = JasperCompileManager.compileReport(rutaReporte);

                JasperPrint print = JasperFillManager.fillReport(reporte, parametros, miConexion);

                JasperViewer.viewReport(print, false); 
                
            } catch (JRException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al generar reporte: " + e.getMessage());
            }
            
        } else {
            System.out.println("FALLO: La conexión es null.");
        }
    }
}