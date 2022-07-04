package com.anncode.amazonviewer.model;
import com.anncode.makereport.Report;

public class MainReport {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Report report = new Report();
		report.setNameFile("reporte");
		report.setExtension("txt");
		report.setTitle(":: VISTOS ::");
        String contentReport = "Leonel!";
        report.setContent(contentReport);
		report.makeReport();
		System.out.println("Reporte Generado");
		System.out.println();
    }
}
