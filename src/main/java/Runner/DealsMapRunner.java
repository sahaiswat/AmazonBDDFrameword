package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="C:\\Users\\ssinha\\eclipse-workspace\\AmazonBDDFramework\\src\\main\\java\\Features\\DealsMap.feature",
	glue= {"stepDefinition"},
	plugin = {"pretty", "html:test-output", "json:json_output/cucumber", "junit:junit_xml/cucumber.xml"},
	monochrome=true,
	strict=true,
	dryRun=false
	)
public class DealsMapRunner {
	

}
