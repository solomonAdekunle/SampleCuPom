Feature: As a new user i should be able to register  valid my card in other to make deposit.


@ignore
@RegisterNewCard
Scenario: Register an incomplete  credit card number will displayed error message 
Given I navigate to the homepage on "<browser>"
 When I have logged in username as "safecharge2" and password "Bola123"
  And  I click a Depositbutton
  And I enter CardVisa Number as "45392195906672"
  And  I click a SafeChargeDepositbutton
 Then I should see InaValidCardErrorMessage displayed
 
@ignore
 @RegisterNewCard
Scenario: Register an invalid credit card number will displayed error message 
Given I navigate to the homepage on "<browser>"
 When I have logged in username as "safecharge2" and password "Bola123"
  And  I click a Depositbutton
  And I enter CardVisa Number as "1111111111111116"
  And  I click a SafeChargeDepositbutton
 Then I should see InaValidCardErrorMessage displayed
  
@ignore
 @RegisterNewCard
 Scenario: Verifying if expiration date will displayed error message when not  date month selected.
Given I navigate to the homepage on "<browser>"
When I have logged in username as "safecharge2" and password "Bola123"
 And  I click a Depositbutton
 And I enter CardVisa Number as "4539219590667240"
 And I entry Expiry card month as ""
 And I enter Expiry card year as "2020"
 And  I click a SafeChargeDepositbutton
 Then I should see In Valid Expeiratin ErrorMessage displayed
 
 @ignore
 @RegisterNewCard
 Scenario: Verifying if expiration date  will displayed error message when not  date year selected.
Given I navigate to the homepage on "<browser>"
When I have logged in username as "safecharge2" and password "Bola123"
 And  I click a Depositbutton
 And I enter CardVisa Number as "4539219590667240"
 And I entry Expiry card month as "06"
 And I enter Expiry card year as ""
 And  I click a SafeChargeDepositbutton
 Then I should see In Valid Expeiratin ErrorMessage displayed
@ignore
  @RegisterNewCard
Scenario: Checking if CVV error message will be displayed when cvv text box is ommited or incompeleted
Given I navigate to the homepage on "<browser>"
 When I have logged in username as "safecharge2" and password "Bola123"
 And  I click a Depositbutton
 And I enter CardVisa Number as "4539219590667240"
 And I entry Expiry card month as "06"
   And I enter Expiry card year as "2020"
   And I enter CVV as "1"
   And  I click a SafeChargeDepositbutton
 Then I should see The field must be exactly 3 digits ErrorMessage Text displayed
 
 @ignore
@RegisterNewCard
 Scenario: Checking if Enetr amout to deposit  will display error text if user enter amount less than 5
Given I navigate to the homepage on "<browser>"
When I have logged in username as "safecharge2" and password "Bola123"
 And  I click a Depositbutton
  And I enter CardVisa Number as "4539219590667240"
  And I entry Expiry card month as "06"
  And I enter Expiry card year as "2020"
  And I enter CVV as "123"
  And I enter Amount To Deposit as "2"
  And  I click a SafeChargeDepositbutton
  Then I should  Please Enter Valid ammount errorText displayed
 @ignore
 @RegisterNewCard   
Scenario: Checking if Green tick mark is displayed when user input valid data
Given I navigate to the homepage on "<browser>"
When I have logged in username as "safecharge2" and password "Bola123"
 And  I click a Depositbutton
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
 Scenario: Deposit decline 
Given I navigate to the homepage on "<browser>"
When I have logged in username as "safecharge2" and password "Bola123"
 And  I click a Depositbutton
 And I enter CardVisa Number as "5333 3043 4466 4217"
  And I entry Expiry card month as "06"
  And I enter Expiry card year as "2020"
  And I enter CVV as "123"
  And I enter Amount To Deposit as "10"
  And  I click a SafeChargeDepositbutton
  Then I should see Decline Pop-up box displayed
  And I should see Your Transaction decline text displayed
  And I should see Contact Support Number displayed 
  And I should see a close icon displayed
 

@ignore
  @RegisterNewCard   
Scenario: Deposit decline close icon 
Given I navigate to the homepage on "<browser>"
When I have logged in username as "safecharge2" and password "Bola123"
 And  I click a Depositbutton
 And I enter CardVisa Number as "5333 3043 4466 4217"
  And I entry Expiry card month as "06"
  And I enter Expiry card year as "2020"
  And I enter CVV as "123"
  And I enter Amount To Deposit as "10.12"
  And  I click a SafeChargeDepositbutton
 And I click on decline close icon 
 Then I should see no decline pop-up box
 
 
 @ignore
 @RegisterNewCard   
Scenario: Deposit with a new Register card and Deposit Limit Pop-up box as user making ahis/her first Deposit
Given I navigate to the homepage on "<browser>"
When I have logged in username as "safecharge2" and password "Bola123"
 And  I click a Depositbutton
 And I enter CardVisa Number as "42650367 5555 6897"
  And I entry Expiry card month as "06"
  And I enter Expiry card year as "2020"
  And I enter CVV as "170"
  And I enter Amount To Deposit as "200.12"
  And  I click a SafeChargeDepositbutton
 Then  I should see Deposit Success Cashier Pop-up box displayed
 And I should see Your transaction was approved Text displayed
# And I should see deposit limit pop-up box 
 And I should see CloseButton within the Success Cashier Pop-up box displayed

 @ignore
@Register
  Scenario: Registration with valid Data and clicking Deposit Button on Welcome 
   Given I navigate to the Registrationpage on "<browser>"
    When I enter regUsername as "Safecharge05"
    And I enter RegPassword as "Bola123"
    And I enter RegConfirmPassword as "Bola123"
    And I enter a RegScreenName as "weraq257"
    And I enter RegEmail as "test@playtech.com"
    And I enter RegTitle as "Ms"
    And I enter RegFirstName as "first"
    And I enter RegSurName as "Namesdo"
    And I enter RegDOBDay as "03"
    And I enter RegDOBMonth as "Oct"
    And I enter RegDOBYear as "1980"
    And I click on RegClickHere
    And I enter RegAddress as "80"
    And I enter RegTown as "London"
    And I enter RegCounty as "London"
    And I enter RegPostCode as "SW8 3HE"
    And I enter RegContactNum as "020700070010"
    And I click on deposit limit click here link
    And I enter Choose Type as "Daily"
    And I enter Choose limit as "50,000"
    And I click on RegT$CCheckBox
    And I click on RegSubmitButton
    And I click on deposit Button on Welcome page
    Then I should see payment logo in the cashier pop-up





# 4539219590667240
 
 
 