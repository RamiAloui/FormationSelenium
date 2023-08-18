package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class exemplepageobject {

	WebDriver driver;
	
	//identification des elements 
	
	@FindBy (how=How.NAME,using="username")
	public static WebElement user;
	
	
	@FindBy (how=How.NAME,using="password")
	public static WebElement pass;
	
	
	@FindBy (how=How.XPATH,using="//button[normalize-space()='Login']")
	public static WebElement log;
	
	@FindBy (how=How.XPATH,using="//*[@id=\\\"app\\\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")
	public static WebElement nomprofil; 
	
	//creation des methodes 
	
	public void ouvertureUrl (String url) {
		
		driver.get(url);
	}
	
	public void rempliUser (String string) {
		user.sendKeys(string);
		
	}
	public void rempliPass (String string) {
		pass.sendKeys(string);
	}
	public void cliquerboutton () {
		log.click();
	}
	
	public static String text () {
		String message ;
		message=nomprofil.getText();
		return message;
	}
}
