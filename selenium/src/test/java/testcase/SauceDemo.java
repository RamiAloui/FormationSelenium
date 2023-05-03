package testcase;

import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SauceDemo {

	public static void main(String[] args) {
		
		                     //Authentification
		
		//Cheome Path
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		//Open Chorme 
		WebDriver driver = new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//implicity wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Open url
		driver.navigate().to("https://www.saucedemo.com/");
		
		//Elements identificaation
		WebElement login;
		login = driver.findElement(By.id("user-name"));
		WebElement password;
		password = driver.findElement(By.id("password"));
		WebElement boutton;
		boutton = driver.findElement(By.id("login-button"));
		//saisie
		login.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		//ACTION
		boutton.click();
		
		
		// Filter By low to high price 
		WebElement dropdown;
		dropdown = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
		dropdown.click();
		
		WebElement price;
		price = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]"));
		price.click();
		
	
		System.out.println("test ok");
		
		//Add to cart 
		
		WebElement Onesie;
		Onesie = driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
		Onesie.click();
		
		WebElement BikeLight;
		BikeLight = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
		BikeLight.click();
		
		//Shopping cart link
		WebElement Cart;
		Cart = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
		Cart.click();
		
		//Checkout
		WebElement Checkout = driver.findElement(By.id("checkout"));
		Checkout.click();
		
		// Saisie
		WebElement FirstName  ;
		FirstName = driver.findElement(By.id("first-name"));
		FirstName.sendKeys("Rami");
		WebElement LastName ;
		LastName = driver.findElement(By.id("last-name"));
		LastName.sendKeys("Aloui");
		WebElement PostalCode ;
		PostalCode  = driver.findElement(By.id("postal-code"));
		PostalCode .sendKeys("2037");
		WebElement Continue;
		Continue = driver.findElement(By.id("continue"));
		Continue.click();
		
		//Finish
		WebElement Finish ;
		Finish = driver.findElement(By.id("finish"));
		Finish.click();
		
		//Assert
		WebElement text;
		text = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2"));
		String Message;
		Message=text.getText();
		Assert.assertEquals(Message, "Thank you for your order!");
		System.out.println("test finale ok");
		driver.close();
		

	}

}
