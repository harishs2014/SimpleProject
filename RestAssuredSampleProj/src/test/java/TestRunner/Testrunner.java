package TestRunner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/feature",
		monochrome=true,
	    strict=true,
	    dryRun=false,
		tags= {"@DemoTest"},
	        plugin = { "pretty", "html:target/cucumber-reports" },
		glue={""} 
		)

public class Testrunner
{

}
