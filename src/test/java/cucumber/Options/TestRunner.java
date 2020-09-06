package cucumber.Options;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features", 
		plugin = {"pretty","json:target/jsonReports/cucumber-report.json"}, 
		glue = "stepDefinations",
		tags = "@APITest,@UIMobileTest"
		)

public class TestRunner {

}
