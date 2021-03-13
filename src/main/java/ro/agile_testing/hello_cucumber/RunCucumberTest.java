package ro.agile_testing.hello_cucumber;

import io.cucumber.core.cli.Main;
import ro.agile_testing.hello_cucumber.services.ReportService;

public class RunCucumberTest {
	public static void main(String[] args) {
		String[] argv = new String[]{
				"--glue", "ro.agile_testing.hello_cucumber",
				"--plugin", "pretty",
				"--plugin", "json:jsonReports/cucumber-report.json",
				"--threads", "5",
				"--tags", "@original or @copy",
				"classpath:ro/agile_testing/hello_cucumber"
		};
		ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
		byte exitStatus = Main.run(argv, contextClassLoader);
		System.out.println(exitStatus);
		ReportService reportService = new ReportService();
		reportService.generateReport();
	}
}
