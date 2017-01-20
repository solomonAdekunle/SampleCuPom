Feature: Deposit
    User should be able to deposit after login 
    by clicking the Deposit button/
    

  
 
  #@ignore
# @Deposit
# Scenario Outline:Deposit
#Given I navigate to the homepage on "<browser>"
# When I have logged in username as "safecharge1" and password "Bola123"
#  And  I click a Depositbutton
#  Then I should see new cashier
#   And I should see  My Account Tab in the cashier pop-up
#   And I should see Deposit Tab in the cashier pop-up
#   And I should see Withdraw Tab in the casheir pop-up
#   And I should see  UsernameInfo as "SAFECHARGE1" 
#   And I should see Balance value in the cashier pop-up
#   And I should see  My Payments Methods text in the cashier pop
#   And I should see  Payment Details text in the cashier pop-up
#   And I should see payment logo in the cashier pop-up
#   And I should see other Payment Methods logo in the cashier pop-up
#   And I should see account creditcard ownername in the cashier pop-up
#   And I should see last4 digit card numbers as "6614"
#   And I should see card expiry date in the cashier pop-up
#   And I should see CVV input field in the cashier pop-up
#   And I should see Promocode input text in the cashier pop-up
#   And I should see Bill Address check box in the cashier pop-up
#   And I should Amount To deposit in the cashier pop-up
#   And I should see other amount input field in the cashier pop-up
#   And I should see Deposit deposit button in the cashier pop-up
#    
# Examples:  
# 	|browser	| 
# 	| Chrome	|
#  
 
#  @DepositAppoved
#  Scenario: Checking if Success Cashier deposit pop-up 
#Given I navigate to the homepage on "<browser>"
#When I have logged in username as "safecharge1" and password "Bola123"
# And  I click a Depositbutton
# And I enter CVV as "123"
# And I enter Amount To Deposit as "10"
# And  I click a SafeChargeDepositbutton
#Then I should see Deposit Success Cashier Pop-up box displayed
# And I should see Your transaction was approved Text displayed
# And I should see CloseButton within the Success Cashier Pop-up box displayed
# And I should see my new Account Balance increase by "10"
  
# @DepositAppoved
# Scenario: Closing the Success Cashier Pop-up box
#Given I navigate to the homepage on "<browser>"
#When I have logged in username as "safecharge1" and password "Bola123"
# And  I click a Depositbutton
# And I click on Other Payment Methods Card Logo
# And I enter CVV as "123"
# And I enter Amount To Deposit as "10"
# And  I click a SafeChargeDepositbutton
# And I click on CloseButton within the Success Cashier Pop-up box
# Then I should see no Deposit Success Cashier Pop-up box displayed.
  
  
  
  
#  @RegisterNewCard
# Scenario: Verifying if expiration date will displayed error message when not  date month selected.
#Given I navigate to the homepage on "<browser>"
#When I have logged in username as "safecharge1" and password "Bola123"
# And  I click a Depositbutton
# And I click on Other Payment Methods Card Logo
# And I enter CardVisa Number as "4539219590667240"
# And I entry Expiry card month as ""
# And I enter Expiry card year as "2020"
# And  I click a SafeChargeDepositbutton
# Then I should see In Valid Expeiratin ErrorMessage displayed
# 
# @RegisterNewCard
# Scenario: Verifying if expiration date  will displayed error message when not  date year selected.
#Given I navigate to the homepage on "<browser>"
#When I have logged in username as "safecharge1" and password "Bola123"
# And  I click a Depositbutton
# And I click on Other Payment Methods Card Logo
# And I enter CardVisa Number as "4539219590667240"
# And I entry Expiry card month as "06"
# And I enter Expiry card year as ""
# And  I click a SafeChargeDepositbutton
# Then I should see In Valid Expeiratin ErrorMessage displayed
# 
#  @RegisterNewCard
#Scenario: Checking if CVV error message will be displayed when cvv text box is ommited or incompeleted
#Given I navigate to the homepage on "<browser>"
# When I have logged in username as "safecharge1" and password "Bola123"
# And  I click a Depositbutton
# And I click on Other Payment Methods Card Logo
# And I enter CardVisa Number as "4539219590667240"
# And I entry Expiry card month as "06"
# And I enter Expiry card year as "2020"
# And I enter CVV as "1"
# And  I click a SafeChargeDepositbutton
# Then I should see The field must be exactly 3 digits ErrorMessage Text displayed
# 
#@RegisterNewCard
# Scenario: Checking if Enetr amout to deposit  will display error text if user enter amount less than 5
#Given I navigate to the homepage on "<browser>"
#When I have logged in username as "safecharge1" and password "Bola123"
# And  I click a Depositbutton
# And I click on Other Payment Methods Card Logo
#  And I enter CardVisa Number as "4539219590667240"
#  And I entry Expiry card month as "06"
#  And I enter Expiry card year as "2020"
#  And I enter CVV as "123"
#  And I enter Amount To Deposit as "2"
#  And  I click a SafeChargeDepositbutton
#  Then I should  Please Enter Valid ammount errorText displayed
#
#  
#  @RegisterNewCard   
#Scenario: Checking the Green thick Validation mark
#Given I navigate to the homepage on "<browser>"
#When I have logged in username as "safecharge1" and password "Bola123"
# And  I click a Depositbutton
# And I click on Other Payment Methods Card Logo
# And I enter CardVisa Number as "4539219590667240"
# And I entry Expiry card month as "06"
# And I enter Expiry card year as "2020"
# And I enter CVV as "123"
# And I enter Amount To Deposit as "10"
#Then I should see Green tick mark next to CardOwnerNametext box
#And  I should see Green tick mark next to CardNumberbox box
#And  I should see Green tick mark next to CardCVVtext box
#And  I should see Green tick mark next to CardCVVtext box
#And I should see a Green tick Mark next to EnterAmounttext box
#  
#  
#   @RegisterNewCard   
#Scenario: Existing User should be able to register a new card
#Given I navigate to the homepage on "<browser>"
#When I have logged in username as "safecharge1" and password "Bola123"
# And  I click a Depositbutton
# And I click on Other Payment Methods Card Logo
# And I enter CardVisa Number as "4539219590667240"
# And I entry Expiry card month as "06"
# And I enter Expiry card year as "2020"
# And I enter CVV as "123"
# And I enter Amount To Deposit as "10"  
# And  I click a SafeChargeDepositbutton
# Then  I should see Deposit Success Cashier Pop-up box displayed
# And I should see Your transaction was approved Text displayed
# And I should see CloseButton within the Success Cashier Pop-up box displayed
#  
#  
#  
#  
  
#  
#  @DepositAppoved
# Scenario: Checking if  user can change his or her billing address
# Given I navigate to the homepage on "<browser>"
# When I have logged in username as "safecharge1" and password "Bola123"
#  And I click a Depositbutton
#  And I click on Change Billing Address Check Box
#  And I enter Post code as "Cr0 6jx"
#  And I enter House address as "6 Goodhew Road"
#  And I click on Change Billing Address Check Box
#  And I click on close Icon of the Cashier
#  And I click a Depositbutton
#  And I click on Change Billing Address Check Box
#  Then I should  see new Post code as "Cr0 6jx" displayed
#  And I should see  House address as "6 Goodhew Road"
#  
  
#   @DepositAppoved
# Scenario: Checking if Decline Recovery lightbox is displayed when user deposit unsucessful
#Given I navigate to the homepage on "<browser>"
#When I have logged in username as "safecharge2" and password "Bola123"
# And  I click a Depositbutton
# And I enter CardVisa Number as "5333 3043 4466 4217"
#  And I entry Expiry card month as "06"
#  And I enter Expiry card year as "2020"
#  And I enter CVV as "123"
#  And I enter Amount To Deposit as "10"
#  And I click a SafeChargeDepositbutton
#  Then I should see Decline Pop-up box displayed
#  And I should see Your Transaction decline text displayed
#  And I should see Contact Support Number displayed 
#  And I should see a close icon displayed