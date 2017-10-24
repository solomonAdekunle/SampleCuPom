#Feature: Deposit
#    User should be able to deposit after login 
#    by clicking the Deposit button/
#    
#
#  
## 
##@ignore
# @Deposit
#Scenario Outline:Deposit
#Given I navigate to the homepage on "<browser>"
# When I have logged in username as "safecharge7" and password "Bola123$%^"
#  And  I click a Depositbutton
#  Then I should see new cashier
#   And I should see  My Account Tab in the cashier pop-up
#   And I should see Deposit Tab in the cashier pop-up
#   And I should see Withdraw Tab in the casheir pop-up
#   And I should see  UsernameInfo as "SAFECHARGE7" 
#   And I should see Balance value in the cashier pop-up
#   And I should see  My Payments Methods text in the cashier pop
#   And I should see  Payment Details text in the cashier pop-up
#   And I should see payment logo in the cashier pop-up
#   And I should see other Payment Methods logo in the cashier pop-up
#   And I should see account creditcard ownername in the cashier pop-up
#   And I should see last4 digit card numbers as "6897"
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
## 
###@ignore
##  @DepositAppoved
##  Scenario: Checking if Success Cashier deposit pop-up will be displayed
##Given I navigate to the homepage on "<browser>"
##When I have logged in username as "Safecharge7" and password "Bola123$%^"
## And  I click a Depositbutton
## And I check My account Balance
## And I enter CVV as "275"
## And I enter Amount To Deposit as "200.12"
## And  I click a SafeChargeDepositbutton
##Then I should see Deposit Success Cashier Pop-up box displayed
## And I should see Your transaction was approved Text displayed
## And I should see CloseButton within the Success Cashier Pop-up box displayed
## And I should see my new Account Balance increase by "200.12"
##
# #@ignore
# @DepositAppoved
#Scenario: Closing the Success Cashier Pop-up box
#Given I navigate to the homepage on "browser"
#When I have logged in username as "SafeCharge7" and password "Bola123$%^"
# And  I click a Depositbutton
# And I enter CVV as "275"
# And I enter Amount To Deposit as "200.12"
# And  I click a SafeChargeDepositbutton
# And I click on CloseButton within the Success Cashier Pop-up box
# Then I should see no Deposit Success Cashier Pop-up box displayed.
# # And I click on Other Payment Methods Card Logo
#  
##  
##  
###@ignore
##  @RegisterNewCard
## Scenario: Verifying if expiration date will displayed error message when not  date month selected.
##Given I navigate to the homepage on "<browser>"
##When I have logged in username as "safecharge13" and password "Bola123"
## And  I click a Depositbutton
## And I click on Other Payment Methods Card Logo
## And I enter CardVisa Number as "4539219590667240"
## And I entry Expiry card month as ""
## And I enter Expiry card year as "2020"
## And  I click a SafeChargeDepositbutton
## Then I should see In Valid Expeiratin ErrorMessage displayed
## 
###@ignore
## @RegisterNewCard
## Scenario: Verifying if expiration date  will displayed error message when not  date year selected.
##Given I navigate to the homepage on "<browser>"
##When I have logged in username as "safecharge7" and password "Bola123$%^"
## And  I click a Depositbutton
## And I click on Other Payment Methods Card Logo
## And I enter CardVisa Number as "4539219590667240"
## And I entry Expiry card month as "06"
## And I enter Expiry card year as ""
## And  I click a SafeChargeDepositbutton
## Then I should see In Valid Expeiratin ErrorMessage displayed
## 
###@ignore
##@RegisterNewCard
##Scenario: Checking if CVV error message will be displayed when cvv text box is ommited or incompeleted
##Given I navigate to the homepage on "<browser>"
## When I have logged in username as "safecharge7" and password "Bola123$%^"
## And  I click a Depositbutton
## And I click on Other Payment Methods Card Logo
## And I enter CardVisa Number as "4539219590667240"
## And I entry Expiry card month as "06"
## And I enter Expiry card year as "2020"
## And I enter CVV as "1"
## And  I click a SafeChargeDepositbutton
## Then I should see The field must be exactly 3 digits ErrorMessage Text displayed
## 
##@ignore
##@RegisterNewCard
## Scenario: Checking if Enter amount to deposit  will display error text if user enter amount less than 5
##Given I navigate to the homepage on "<browser>"
##When I have logged in username as "safecharge13" and password "Bola123"
## And  I click a Depositbutton
## And I click on Other Payment Methods Card Logo
##  And I enter CardVisa Number as "4539219590667240"
##  And I entry Expiry card month as "06"
##  And I enter Expiry card year as "2020"
##  And I enter CVV as "123"
##  And I enter Amount To Deposit as "2"
##  And  I click a SafeChargeDepositbutton
##  Then I should  Please Enter Valid ammount errorText displayed
##
## @ignore 
##  @RegisterNewCard   
##Scenario: Checking the Green thick Validation mark
##Given I navigate to the homepage on "<browser>"
##When I have logged in username as "safecharge7" and password "Bola123$%^"
## And  I click a Depositbutton
## And I click on Other Payment Methods Card Logo
## And I enter CardVisa Number as "4539219590667240"
## And I entry Expiry card month as "06"
## And I enter Expiry card year as "2020"
## And I enter CVV as "123"
## And I enter Amount To Deposit as "10"
##Then I should see Green tick mark next to CardOwnerNametext box
##And  I should see Green tick mark next to CardNumberbox box
##And  I should see Green tick mark next to CardCVVtext box
##And  I should see Green tick mark next to CardCVVtext box
##And  I should see a Green tick Mark next to EnterAmounttext box
## 
## @ignore
##  @RegisterNewCard   
##Scenario: Existing User should be able to register a new card
##Given I navigate to the homepage on "<browser>"
##When  I have logged in username as "safecharge7" and password "Bola123$%^"
## And  I click a Depositbutton
## And  I click on Other Payment Methods Card Logo
## And  I enter CardVisa Number as "42650365 3784 6897"
## And  I entry Expiry card month as "06"
## And  I enter Expiry card year as "2020"
## And  I enter CVV as "572"
## And  I enter Amount To Deposit as "200.12"  
## And  I click a SafeChargeDepositbutton
##Then  I should see Your transaction was approved Text displayed
## And  I should see CloseButton within the Success Cashier Pop-up box displayed
## And  I should see my new Account Balance increase by "200.12"
##
##  
###@ignore
###  @DepositAppoved
### Scenario: Checking if  user can change his or her billing address
###Given I navigate to the homepage on "<browser>"
### When I have logged in username as "safecharge7" and password "Bola123$%^"
###  And I click a Depositbutton
###  And  I enter CVV as "275"
###  And  I enter Amount To Deposit as "200.12"  
###  And I click on Change Billing Address Check Box
###  And I enter Post code as "Cr0 6jx"
###  And I enter House address as "6 Goodhew Road"
###  And I click on Change Billing Address Check Box
###  And  I click a SafeChargeDepositbutton
###  And I click on CloseButton within the Success Cashier Pop-up box
###  And I click on close Icon of the Cashier
###  And I click a Depositbutton
###  And I click on Change Billing Address Check Box
### Then  I should  see new Post code as "Cr0 6jx" displayed
###  And I should see  House address as "6 Goodhew Road"
###  
###@ignore
###   @DepositAppoved
### Scenario: Checking if Decline Recovery lightbox is displayed when user deposit unsucessful
###Given I navigate to the homepage on "<browser>"
###When I have logged in username as "safecharge7" and password "Bola123$%^"
### And  I click a Depositbutton
### And I click on Other Payment Methods Card Logo
### And I enter CardVisa Number as "51010830 5421 5127"
###  And I entry Expiry card month as "05"
###  And I enter Expiry card year as "2019"
###  And I enter CVV as "101"
###  And I enter Amount To Deposit as "10"
###  And I click a SafeChargeDepositbutton
###  Then I should see Decline Pop-up box displayed
###  And I should see Your Transaction decline text displayed
###  And I should see Contact Support Number displayed 
###  And I should see a close icon displayed
###  
###
###
###
###
###
###
###
####
####
####
#####Credit Card Visa On production
####
#####42650300 3535 6897, 2019/10, 230, Visa - Barclays Bank Plc, UK (Gold)
#####42650367 5555 6897, 2019/04, 170, Visa - Barclays Bank Plc, UK (Gold)
#####42650376 5786 6897, 2019/10, 472, Visa - Barclays Bank Plc, UK (Gold)
#####42650365 0285 6897, 2020/11, 818, Visa - Barclays Bank Plc, UK (Gold)
#####42650365 3784 6897, 2020/10, 572, Visa - Barclays Bank Plc, UK (Gold)
#####42650304 1014 6897, 2019/12, 647, Visa - Barclays Bank Plc, UK (Gold)
#####42650338 3861 6897, 2019/03, 558, Visa - Barclays Bank Plc, UK (Gold)
#####42650341 8071 6897, 2019/12, 696, Visa - Barclays Bank Plc, UK (Gold)
#####42650345 0058 6897, 2020/07, 148, Visa - Barclays Bank Plc, UK (Gold)
####
####
############################################################################
#####New One Generated in July
###########################################################################
#####4265 0348 7571 6897, 2020/11, 251, Visa - Barclays Bank Plc, UK (Gold)
#####4265 0380 2134 6897, 2020/07, 568, Visa - Barclays Bank Plc, UK (Gold)
#####4265 0305 8380 6897, 2019/05, 894, Visa - Barclays Bank Plc, UK (Gold)
#####4265 0302 4572 6897, 2019/01, 379, Visa - Barclays Bank Plc, UK (Gold)
#####4265 0376 1835 6897, 2019/02, 509, Visa - Barclays Bank Plc, UK (Gold)
#####4265 0352 8754 6897, 2019/07, 622, Visa - Barclays Bank Plc, UK (Gold)
#####4265 0310 0620 6897, 2019/02, 320, Visa - Barclays Bank Plc, UK (Gold)
#####4265 0382 1738 6897, 2019/10, 249, Visa - Barclays Bank Plc, UK (Gold)
#####4265 0300 4566 6897, 2019/04, 790, Visa - Barclays Bank Plc, UK (Gold)
#####4265 0321 5816 6897, 2019/06, 826, Visa - Barclays Bank Plc, UK (Gold)
#####4265 0347 7846 6897, 2020/04, 279, Visa - Barclays Bank Plc, UK (Gold)
#####4265 0381 7165 6897, 2019/02, 828, Visa - Barclays Bank Plc, UK (Gold)
#####4265 0366 3858 6897, 2020/03, 165, Visa - Barclays Bank Plc, UK (Gold)
#####4265 0326 8021 6897, 2019/09, 968, Visa - Barclays Bank Plc, UK (Gold)
#####4265 0340 0251 6897, 2020/08, 586, Visa - Barclays Bank Plc, UK (Gold)
#####4265 0331 6127 6897, 2019/02, 454, Visa - Barclays Bank Plc, UK (Gold)
#####4265 0388 1724 6897, 2019/11, 871, Visa - Barclays Bank Plc, UK (Gold)
#####4265 0345 6253 6897, 2019/03, 411, Visa - Barclays Bank Plc, UK (Gold)
#####4265 0307 6127 6897, 2019/10, 970, Visa - Barclays Bank Plc, UK (Gold)
#####4265 0353 0800 6897, 2019/12, 419, Visa - Barclays Bank Plc, UK (Gold)
#####4265 0375 4855 6897, 2020/02, 945, Visa - Barclays Bank Plc, UK (Gold)
#####4265 0342 4756 6897, 2019/11, 124, Visa - Barclays Bank Plc, UK (Gold)
#####4265 0331 0237 6897, 2019/05, 794, Visa - Barclays Bank Plc, UK (Gold)
#####4265 0345 5255 6897, 2019/12, 423, Visa - Barclays Bank Plc, UK (Gold)
#####4265 0315 8420 6897, 2019/02, 572, Visa - Barclays Bank Plc, UK (Gold)
#####4265 0340 0863 6897, 2020/09, 572, Visa - Barclays Bank Plc, UK (Gold)
#####4265 0365 3354 6897, 2020/08, 673, Visa - Barclays Bank Plc, UK (Gold)
#####4265 0316 5300 6897, 2020/05, 445, Visa - Barclays Bank Plc, UK (Gold)
#####4265 0304 8100 6897, 2019/01, 953, Visa - Barclays Bank Plc, UK (Gold)
#####4265 0374 3387 6897, 2019/07, 183, Visa - Barclays Bank Plc, UK (Gold)
