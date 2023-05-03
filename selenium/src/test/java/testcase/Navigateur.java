package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateur {

	public static void main(String[] args) throws InterruptedException {
		// chemin de chrome driver (path)
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		// ouverture de chrome 
		WebDriver driver = new ChromeDriver();
		// maximiser la fenetre 
		driver.manage().window().maximize();
		//delete cookies
		driver.manage().deleteAllCookies();
		// ouvrir url 
		driver.navigate().to("https://www.youtube.com/");
		//sleep
		Thread.sleep(5000);
	}

}
