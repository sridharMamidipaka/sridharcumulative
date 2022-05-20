package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;



public class Bedrooms {
	WebDriver driver;
	public Bedrooms(WebDriver driver )
	{
		this.driver =driver;
		
	}
	
	@FindBy(xpath="//a[@href='/gift-cards?src=g_footer']") WebElement Sale_s;
	@FindBy(xpath="//*[@id='app-container']/div/main/section/section[1]/ul/li[1]") WebElement gift_card; 
	
	@FindBy(xpath="(//button[@class='_1fVSi action-button _1njbS _1XfDi _3J6Eb'])[1]") WebElement choose; 
	

	
	public void LoginBed() throws InterruptedException 
	{
		
		Sale_s.click();
		
		Thread.sleep(500);

		//System.out.println(Sale_s.getText());
		Actions action=new Actions(driver);
		action.moveToElement(gift_card).perform();
		Thread.sleep(1500);
	     choose.click();
	     Thread.sleep(600);
		Helperclass.captureScreenshots(driver);
			
		driver.navigate().back();
		
		
		Thread.sleep(1000);
		}

}
