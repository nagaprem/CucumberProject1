#Author: your.email@your.domain.com

Feature: To test addCustomer Functionality

   Scenario: To test the Customerid genereted for Valid Customer
    Given The user is in add customer page
    When The user fill in the valid customer details
    |firstName|test|
    |lastName|selenium|
    |email|test@gmail.com|
    |address|Solinghanallur|
    |phoneNo|1234567890|
    When The user click the Submit button
    Then The user should see the customer id generated
 
    Scenario: To test the Customer details form should cleare
    Given The user is in add customer page
    When The user fill in the valid customer details
    |firstName|test|
    |lastName|selenium|
    |email|test@gmail.com|
    |address|Solinghanallur|
    |phoneNo|1234567890|
    When The user click the Reset button
    Then The user should see the form cleare
 
    Scenario: To test the Customer details form not fill means show the Alert Message
    Given The user is in add customer page
    When The user click the Submit button
    Then The user should see the Alert Message
   