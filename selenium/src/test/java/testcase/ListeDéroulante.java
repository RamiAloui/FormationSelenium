package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListeDéroulante {

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
				driver.navigate().to("https://demoqa.com/select-menu");
				
				WebElement Liste;
				Liste = driver.findElement(By.id("oldSelectMenu"));
				Select select = new Select(Liste);
				select.selectByValue("5");
				System.out.println("test liste ok");
	}

}
