package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="C:\\Users\\ssinha\\eclipse-workspace\\AmazonBDDFramework\\src\\main\\java\\Features\\MultipleSignIn.feature",
	glue= {"stepDefinition"},
	plugin = {"pretty", "html:target/cucumber"},
	monochrome=true,
	strict=true,
	dryRun=false
			)

public class MultipleSignInRunner {

}
