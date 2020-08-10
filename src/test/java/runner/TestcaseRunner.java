package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = {"src/test/java/features/calculateBMI.feature"},
			glue = {"stepDefination"},
			tags = {"@RegressionTest"},
			plugin = {"pretty","html:target/cucumber-pretty","json:target/cucumber/cucumber.json","html:target/cucumber-html-reports"}
			)
	
public class TestcaseRunner {

}
