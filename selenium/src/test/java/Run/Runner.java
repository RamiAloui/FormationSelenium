package Run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		tags="",
		features ="src/test/features/exemple/orange.feature",
		glue="javacucumber",
		publish = true,
		plugin= {
				"pretty","html:target/rapport.html","json:target/rapportJS.json"
		}
		
		
		)

public class Runner {

}
