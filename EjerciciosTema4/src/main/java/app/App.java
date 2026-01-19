package app;

import dao.PersonaDAO;
import repository.ConexionDB;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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

            Scanner scanner = new Scanner(System.in);
            System.out.println("------------------------------------------------");
            System.out.print("Introduce el nombre para filtrar (Enter para ver todos): ");
            String textoBusqueda = scanner.nextLine();

            System.out.println("Generando reporte...");
            
            try {
                String rutaReporte = "src/main/java/resources/people_report.jrxml.xml";

                Map<String, Object> parametros = new HashMap<>();
                parametros.put("paramNombre", "%" + textoBusqueda + "%");

                JasperReport reporte = JasperCompileManager.compileReport(rutaReporte);

                JasperPrint print = JasperFillManager.fillReport(reporte, parametros, miConexion);

                JasperViewer.viewReport(print, false); 
                
                System.out.println("Reporte generado con éxito.");

            } catch (JRException e) {
                System.err.println("ERROR AL GENERAR REPORTE:");
                e.printStackTrace();
            } finally {
                scanner.close();
            }
            
        } else {
            System.out.println("FALLO: La conexión vino vacía (null). Revisa el usuario/pass.");
        }
    }
}