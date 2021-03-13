@copy @both
Feature: Is it a special day yet?
  Everybody wants to know when it's my birthday

  Scenario: Today is Friday
    Given today is "Friday"
    When I ask whether it's a special day
    Then I should be told "Nope"

  Scenario: Today is something special
    Given today is "my birthday"
    When I ask whether it's a special day
    Then I should be told "TGIYBD"
