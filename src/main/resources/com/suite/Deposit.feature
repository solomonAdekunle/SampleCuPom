Feature: Deposit
    User should be able to deposit after login 
    by clicking the Deposit button/
    

  
 
  @ignore
 @Deposit
 Scenario Outline:Deposit
Given I navigate to the homepage on "<browser>"
 When I have logged in username as "safecharge7" and password "Bola123"
  And  I click a Depositbutton
  Then I should see new cashier
   And I should see  My Account Tab in the cashier pop-up
   And I should see Deposit Tab in the cashier pop-up
   And I should see Withdraw Tab in the casheir pop-up
   And I should see  UsernameInfo as "SAFECHARGE7" 
   And I should see Balance value in the cashier pop-up
   And I should see  My Payments Methods text in the cashier pop
   And I should see  Payment Details text in the cashier pop-up
   And I should see payment logo in the cashier pop-up
   And I should see other Payment Methods logo in the cashier pop-up
   And I should see account creditcard ownername in the cashier pop-up
   And I should see last4 digit card numbers as "6897"
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
 
 @ignore
  @DepositAppoved
  Scenario: Checking if Success Cashier deposit pop-up will be displayed
Given I navigate to the homepage on "<browser>"
When I have logged in username as "Safecharge7" and password "Bola123"
 And  I click a Depositbutton
 And I check My account Balance
 And I enter CVV as "275"
 And I enter Amount To Deposit as "200.12"
 And  I click a SafeChargeDepositbutton
Then I should see Deposit Success Cashier Pop-up box displayed
 And I should see Your transaction was approved Text displayed
 And I should see CloseButton within the Success Cashier Pop-up box displayed
 And I should see my new Account Balance increase by "200.12"
# 
  @ignore
 @DepositAppoved
 Scenario: Closing the Success Cashier Pop-up box
Given I navigate to the homepage on "<browser>"
When I have logged in username as "SafeCharge13" and password "Bola123"
 And  I click a Depositbutton
# And I click on Other Payment Methods Card Logo
 And I enter CVV as "275"
 And I enter Amount To Deposit as "200.12"
 And  I click a SafeChargeDepositbutton
 And I click on CloseButton within the Success Cashier Pop-up box
 Then I should see no Deposit Success Cashier Pop-up box displayed.
  
  
  
  @ignore
  @RegisterNewCard
 Scenario: Verifying if expiration date will displayed error message when not  date month selected.
Given I navigate to the homepage on "<browser>"
When I have logged in username as "safecharge13" and password "Bola123"
 And  I click a Depositbutton
 And I click on Other Payment Methods Card Logo
 And I enter CardVisa Number as "4539219590667240"
 And I entry Expiry card month as ""
 And I enter Expiry card year as "2020"
 And  I click a SafeChargeDepositbutton
 Then I should see In Valid Expeiratin ErrorMessage displayed
 
@ignore
 @RegisterNewCard
 Scenario: Verifying if expiration date  will displayed error message when not  date year selected.
Given I navigate to the homepage on "<browser>"
When I have logged in username as "safecharge7" and password "Bola123"
 And  I click a Depositbutton
 And I click on Other Payment Methods Card Logo
 And I enter CardVisa Number as "4539219590667240"
 And I entry Expiry card month as "06"
 And I enter Expiry card year as ""
 And  I click a SafeChargeDepositbutton
 Then I should see In Valid Expeiratin ErrorMessage displayed
 
 @ignore
  @RegisterNewCard
Scenario: Checking if CVV error message will be displayed when cvv text box is ommited or incompeleted
Given I navigate to the homepage on "<browser>"
 When I have logged in username as "safecharge7" and password "Bola123"
 And  I click a Depositbutton
 And I click on Other Payment Methods Card Logo
 And I enter CardVisa Number as "4539219590667240"
 And I entry Expiry card month as "06"
 And I enter Expiry card year as "2020"
 And I enter CVV as "1"
 And  I click a SafeChargeDepositbutton
 Then I should see The field must be exactly 3 digits ErrorMessage Text displayed
 
 @ignore
@RegisterNewCard
 Scenario: Checking if Enter amount to deposit  will display error text if user enter amount less than 5
Given I navigate to the homepage on "<browser>"
When I have logged in username as "safecharge13" and password "Bola123"
 And  I click a Depositbutton
 And I click on Other Payment Methods Card Logo
  And I enter CardVisa Number as "4539219590667240"
  And I entry Expiry card month as "06"
  And I enter Expiry card year as "2020"
  And I enter CVV as "123"
  And I enter Amount To Deposit as "2"
  And  I click a SafeChargeDepositbutton
  Then I should  Please Enter Valid ammount errorText displayed

 @ignore 
  @RegisterNewCard   
Scenario: Checking the Green thick Validation mark
Given I navigate to the homepage on "<browser>"
When I have logged in username as "safecharge7" and password "Bola123"
 And  I click a Depositbutton
 And I click on Other Payment Methods Card Logo
 And I enter CardVisa Number as "4539219590667240"
 And I entry Expiry card month as "06"
 And I enter Expiry card year as "2020"
 And I enter CVV as "123"
 And I enter Amount To Deposit as "10"
Then I should see Green tick mark next to CardOwnerNametext box
And  I should see Green tick mark next to CardNumberbox box
And  I should see Green tick mark next to CardCVVtext box
And  I should see Green tick mark next to CardCVVtext box
And I should see a Green tick Mark next to EnterAmounttext box
 
 @ignore
   @RegisterNewCard   
Scenario: Existing User should be able to register a new card
Given I navigate to the homepage on "<browser>"
When I have logged in username as "safecharge7" and password "Bola123"
 And  I click a Depositbutton
 And I click on Other Payment Methods Card Logo
 And I enter CardVisa Number as "42650365 3784 6897"
 And I entry Expiry card month as "06"
 And I enter Expiry card year as "2020"
 And I enter CVV as "572"
 And I enter Amount To Deposit as "200.12"  
 And  I click a SafeChargeDepositbutton
 Then  I should see Deposit Success Cashier Pop-up box displayed
 And I should see Your transaction was approved Text displayed
 And I should see CloseButton within the Success Cashier Pop-up box displayed
 And I should see my new Account Balance increase by "200.12"

  
 @ignore
  @DepositAppoved
 Scenario: Checking if  user can change his or her billing address
 Given I navigate to the homepage on "<browser>"
 When I have logged in username as "safecharge7" and password "Bola123"
  And I click a Depositbutton
  And I click on Change Billing Address Check Box
  And I enter Post code as "Cr0 6jx"
  And I enter House address as "6 Goodhew Road"
  And I click on Change Billing Address Check Box
  And I click on close Icon of the Cashier
  And I click a Depositbutton
  And I click on Change Billing Address Check Box
  Then I should  see new Post code as "Cr0 6jx" displayed
  And I should see  House address as "6 Goodhew Road"
  
@ignore
   @DepositAppoved
 Scenario: Checking if Decline Recovery lightbox is displayed when user deposit unsucessful
Given I navigate to the homepage on "<browser>"
When I have logged in username as "safecharge7" and password "Bola123"
 And  I click a Depositbutton
 And I click on Other Payment Methods Card Logo
 And I enter CardVisa Number as "51010830 5421 5127"
  And I entry Expiry card month as "05"
  And I enter Expiry card year as "2019"
  And I enter CVV as "101"
  And I enter Amount To Deposit as "10"
  And I click a SafeChargeDepositbutton
  Then I should see Decline Pop-up box displayed
  And I should see Your Transaction decline text displayed
  And I should see Contact Support Number displayed 
  And I should see a close icon displayed
  










#Credit Card Visa On production

#42650314 4370 6897, 2019/06, 275, Visa - Barclays Bank Plc, UK (Gold)
#42650300 3535 6897, 2019/10, 230, Visa - Barclays Bank Plc, UK (Gold)
#42650367 5555 6897, 2019/04, 170, Visa - Barclays Bank Plc, UK (Gold)
#42650376 5786 6897, 2019/10, 472, Visa - Barclays Bank Plc, UK (Gold)
#42650365 0285 6897, 2020/11, 818, Visa - Barclays Bank Plc, UK (Gold)
#42650365 3784 6897, 2020/10, 572, Visa - Barclays Bank Plc, UK (Gold)
#42650304 1014 6897, 2019/12, 647, Visa - Barclays Bank Plc, UK (Gold)
#42650338 3861 6897, 2019/03, 558, Visa - Barclays Bank Plc, UK (Gold)
#42650341 8071 6897, 2019/12, 696, Visa - Barclays Bank Plc, UK (Gold)
#42650345 0058 6897, 2020/07, 148, Visa - Barclays Bank Plc, UK (Gold)

# Credit Card Master card on Demo

#53333050 0073 8765, 2020/11, 887, MasterCard
#53333018 4048 5105, 2020/06, 772, MasterCard
#53333047 2570 2081, 2019/03, 606, MasterCard
#53333015 1687 5316, 2020/03, 709, MasterCard
#53333006 0661 6655, 2020/06, 108, MasterCard
#53333007 0478 4231, 2019/04, 290, MasterCard
#53333043 4252 3811, 2020/02, 548, MasterCard
#53333007 8155 2428, 2019/08, 929, MasterCard
#53333024 4045 4863, 2019/09, 877, MasterCard
#53333084 5228 4163, 2019/10, 826, MasterCard







#5333 3043 4466 4217
#  Visa CC
#40214641 5751 3370, 2019/05, 747, unknown
#40214626 5675 2648, 2019/10, 318, unknown
#40214634 6223 5877, 2020/11, 907, unknown
#40214618 3171 2584, 2020/02, 186, unknown
#40214641 0570 4758, 2019/09, 361, unknown
#40214646 4532 6021, 2019/12, 286, unknown
#40214612 3548 4285, 2019/08, 597, unknown
#40214622 8476 4510, 2020/11, 757, unknown
#40214686 2531 1812, 2020/11, 155, unknown
#40214660 6417 2828, 2020/12, 580, unknown

#Master Card
#51010876 8621 0851, 2019/05, 395, MasterCard
#51010830 5421 5127, 2019/05, 101, MasterCard
#51010827 1445 7376, 2019/02, 991, MasterCard
#51010834 5113 2453, 2019/11, 931, MasterCard
#51010888 2544 7271, 2019/05, 264, MasterCard
#51010884 0386 1331, 2020/12, 553, MasterCard
#51010803 1222 8785, 2019/02, 410, MasterCard
#51010820 5746 7446, 2020/05, 413, MasterCard
#51010805 1154 0105, 2020/06, 223, MasterCard
#51010803 5538 5468, 2019/11, 949, MasterCard
# 

#  