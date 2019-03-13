package runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"},
		glue = {"steps"},
		features = {"src/test/java/features"})
 
public class TestRunner {

}
