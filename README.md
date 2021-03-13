# A java project/POC dedicated to exploring the different possibilities of skeleton-cucumber configurations starting from [cucumberhello](https://cucumber.io/docs/guides/10-minute-tutorial/)  project

## JUnit - Parallel
Cucumber can be executed in parallel using JUnit and Maven test execution plugins.
In JUnit the **feature files are run in parallel rather than scenarios**, which means **all the scenarios in a feature file will be executed by the same thread**.
You can use either Maven Surefire or Failsafe plugin to execute the runners.
Maven command
```
mvn verify
```

Output
```
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running Is it a special day yet?

Scenario: Today is Friday               # ro/agile_testing/hello_cucumber/is_it_something_special.feature:4
14_pool-2-thread-2
  Given today is "Friday"               # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.today_is(java.lang.String)
14_pool-2-thread-2
  When I ask whether it's a special day # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.iAskWhetherItSASpecialDay()
14_pool-2-thread-2
  Then I should be told "Nope"          # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.i_should_be_told(java.lang.String)

Scenario: Today is something special    # ro/agile_testing/hello_cucumber/is_it_something_special.feature:9
14_pool-2-thread-2
  Given today is "my birthday"          # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.today_is(java.lang.String)
14_pool-2-thread-2
  When I ask whether it's a special day # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.iAskWhetherItSASpecialDay()
14_pool-2-thread-2
  Then I should be told "TGIYBD"        # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.i_should_be_told(java.lang.String)
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.172 s - in Is it a special day yet?
[INFO] Running Is it Friday yet?

Scenario Outline: Today is or is not Friday # ro/agile_testing/hello_cucumber/is_it_friday_yet.feature:11
13_pool-2-thread-1
  Given today is "Friday"                   # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.today_is(java.lang.String)
13_pool-2-thread-1
  When I ask whether it's Friday yet        # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.i_ask_whether_it_s_Friday_yet()
13_pool-2-thread-1
  Then I should be told "TGIF"              # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.i_should_be_told(java.lang.String)

Scenario Outline: Today is or is not Friday # ro/agile_testing/hello_cucumber/is_it_friday_yet.feature:12
13_pool-2-thread-1
  Given today is "Sunday"                   # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.today_is(java.lang.String)
13_pool-2-thread-1
  When I ask whether it's Friday yet        # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.i_ask_whether_it_s_Friday_yet()
13_pool-2-thread-1
  Then I should be told "Nope"              # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.i_should_be_told(java.lang.String)

Scenario Outline: Today is or is not Friday # ro/agile_testing/hello_cucumber/is_it_friday_yet.feature:13
13_pool-2-thread-1
  Given today is "anything else!"           # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.today_is(java.lang.String)
13_pool-2-thread-1
  When I ask whether it's Friday yet        # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.i_ask_whether_it_s_Friday_yet()
13_pool-2-thread-1
  Then I should be told "Nope"              # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.i_should_be_told(java.lang.String)
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.183 s - in Is it Friday yet?
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0
```