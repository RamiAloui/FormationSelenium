package javacucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class creationstepdef  {
	
	WebDriver driver;
	
	@Given("ouvrir navigateur chromee")
	public void ouvrir_navigateur_chromee() {
		 System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Given("ouvrir url {string}")
	public void ouvrir_url(String string) {
	    driver.get(string);
	}

	@When("cliquer sur creer un compte")
	public void cliquer_sur_creer_un_compte() {

		WebElement compte;
		compte = driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
		compte.click();
	}

	@When("saisir nom {string}")
	public void saisir_nom(String string) {
		WebElement nom ;
		nom = driver.findElement(By.name("lastname"));
		nom.sendKeys(string);
	}
	@When("saisir prenom {string}")
	public void saisir_prenom(String string) {
		WebElement prenom ;
		prenom = driver.findElement(By.name("firstname"));
		prenom.sendKeys(string);
	}
	

	@When("saisir mail {string}")
	public void saisir_mail(String string) {
		WebElement email ;
		email = driver.findElement(By.name("reg_email__"));
		email.sendKeys(string);
	}
	
	@When("saisir mail de confirmation {string}")
	public void saisir_mail_de_confirmation(String string) {
		WebElement confirmemail;
		confirmemail = driver.findElement(By.name("reg_email_confirmation__"));
		confirmemail.sendKeys(string);
	}

	@When("saisir mot de passe {string}")
	public void saisir_mot_de_passe(String string) {
		WebElement password ;
		password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys(string);
	}

	@When("choisir jour de naissance {string}")
	public void choisir_jour_de_naissance(String string) {
		WebElement Jour;
		Jour = driver.findElement(By.name("birthday_day"));
		Select select = new Select(Jour);
		select.selectByValue(string);
	}

	@When("choisir mois de naissance {string}")
	public void choisir_mois_de_naissance(String string) {
		WebElement Mois;
		Mois= driver.findElement(By.name("birthday_month"));
		Select select1 = new Select(Mois);
		select1.selectByValue(string);
	}

	@When("choisir annee de naissance {string}")
	public void choisir_annee_de_naissance(String string) {
		WebElement Année;
		Année = driver.findElement(By.name("birthday_year"));
		Select select2 = new Select(Année);
		select2.selectByValue(string);
	}
	   

	@When("choisir genre {string}")
	public void choisir_genre(String string) {
		WebElement Homme;
		Homme = driver.findElement(By.xpath("//input[@value='2']"));
		WebElement Femme;
		Femme = driver.findElement(By.xpath("//input[@value='1']"));
		if (string.equals("Homme")) {
			Homme.click();
		}
		else if (string.equals("Femme")) {
			Femme.click();
		}
	}
	   

	@When("cliquer sur le bouton sinscrire")
	public void cliquer_sur_le_bouton_sinscrire() {
		WebElement inscrire ;
		inscrire= driver.findElement(By.name("websubmit"));
		inscrire.click();
	}
	@Then("Verifier la page home")
	public void verifier_la_page_home() {
	  driver.close();
	}
	
	@When("choisir genre {string} et selectionner {string}")
	public void choisir_genre(String preso,String string2) {
		if (preso.equals("personnalise")) {
		WebElement bouttonPerso;
		bouttonPerso = driver.findElement(By.xpath("//label[normalize-space()='Personnalisé']"));
		bouttonPerso.click();
		}
		
		WebElement listeperso = driver.findElement(By.name("preferred_pronoun"));
		Select select = new Select(listeperso);
		select.selectByValue(string2);
		driver.close();
	    
	}

}
