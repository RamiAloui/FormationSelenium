package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class setup {
	public static WebDriver driver;

	@Before
	public void initial() {

		driver = drivermanager.getdriver();
	}

	@BeforeStep
	public void avant() {
		System.out.println("etape en cours");
	}

	@AfterStep
	public void TakeScreenshot(Scenario scenario) {
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", "image");
	}

	@After
	public void finale() {

		driver.close();
	}

}
