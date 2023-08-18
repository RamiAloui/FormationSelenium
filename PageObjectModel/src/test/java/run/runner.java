package run;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags="",
		features ="src/test/features/ornikar.feature",
		glue="Test.SeleniumProjectFinal",
		publish = true,
		plugin= {
				"pretty","html:target/rapport.html","json:target/rapportJS.json"
		}
		
		
		)

public class runner {

}
