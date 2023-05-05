package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		//Cheome Path
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		//Open Chorme 
		WebDriver driver = new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//implicity wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Open url
		driver.navigate().to("https://demoqa.com/menu");
		
		//Identification des element
		WebElement menu;
		menu = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
		//Actions
		Actions action = new Actions(driver) ;
		action.moveToElement(menu).perform();
		System.out.println("test menu ok");
		
		WebElement menu2 = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/a"));
		action.moveToElement(menu2).perform();
		System.out.println("test menu 2 ok");

	}

}
