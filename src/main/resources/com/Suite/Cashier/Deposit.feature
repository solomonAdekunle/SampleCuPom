#Feature: Deposit
#    User should be able to deposit after login 
#    by clicking the Deposit button/
#    
#
#  
# 
#   
# @Deposit
#Scenario: Deposit
#Given I navigate to the homepage on <browser>
# When I have logged in username as "solomon2014" and password "London01"
#  And  I click a "Depositbutton"
#   And I switch to the cashier
#   Then I should see new cashier
#   And I should see  My Account Tab
#   And I should see Deposit Tab
#   And I should see Withdraw Tab
#   And I should see "username" 
#   And I should see Balance 
#   And I should see  My Payments Methods text
#   And I should see  Payment Details text
#   And I should see payment logo
#   And I should see other Payment Methods logo
#   And I should see account creditcard ownername
#   And I should see last4 digit card numbers
#   And I should see card expiray date
#   And I should see CVV input field
#   And I should see Promocode input tex
#   And I should see Bill Address check box
#   And I should Amount To deposit 
#   And I should see other amount input field
#   And I should see Deposit deposit button
#    
# 
#  
#  
#  
##  @Deposit
## Scenario Outline: Deposit
##  When I click  a  "Depositbutton"
## 	And I input "AmtDeposit" as "<amount>"
## 	And I enter "Cvv" as "<CvvNumber>"
## 	And I click "Deposit"
## Then deposit text should be displyed
## 
## Examples:
##   |amount	|CvvNumber	|
##   |  2		| 123		|
##   | 10000	|	123		|
##   |  10	| 		 	|
##   |  0		| 	123		|
##   | 10		|	123		|
## 
#    