package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class FonctionClick {

	public static void main(String[] args) throws InterruptedException {
		// Chemin de chrome driver
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		// Ouvrir chrome
		WebDriver driver =new ChromeDriver();
		//Maximiser la fanetre 
		driver.manage().window().maximize();
		//implicity wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//ouvrir l'url 
		driver.get("https://demoqa.com/buttons");
		
		
		//identification element1
		WebElement boutton1;
		boutton1 = driver.findElement(By.id("doubleClickBtn"));
		
		//Actions class
		Actions action = new Actions(driver);
		
		// Double-click sur element1
		action.doubleClick(boutton1).perform();
		
		//Assert
		WebElement msg;
		msg = driver.findElement(By.id("doubleClickMessage"));
		String text;
		text = msg.getText();
		Assert.assertEquals(text, "You have done a double click");
		
		System.out.println("Test1 ok");
		
		//identification element2
		WebElement boutton2;
		boutton2 = driver.findElement(By.id("rightClickBtn"));
		
		//Actions class
		Actions action1 = new Actions(driver);
		
		//Righ-Click sur element 
		action1.contextClick(boutton2).perform();
		
		//Assert 
		WebElement msg2;
		msg2 = driver.findElement(By.id("rightClickMessage"));
		String text2;
		text2=msg2.getText();
		Assert.assertEquals(text2, "You have done a right click");
		
		System.out.println("Test2 ok");
		
		
		WebElement boutton3;
		boutton3=driver.findElement(By.xpath("//div[3]//button[1]"));
		Actions action2=new Actions(driver);
		action2.click(boutton3).perform();
		WebElement message;		
        message=driver.findElement(By.id("dynamicClickMessage"));
        String text3;
        text3=message.getText();
        Assert.assertEquals("You have done a dynamic click", text3);
        
        System.out.println("test ok");
	}

}
