package testcase;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Authentification {

	public static void main(String[] args) throws InterruptedException {
		// Chemin de chrome driver
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		// Ouvrir chrome
		WebDriver driver =new ChromeDriver();
		//Maximiser la fanetre 
		driver.manage().window().maximize();
		//ouvrir l'url 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//sleep
		Thread.sleep(5000);
		// identification de web element
		WebElement user; 
		user = driver.findElement(By.name("username"));
		//action
		user.sendKeys("Admin");
		//identification de password
		WebElement password;
		password = driver.findElement(By.name("password"));
		//action 
		password.sendKeys("admin123");
		//identification boutton
		WebElement bouton;
		bouton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		bouton.click();
		
		Thread.sleep(5000);
		
		//verification (assert)
		  // identification element
		WebElement profil;
		profil = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
		//recuperation text 
		String text;
		text= profil.getText();
		//assert 
		Assert.assertEquals("Paul Collings",text);
		System.out.println("Test ok");
		
		
		
		
		
		

	}

}
