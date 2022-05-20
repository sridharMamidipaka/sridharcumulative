package Pages;


import java.io.File;
import java.io.FileNotFoundException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


import hybdidwork.BrowserFactory;

 class Baseclass {
	public WebDriver driver;
	public ConfigDataproviders config;
    public ExtentReports report;
    public ExtentSparkReporter spark;
    public ExtentTest logger;
    public  Logger Log;



@BeforeSuite
public void setupsuite() throws FileNotFoundException
   {
	Reporter.log("setting upreports and atrarted", true);
	
	config=new ConfigDataproviders();
	report=new ExtentReports();
	Log=Logger.getLogger("hybdidframe");
	PropertyConfigurator.configure("Log4j.properties");
	ExtentSparkReporter spark = new ExtentSparkReporter(new File(System.getProperty("user.dir")+"/Reports/Urban"+Helperclass.getcurrentDateTime()+".html"));
	spark.config().setTheme(Theme.DARK);
	spark.config().setDocumentTitle("sridhar_report");
	report.attachReporter(spark);
	Reporter.log("setting Done", true);
	


    }
  

	
		@BeforeClass
	 public void voidsetup()
	 {
		
		driver=BrowserFactory.startApplication(driver,config.getBrowser(), config.getStagingurl());

	 }
	
	@AfterClass
	 public void teardown() 
	 {
		BrowserFactory.quitBrowser(driver);
		 
	 }
	@AfterMethod
	public void terdown(ITestResult result) 
	{
		if(result.getStatus()==ITestResult.FAILURE)
				{
			Helperclass.captureScreenshots(driver);
				}
		report.flush();
	}
	

	
	
		
	}
	
	
	
	
	
	 



