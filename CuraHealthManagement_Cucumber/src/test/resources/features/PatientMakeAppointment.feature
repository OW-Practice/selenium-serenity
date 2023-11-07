Feature: User able to book appointment on current date 

As user i want to book appointment with current login user 

Background:

Given Patient navigate to login screen 


Scenario Outline: User able to book appointment 

When Patient login with <username> and <password>

Then Patient click on Login Button

And Patient Naviagte to Home screen

Then Patient select the required date from calendar 

And Patient add his <Comment> into Comment box

And Patient Will Click on Book Appointment 

Then Patient Navigate to Appointment Confirmation Page

Examples:


|username |password           |Comment |
|John Doe |ThisIsNotAPassword |Hello optimworks world |
