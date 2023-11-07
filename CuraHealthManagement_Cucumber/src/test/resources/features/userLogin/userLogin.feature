@tag
Feature: Patient able to Login into application 
As a patient i want to login user into application 

@smoke
Scenario Outline:

Given Patient navigate to login screen 
When Patient login with <username> and <password>
Then Patient click on Login Button
And Patient Naviagte to Home screen

Examples:
|username | password|
|John Doe |ThisIsNotAPassword|