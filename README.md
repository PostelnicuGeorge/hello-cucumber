# TestNG

## Running tests with TestNG
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

Scenario Outline: Today is or is not Friday # ro/agile_testing/hello_cucumber/is_it_friday_yet.feature:11
1_main
  Given today is "Friday"                   # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.today_is(java.lang.String)
1_main
  When I ask whether it's Friday yet        # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.i_ask_whether_it_s_Friday_yet()
1_main
  Then I should be told "TGIF"              # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.i_should_be_told(java.lang.String)

Scenario Outline: Today is or is not Friday # ro/agile_testing/hello_cucumber/is_it_friday_yet.feature:12
1_main
  Given today is "Sunday"                   # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.today_is(java.lang.String)
1_main
  When I ask whether it's Friday yet        # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.i_ask_whether_it_s_Friday_yet()
1_main
  Then I should be told "Nope"              # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.i_should_be_told(java.lang.String)

Scenario Outline: Today is or is not Friday # ro/agile_testing/hello_cucumber/is_it_friday_yet.feature:13
1_main
  Given today is "anything else!"           # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.today_is(java.lang.String)
1_main
  When I ask whether it's Friday yet        # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.i_ask_whether_it_s_Friday_yet()
1_main
  Then I should be told "Nope"              # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.i_should_be_told(java.lang.String)

Scenario: Today is Friday               # ro/agile_testing/hello_cucumber/is_it_something_special.feature:4
1_main
  Given today is "Friday"               # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.today_is(java.lang.String)
1_main
  When I ask whether it's a special day # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.iAskWhetherItSASpecialDay()
1_main
  Then I should be told "Nope"          # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.i_should_be_told(java.lang.String)

Scenario: Today is something special    # ro/agile_testing/hello_cucumber/is_it_something_special.feature:9
1_main
  Given today is "my birthday"          # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.today_is(java.lang.String)
1_main
  When I ask whether it's a special day # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.iAskWhetherItSASpecialDay()
1_main
  Then I should be told "TGIYBD"        # ro.agile_testing.hello_cucumber.step_defs.StepDefinitions.i_should_be_told(java.lang.String)
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.659 s - in ro.agile_testing.hello_cucumber.RunCucumberTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0
```