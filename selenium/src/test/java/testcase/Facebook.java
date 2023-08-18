package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

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
				driver.navigate().to("https://www.facebook.com/");
				
				//Identification des element
				
				WebElement compte;
				compte = driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
				compte.click();
				
				WebElement prenom ;
				WebElement nom ;
				WebElement email ;
				WebElement confirmemail;
				WebElement password ;
				WebElement Jour;
				WebElement Mois;
				WebElement Année;
				WebElement Homme;
				
				prenom = driver.findElement(By.name("firstname"));
				nom = driver.findElement(By.name("lastname"));
				email = driver.findElement(By.name("reg_email__"));
				confirmemail = driver.findElement(By.name("reg_email_confirmation__"));
				password = driver.findElement(By.name("reg_passwd__"));
				Jour = driver.findElement(By.name("birthday_day"));
				Mois= driver.findElement(By.name("birthday_month"));
				Année = driver.findElement(By.name("birthday_year"));
				Homme = driver.findElement(By.xpath("//input[@value='2']"));
				
				prenom.sendKeys("jeremy");
				nom.sendKeys("jhonson");
				email.sendKeys("jjhonson@mail.com");
				confirmemail.sendKeys("jjhonson@mail.com");
				password.sendKeys("Jhonson1234");
				Select select = new Select(Jour);
				select.selectByValue("8");
				Select select1 = new Select(Mois);
				select1.selectByValue("6");
				Select select2 = new Select(Année);
				select2.selectByValue("1995");
				Homme.click();
				
				System.out.println("test ok");
				
				
				

	}

}
