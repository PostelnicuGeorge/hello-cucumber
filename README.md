# TestNG

## Running tests with TestNG in parallel
Cucumber can be executed in parallel using **TestNG and Maven test execution plugins** by setting the 
**dataprovider parallel option to true**. In TestNG **the scenarios and rows in a scenario outline are executed in multiple threads**. 
One can use either Maven Surefire or Failsafe plugin for executing the runners.

Maven command:
```
mvn verify
```

Maven output:
```
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running ro.agile_testing.hello_cucumber.RunCucumberTest

Scenario Outline: Today is or is not Friday # ro/agile_testing/hello_cucumber/is_it_friday_yet.feature:13

Scenario Outline: Today is or is not Friday # ro/agile_testing/hello_cucumber/is_it_friday_yet.feature:11

Scenario Outline: Today is or is not Friday # ro/agile_testing/hello_cucumber/is_it_friday_yet.feature:12

Scenario: Today is Friday               # ro/agile_testing/hello_cucumber/is_it_something_special.feature:4

Scenario: Today is something special    # ro/agile_testing/hello_cucumber/is_it_something_special.feature:9
Before :: TestNG-PoolService-0 :: Today is or is not Friday
Before :: TestNG-PoolService-3 :: Today is Friday
Before :: TestNG-PoolService-4 :: Today is something special
Before :: TestNG-PoolService-2 :: Today is or is not Friday
Before :: TestNG-PoolService-1 :: Today is or is not Friday
  Given today is "Friday"               # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.today_is(java.lang.String)
  Given today is "anything else!"           # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.today_is(java.lang.String)
  Given today is "my birthday"          # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.today_is(java.lang.String)
  Given today is "Sunday"                   # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.today_is(java.lang.String)
  Given today is "Friday"                   # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.today_is(java.lang.String)
  When I ask whether it's Friday yet        # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.i_ask_whether_it_s_Friday_yet()
  When I ask whether it's Friday yet        # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.i_ask_whether_it_s_Friday_yet()
  When I ask whether it's Friday yet        # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.i_ask_whether_it_s_Friday_yet()
  When I ask whether it's a special day # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.iAskWhetherItSASpecialDay()
  When I ask whether it's a special day # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.iAskWhetherItSASpecialDay()
  Then I should be told "Nope"              # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.i_should_be_told(java.lang.String)
After :: TestNG-PoolService-1 :: Today is or is not Friday
  Then I should be told "TGIYBD"        # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.i_should_be_told(java.lang.String)
  Then I should be told "Nope"              # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.i_should_be_told(java.lang.String)
After :: TestNG-PoolService-2 :: Today is or is not Friday
  Then I should be told "TGIF"              # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.i_should_be_told(java.lang.String)
  Then I should be told "Nope"          # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.i_should_be_told(java.lang.String)
After :: TestNG-PoolService-3 :: Today is Friday
After :: TestNG-PoolService-0 :: Today is or is not Friday
After :: TestNG-PoolService-4 :: Today is something special
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.706 s - in ro.agile_testing.hello_cucumber.RunCucumberTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0
```