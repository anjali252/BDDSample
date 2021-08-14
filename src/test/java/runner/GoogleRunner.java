package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//Basically @CucumberOptions enables us to do all the things that we could 
//have done if we have used cucumber command line

@CucumberOptions(publish = true,
features = "src\\test\\resources\\feature\\googlePage.feature",
//features=".",
glue = {"stepdefs"},
monochrome = true,
dryRun = false,
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:test-output/SparkReport/ExtentReport.html", 
		"pretty"
//		"rerun:target/failed_scenarios.txt"
		,"html:target/reports/MainHTMLReport.html",
//		"usage:target/reports/UsageReport",
//		"json:target/reports/JSONReport.json"
		})

//Features Options helps Cucumber to locate the Feature file in the project
//folder structure. 

//Whenever Cucumber encounters a Step, it looks for a Step Definition inside
//all the files present in the folder mentioned in Glue Option.

//If monochrome is set as true, it means that the console output for the Cucumber test
//are much more readable. And if it is set as false, then the console output
//is not as readable as it should be.

// dryRun : So in case any of the functions are missed in the Step Definition
//for any Step in Feature File, it will give us the message.

//Pretty: Prints the Gherkin source with additional colors and stack traces
//for errors

//HTML: This will generate a HTML report at the location mentioned in the 
//for-matter itself. 

//usage: If we are more concerned about the time taken by each Step 
//Definition, then we should use the usage plugin. 

//JSON: This report contains all the information from the gherkin source in
//JSON Format.

//rerun: Creates a text file with failed scenarios

//ExtentCucumberAdapter: will generate the report in the output directory with the 
//name of the ExtentReport.html.
public class GoogleRunner extends AbstractTestNGCucumberTests {

//	@DataProvider(parallel=true)
//	public Object[][] scenarios(){
//		return super.scenarios();
//	}
}
