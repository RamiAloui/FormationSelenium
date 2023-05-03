package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		// Chemin de chrome driver
				System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
				// Ouvrir chrome
				WebDriver driver =new ChromeDriver();
				//Maximiser la fanetre 
				driver.manage().window().maximize();
				//ouvrir l'url 
				driver.get("https://www.youtube.com/");
				//sleep
				Thread.sleep(5000);
				
				// identification de web element
				WebElement searchbar ;
				searchbar = driver.findElement(By.name("search_query"));
				//action
				searchbar.sendKeys("tunisie");
				
				WebElement bouton;
				bouton = driver.findElement(By.id("search-icon-legacy"));
				bouton.click();
				
				//sleep
				Thread.sleep(5000);
				
				String url;
				url =driver.getCurrentUrl();
				//assert
				Assert.assertEquals("https://www.youtube.com/results?search_query=tunisie", url);
				System.out.println("Test ok");
				
				
				

	}

}
