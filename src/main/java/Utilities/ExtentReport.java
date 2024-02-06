package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

	public static ExtentReports getexteExtentReports() {
		
		String extentreportpath = System.getProperty("user.dir")+"\\Reports\\extentreport.html";
		
		//create an object of extentsparkreporter
		ExtentSparkReporter reporter = new ExtentSparkReporter(extentreportpath);
		
		//set the report name and provide the document title 
		reporter.config().setReportName("Spicejet");
		reporter.config().setDocumentTitle("Spicejet booking Automation Test Results");
		
		//create an object for extent report class
		ExtentReports extentreports = new ExtentReports();
		
		extentreports.attachReporter(reporter);
		
		return extentreports;
		
	}
	
}
