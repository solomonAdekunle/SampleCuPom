Feature: Other Payment Method
         As a user i should be able to deposit with other payment Methods such
         as PayPal, Netteller, Skrill, PaySafe.
         
         
   @ignore   
   @Deposit
 Scenario: Checking Netteller is displayed as a means of other payment
Given I navigate to the homepage on "<browser>"
 When I have logged in username as "safecharge7" and password "Bola123"
  And  I click a Depositbutton
  And I click on Neteller