package javacucumber;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class orangestepdef {
	
	WebDriver driver;
	
	
	@Given("ouvrir navigateur Chrome")
	public void ouvrir_navigateur_chrome() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Given("ouvrir URL {string}")
	public void ouvrir_url(String string) {
		driver.get(string);
	}

	@When("saisir username {string}")
	public void saisir_username(String string) {
		WebElement user; 
		user = driver.findElement(By.name("username"));
		user.sendKeys(string);
	}

	@When("saisir password {string}")
	public void saisir_password(String string) {
		WebElement password;
		password = driver.findElement(By.name("password"));
		password.sendKeys(string);
	}

	@When("cliquer sur login")
	public void cliquer_sur_login() {
		WebElement bouton;
		bouton = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		bouton.click();
	}

	@Then("Verifier le test {string}")
	public void verifier_le(String string) {
		
		String link ;
		link=driver.getCurrentUrl();
		
		
		if (link.equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")){
		WebElement profil ;
		profil = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
		String text ;
		text=profil.getText();
		Assert.assertEquals(string,text);
		System.out.println("test ok");
			}
		
		else if (link.equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")) {
		    WebElement error;
		    error=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p"));
		    String text2;
		    text2=error.getText();
		    Assert.assertEquals(string, text2);
		    System.out.println("test ko");
		   
		}
		 
	}


}
