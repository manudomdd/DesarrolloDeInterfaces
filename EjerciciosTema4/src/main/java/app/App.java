package app;

import dao.PersonaDAO;
import repository.ConexionDB;
import java.sql.Connection;
import java.util.HashMap;

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
        PersonaDAO persona = new PersonaDAO();

        if (miConexion != null) {
            System.out.println("¡ÉXITO! La conexión se realizó correctamente desde el Main.");   

            System.out.println("Generando reporte...");
            
            try {
                String rutaReporte = "src/main/java/resources/people_report.jrxml.xml";

                JasperReport reporte = JasperCompileManager.compileReport(rutaReporte);

                JasperPrint print = JasperFillManager.fillReport(reporte, new HashMap<>(), miConexion);

                JasperViewer.viewReport(print, false); 
                
                System.out.println("Reporte generado con éxito.");

            } catch (JRException e) {
                System.err.println("ERROR AL GENERAR REPORTE:");
                e.printStackTrace();
            }
            
        } else {
            System.out.println("FALLO: La conexión vino vacía (null). Revisa el usuario/pass.");
        }
    }
}