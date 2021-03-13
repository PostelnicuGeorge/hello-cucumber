package ro.agile_testing.hello_cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"pretty", "json:target/jsonReports/test-results.json"})
public class RunCucumberTest extends AbstractTestNGCucumberTests {

}
