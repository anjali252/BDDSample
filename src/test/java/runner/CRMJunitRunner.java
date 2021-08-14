package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src//test//resources//tagFeatures//",
		glue = {"stepdefs"},
		tags="@RegressionTest or @SmokeTest",
//				tags="@RegressionTest and @SmokeTest",
//				tags="@RegressionTest and not @SmokeTest",
//				tags="@SmokeTest",
//				tags="@RegressionTest and not @FunctionalTest",
		monochrome = true,
//		dryRun=true,
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:test-output/SparkReport/ExtentReport.html", 
//				"pretty"
				}
		)
public class CRMJunitRunner {

}
