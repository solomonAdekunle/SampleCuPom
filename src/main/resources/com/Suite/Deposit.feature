Feature: Deposit
    User should be able to deposit after login 
    by clicking the Deposit button/
    

  
 
 # @ignore
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
   And I should see card expiray date in the cashier pop-up
   And I should see CVV input field in the cashier pop-up
   And I should see Promocode input text in the cashier pop-up
   And I should see Bill Address check box in the cashier pop-up
   And I should Amount To deposit in the cashier pop-up
   And I should see other amount input field in the cashier pop-up
   And I should see Deposit deposit button in the cashier pop-up
    
 Examples:  
 	|browser	| 
 	| Chrome	|
  
  
  
#  @Deposit
# Scenario Outline: Deposit
#  When I click  a  "Depositbutton"
# 	And I input "AmtDeposit" as "<amount>"
# 	And I enter "Cvv" as "<CvvNumber>"
# 	And I click "Deposit"
# Then deposit text should be displyed
# 
# Examples:
#   |amount	|CvvNumber	|
#   |  2		| 123		|
#   | 10000	|	123		|
#   |  10	| 		 	|
#   |  0		| 	123		|
#   | 10		|	123		|
# 
    