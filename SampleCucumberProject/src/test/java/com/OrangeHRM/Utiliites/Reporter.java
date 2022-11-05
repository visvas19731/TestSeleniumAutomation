package com.OrangeHRM.Utiliites;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import cucumber.api.testng.AbstractTestNGCucumberTests;



public class Reporter extends AbstractTestNGCucumberTests {
		
		public static ExtentHtmlReporter reporter;
		public static ExtentReports extent;
		public static ExtentTest test, node;
		
		public String testcaseName, testcaseDec, author, category;
	//	public String excelFileName;
		
		@BeforeSuite
		public void startReport() {
			reporter = new ExtentHtmlReporter("./reports/result.html");
			reporter.setAppendExisting(false); 
			extent = new ExtentReports();
			extent.attachReporter(reporter);
		}
		
	    @BeforeClass
		public void report() throws IOException {
	 		test = extent.createTest(testcaseName, testcaseDec);
	 		test.assignAuthor(author);
			test.assignCategory(category);  
		}
	    
	    
	    
	    
	    @AfterSuite
	    public void stopReport() {
	    	extent.flush();
	    }
	}


