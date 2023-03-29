Feature: Checking Lessons
  @Valid
  Scenario: Happy Scenario
    Given user go to the website
    And  user press on search icon
    And  user write lesson name and go to it
    And  click on the second lesson
    And  go to worksheet section then click on preview button
    Then work sheet open and count the number of questions appears