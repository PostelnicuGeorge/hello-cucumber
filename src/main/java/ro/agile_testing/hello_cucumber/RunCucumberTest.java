package ro.agile_testing.hello_cucumber;

import io.cucumber.core.cli.Main;
import ro.agile_testing.hello_cucumber.services.ReportService;

//@CucumberOptions(plugin = {"pretty", "json:target/jsonReports/test-results.json"})
public class RunCucumberTest {

	public static void main(String[] args) {
		String[] argv = new String[]{"--plugin", "pretty", "json:target/jsonReports/test-results.json"};
		ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
		byte exitStatus = Main.run(argv, contextClassLoader);
		System.out.println(exitStatus);
		ReportService reportService = new ReportService();
		reportService.generateReport();
	}
}
