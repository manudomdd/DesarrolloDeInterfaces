package com.mycompany.reporteavanzado.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class ReporteAvanzado {

    public static void main(String[] args) {
        System.out.println("Iniciando generación de reporte...");

        String url = "jdbc:mysql://localhost:3306/ventas_empresa?useSSL=false&serverTimezone=UTC";
        String user = "manu";   
        String password = "manu"; 

        String sourceFileName = "src/main/java/com/mycompany/reporteavanzado/resources/report.jrxml.xml";     
        String pdfFileName = "Reporte_Final_Ventas.pdf";

        Connection conn = null;

        try {
            System.out.println("Conectando a la base de datos...");
            conn = DriverManager.getConnection(url, user, password);

            System.out.println("Compilando el diseño del reporte...");
            JasperReport jasperReport = JasperCompileManager.compileReport(sourceFileName);

            Map<String, Object> parameters = new HashMap<>();

            System.out.println("Llenando el reporte con datos...");
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, conn);

            JasperExportManager.exportReportToPdfFile(jasperPrint, pdfFileName);
            System.out.println("¡Éxito! Reporte guardado como: " + pdfFileName);

            System.out.println("Abriendo visor...");
            JasperViewer.viewReport(jasperPrint, false);

        } catch (SQLException e) {
            System.err.println("Error de Base de Datos: " + e.getMessage());
            e.printStackTrace();
        } catch (JRException e) {
            System.err.println("Error de JasperReports: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}