package com.gaurav.pdfreportgenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.gaurav.pdfreportgenerator.util.pdf.PDFGenerator;

@SpringBootApplication
@ComponentScan(basePackages = {"com.gaurav.pdfreportgenerator"})
public class PdfReportGeneratorApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(PdfReportGeneratorApplication.class, args);
		PDFGenerator pDFGenerator = ac.getBean("pdfGenerator",PDFGenerator.class);
		pDFGenerator.generatePdfReport();
	}

}
