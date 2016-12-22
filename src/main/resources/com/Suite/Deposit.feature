Feature: Deposit
    User should be able to deposit after login 
    by clicking the Deposit button/
    

  
 
  #@ignore
 @Deposit
 Scenario Outline:Deposit
Given I navigate to the homepage on "<browser>"
 When I have logged in username as "safecharge1" and password "Bola123"
  And  I click a Depositbutton
  Then I should see new cashier
   And I should see  My Account Tab in the cashier pop-up
   And I should see Deposit Tab in the cashier pop-up
   And I should see Withdraw Tab in the casheir pop-up
   And I should see  UsernameInfo as "SAFECHARGE1" 
   And I should see Balance value in the cashier pop-up
   And I should see  My Payments Methods text in the cashier pop
   And I should see  Payment Details text in the cashier pop-up
   And I should see payment logo in the cashier pop-up
   And I should see other Payment Methods logo in the cashier pop-up
   And I should see account creditcard ownername in the cashier pop-up
   And I should see last4 digit card numbers as "6614"
   And I should see card expiry date in the cashier pop-up
   And I should see CVV input field in the cashier pop-up
   And I should see Promocode input text in the cashier pop-up
   And I should see Bill Address check box in the cashier pop-up
   And I should Amount To deposit in the cashier pop-up
   And I should see other amount input field in the cashier pop-up
   And I should see Deposit deposit button in the cashier pop-up
    
 Examples:  
 	|browser	| 
 	| Chrome	|
  
 
  @DepositAppoved
  Scenario: Checking if Success Cashier deposit pop-up 
Given I navigate to the homepage on "<browser>"
When I have logged in username as "safecharge1" and password "Bola123"
 And  I click a Depositbutton
 And I enter CVV as "123"
 And I enter Amount To Deposit as "10"
 And  I click a SafeChargeDepositbutton
Then I should see Deposit Success Cashier Pop-up box displayed
 And I should see Your transaction was approved Text displayed
 And I should see CloseButton within the Success Cashier Pop-up box displayed
 And I should see my new Account Balance increase by "10"
  
 @DepositAppoved
 Scenario: Closing the Success Cashier Pop-up box
Given I navigate to the homepage on "<browser>"
When I have logged in username as "safecharge1" and password "Bola123"
 And  I click a Depositbutton
 And I enter CVV as "123"
 And I enter Amount To Deposit as "10"
 And  I click a SafeChargeDepositbutton
 And I click on CloseButton within the Success Cashier Pop-up box
 Then I should see no Deposit Success Cashier Pop-up box displayed.
  
  
  @DepositAppoved
 Scenario: Checking if Success Cashier deposit pop-up 
 Given I navigate to the homepage on "<browser>"
 When I have logged in username as "safecharge1" and password "Bola123"
  And I click a Depositbutton
    