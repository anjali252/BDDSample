package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "@target//failed_scenarios.txt",
glue = { "stepdefs" },
plugin = { "pretty" })
//features = failed_scenario: Cucumber picks the failed scenarios from this file 
public class RerunFailedRunner extends AbstractTestNGCucumberTests {
}
