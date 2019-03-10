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
	         plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json","junit:target/cucumber-reports/Cucumber.xml","html:target/cucumber-reports"},
		glue={""} 
		)

public class Testrunner
{

}
