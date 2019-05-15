#Author: your.email@your.domain.com

Feature: To test AddTariffPlans Functionality

  Scenario Outline: To test the Sucess Message
    Given The User is in Add Tariff Plan Page
    When  The User Fill in the Valid plan details "<MonthRent>","<FreeLocMins>","<FreeIntMins>","<FreeSMS>","<LocMinsCharges>","<IntMinsCharges>","<SMSCharges>"
    When The user click the Submit button
    Then The User Should See the Sucess Message

    Examples: 
      |MonthRent||FreeLocMins||FreeIntMins||FreeSMS||LocMinsCharges||IntMinsCharges||SMSCharges|
      |100|       |100|        |200|       |300|    |400|           |500|           |600|
      |200|       |200|        |200|       |400|    |600|           |600|           |800|     
      |300|       |300|        |300|       |500|    |800|           |700|           |1000|
      |400|       |400|        |400|       |600|    |1000|          |800|          |1200|
      
      
      
    Scenario: To test the form should cleare
    Given The User is in Add Tariff Plan Page
    When The user fill in the Tarff Plan details
    |MonthRent|100|
    |FreeLocMins|100|
    |FreeIntMins|200|
    |FreeSMS|300|
    |LocMinsCharges|400|
    |IntMinsCharges|500|
    |SMSCharges|600|
    When The user click the Reset button
    Then The user should see the Tarff Plan form cleare
    
    Scenario: To test the Tariff Plan details form not fill means show the Alert Message
    Given The User is in Add Tariff Plan Page
    When The user click the Submit button
    Then The user should see the Alert Message in Tariff Plan Page
    
    