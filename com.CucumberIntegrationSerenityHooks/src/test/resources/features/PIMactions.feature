Feature: OrangeHRM PIM module
  User creates a new employee in PIM module

  Scenario Outline: User actions while creating new employee
    Given user click on PIM module
    When user click on Add button
    And user enter data into the fields <firstname> and <middlename> and <lastname> and <employeeid>
      | firstname |  | middlename |  | lastname |  | employeeid |
      | Amarendra |  | bahu       |  | bali     |  |      15786 |
    And user click on Create login details button with <NewUsername> and <NewPassword> and <Confirmpassword>
    Then user click on Save button

    Examples: 
      | NewUsername |  | NewPassword |  | Confirmpassword |
      | Amar bb     |  | Amarbb15786 |  | Amarbb15786     |
