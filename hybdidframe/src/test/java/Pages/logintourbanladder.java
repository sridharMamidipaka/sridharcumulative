package Pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class logintourbanladder extends Baseclass  {
	@Test(priority=1)
	public void loginApp() throws InterruptedException
	
	{ 
		Log.info("Testcase 1 Started");
		logger =report.createTest("loginapp");
		Loginpage lopin= PageFactory.initElements(driver,Loginpage.class);
		logger.info("statingApllication");
		Log.info("Enterd into chrome ");

		 lopin.LoginToCrm();
		   logger.pass("loginpage");
		   Log.info("Testcase 1 Executed");

    }
  @Test(priority=2)
   public void signupapp() throws InterruptedException
	
   
	{   Log.info("Testcase 2 Started");
	  logger=report.createTest("signup");
	  signuppage lopi= PageFactory.initElements(driver,signuppage.class);
		 lopi.signupp("saisridharmamididpaka@gmail.com","Sridhar733@");
		 logger.pass("logindone");
		 Log.info("signup done withurban ladders ");


		     
		         
    }
@Test(priority=3)

	 public void searchupapp() throws InterruptedException
		
		{ 
		Log.info("Testcase 3 Started");
		Reporter.log("Bedsheet Done", true);

		 logger=report.createTest("serachbox");

		 Searrchpage lopi4= PageFactory.initElements(driver,Searrchpage.class);
			 lopi4.searcho("carpets & rugs");
			 logger.pass("searchinddone");
			 Log.info("searching done for bedsheets ");


			     
			         
	    }
	@Test(priority=4)

	 public void Bedapp() throws InterruptedException
		
	 {   
		Log.info("Testcase 4 Started");
		Reporter.log("searching Done", true);

		logger=report.createTest("bedapp");

		Bedrooms lopi5= PageFactory.initElements(driver,Bedrooms.class);
		logger.info("searchind for bed");
			 lopi5.LoginBed();
			 logger.pass("searchingdone");
			 Log.info("searching done for Beds ");


			 
			     
			         
	    }
	@Test(priority=5)

	 public void Bedappcart() throws InterruptedException
		
	 
		{Log.info("Testcase 5 Started");
		Reporter.log("bedappdone Done", true);
		logger=report.createTest("booking");
		     BookingPage lopi6= PageFactory.initElements(driver,BookingPage.class);
			 lopi6.bedlogin();
			     
			 logger.pass("bookingdone");
			 Log.info("Bookinddone ");



	    }

    @Test(priority=6)

	 public void assertionaa() throws InterruptedException
		
		{  Log.info("Testcase 6Started"); 
    	   Reporter.log("assertions Done", true);
    	     logger=report.createTest("assertion");
		     Asserttest lopi7= PageFactory.initElements(driver,Asserttest.class);
		     logger.info("comparasion");
			 lopi7.assersearcho();
			 logger.pass("comparasiondone");
			
			
	    }
	 @Test(priority=7)

	 public void tvappcart() throws InterruptedException
		
		{  Log.info("Testcase 7 Started");
		 logger=report.createTest("livindroom");
		     Livingroom lopi8= PageFactory.initElements(driver,Livingroom.class);
			 lopi8.tvpageoo();
			 logger.pass("searchingfor Tv is pass");
			 Log.info("clicking on tv part and get ss");


			     
	    }

	 @Test(priority=8)

	 public void studyapp() throws InterruptedException
		
		{ Log.info("Testcase 8 Started");
		 logger=report.createTest("studypage");
		     studypage lopi9= PageFactory.initElements(driver,studypage.class);
			 lopi9.studypageo();
			 logger.pass("searching done for sttudytable");
			 Log.info("searching for studytables ");



			     
	    }
	 @Test(priority=9)

	 public void aboutapp() throws InterruptedException
		
		{   Log.info("Testcase 9 Started");
		    logger=report.createTest("aboutpageooo");
		     aboutpageoo lopia= PageFactory.initElements(driver,aboutpageoo.class);
			 lopia.aboutu();
			 logger.pass("done with aboutpage");
			 Log.info(" validation of text" );


			     
	    }
	 @Test(priority=10)
	 public void infoapp()
		
		{   Log.info("Testcase 10 Started");  
		     logger=report.createTest("moreinfo");

		      Moreinfo lopioo= PageFactory.initElements(driver,Moreinfo.class);
		      logger.info("getall the text");
			 lopioo.moruee();
			 logger.pass("done and back to eclipse");
			 Log.info("Exit from the browser");


			 

			     
	    }


}
