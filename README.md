# Programmatic Approach

## Running tests with programmatic approach in parallel
Cucumber can be executed in parallel using the **Main.run() from Cucumber Core CLI**. 
The **--threads option** needs to be set to **a value greater than 1 to run in parallel**. 
When the parallel mode is used, **the scenarios and rows in a scenario outline will be run in multiple threads**. 
One doesn't depend anymore on Maven Surefire or Failsafe plugin for executing the tests.
To report the cucumber-reporting dependency is used instead of the plugin maven-cucumber-reporting.

Java command:
```jvm
java -jar hello-cucumber-1.0.0-SNAPSHOT-jar-with-dependencies.jar
```

Java output:
```
@original @both
Scenario Outline: Today is or is not Friday # ro/agile_testing/hello_cucumber/is_it_friday_yet.feature:12

@copy @both
Scenario: Today is Friday               # ro/agile_testing/hello_cucumber/is_it_something_special.feature:5

@original @both
Scenario Outline: Today is or is not Friday # ro/agile_testing/hello_cucumber/is_it_friday_yet.feature:14

@original @both
Scenario Outline: Today is or is not Friday # ro/agile_testing/hello_cucumber/is_it_friday_yet.feature:13

@copy @both
Scenario: Today is something special    # ro/agile_testing/hello_cucumber/is_it_something_special.feature:10
Before :: cucumber-runner-1-thread-2 :: Today is or is not Friday
Before :: cucumber-runner-1-thread-3 :: Today is or is not Friday
Before :: cucumber-runner-1-thread-1 :: Today is or is not Friday
Before :: cucumber-runner-1-thread-5 :: Today is something special
Before :: cucumber-runner-1-thread-4 :: Today is Friday
  Given today is "Sunday"                   # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.today_is(java.lang.String)
  Given today is "Friday"               # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.today_is(java.lang.String)
  Given today is "my birthday"          # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.today_is(java.lang.String)
  Given today is "Friday"                   # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.today_is(java.lang.String)
  Given today is "anything else!"           # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.today_is(java.lang.String)
  When I ask whether it's a special day # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.iAskWhetherItSASpecialDay()
  When I ask whether it's a special day # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.iAskWhetherItSASpecialDay()
  When I ask whether it's Friday yet        # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.i_ask_whether_it_s_Friday_yet()
  When I ask whether it's Friday yet        # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.i_ask_whether_it_s_Friday_yet()
  When I ask whether it's Friday yet        # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.i_ask_whether_it_s_Friday_yet()
  Then I should be told "TGIF"              # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.i_should_be_told(java.lang.String)
After :: cucumber-runner-1-thread-1 :: Today is or is not Friday
  Then I should be told "TGIYBD"        # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.i_should_be_told(java.lang.String)
  Then I should be told "Nope"          # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.i_should_be_told(java.lang.String)
  Then I should be told "Nope"              # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.i_should_be_told(java.lang.String)
After :: cucumber-runner-1-thread-5 :: Today is something special
After :: cucumber-runner-1-thread-2 :: Today is or is not Friday
After :: cucumber-runner-1-thread-4 :: Today is Friday
  Then I should be told "Nope"              # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.i_should_be_told(java.lang.String)
After :: cucumber-runner-1-thread-3 :: Today is or is not Friday

5 Scenarios (5 passed)
15 Steps (15 passed)
0m0.335s
```