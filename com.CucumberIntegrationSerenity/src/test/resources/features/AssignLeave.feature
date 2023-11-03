Feature: OrangeHRM Leave module
  User apply leave for the employee who is created under PIM module

  Scenario Outline: User actions while applying leave for existing employee
    Given user click on Leave module
    When user click on Assign Leave footer menu 
    And user enter data into the fields <Employee Name> and <Leave Type> 
      |Employee Name| |Leave Type|
      |Amarendra|  |bahu| 
    And user enter data into the fields <From Date> and <To Date> and <Comments>
    Then user click on Assign button

    Examples: 
      |Comments| 
      |Applying for sick leave|
