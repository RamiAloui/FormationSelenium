package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DragAndDrop {

	public static void main(String[] args) {
		// Chemin de chrome driver
				System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
				// Ouvrir chrome
				WebDriver driver =new ChromeDriver();
				//Maximiser la fanetre 
				driver.manage().window().maximize();
				//implicity wait
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				//ouvrir l'url 
				driver.get("http://demoqa.com/droppable/");
				
				// identification Element 1 
				WebElement from;
				from = driver.findElement(By.id("draggable"));
				//identification Element 2 
				WebElement to;
				to = driver.findElement(By.id("droppable"));
				//Actions
				Actions action = new Actions(driver);
				action.dragAndDrop(from, to).perform();
				//recuperation de text
				String text;
				text=to.getText();
				//Assert
				Assert.assertEquals(text,"Dropped!");
				System.out.println("test ok");
				driver.close();
				
				
				
				
	}

}
