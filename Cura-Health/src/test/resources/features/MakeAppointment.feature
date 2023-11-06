Feature: Make a appoint
  user wnats to create appointment

  Scenario: user wants to make appoint
    Given user is on home page
    When user enter admin as username
    Then user enter asdf as password
    And user should be able to login
    Then user wants to verify the make oppintment page displayed
    When user select the facility type
    Then user check the apply for hospital readmission
    Then user wants to select healthcare program is none
    Then user enter the visit date
    Then user wants to enter the discription in comment
    And user click on make appoint button
