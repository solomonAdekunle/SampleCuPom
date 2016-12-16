Feature: As a new user i should be able to register  valid my card in other to make deposit.



@RegisterNewCard
Scenario: Register an  incomplete  credit card number will displayed error message 
Given I navigate to the homepage on "<browser>"
 When I have logged in username as "safecharge2" and password "Bola123"
  And  I click a Depositbutton
  And I enter CardVisa Number as "45392195906672"
  And  I click a Depositbutton
 Then I should see InaValidCardErrorMessage displayed
 
  
 
 
 
 Scenario: Verifying if expiration date will displayed error message when not  date month selected.
Given I navigate to the homepage on "<browser>"
When I have logged in username as "safecharge2" and password "Bola123"
 And  I click a Depositbutton
 And I enter CardVisa Number as "4539219590667240"
 And I entry Expiry card month as ""
 And I enter Expiry card year as "2020"
 And  I click a Depositbutton
 Then I should see In Valid Expeiratin ErrorMessage displayed
 
 
 Scenario: Verifying if expiration date  will displayed error message when not  date year selected.
Given I navigate to the homepage on "<browser>"
When I have logged in username as "safecharge2" and password "Bola123"
 And  I click a Depositbutton
 And I enter CardVisa Number as "4539219590667240"
 And I entry Expiry card month as "06"
 And I enter Expiry card year as ""
 And  I click a Depositbutton
 Then I should see InaValidCardErrorMessage displayed
 
  
 Scenario: Checking if CVV error message will be displayed when cvv text box is ommited or incompeleted
Given I navigate to the homepage on "<browser>"
 When I have logged in username as "safecharge2" and password "Bola123"
 And  I click a Depositbutton
 And I enter CardVisa Number as "4539219590667240"
 And I entry Expiry card month as "06"
   And I enter Expiry card year as "2020"
   And I enter CVV as "1"
   And  I click a Depositbutton
 Then I should see Please Enetr 3 o 4 digit ErrorMessage Text displayed
 
 
 Scenario: Checking if Enetr amout to deposit  will display error text if user enter amount less than 5
Given I navigate to the homepage on "<browser>"
When I have logged in username as "safecharge2" and password "Bola123"
 And  I click a Depositbutton
  And I enter CardVisa Number as "4539219590667240"
  And I entry Expiry card month as "06"
  And I enter Expiry card year as "2020"
  And I enter CVV as "123"
  And I enter Amount To Deposit as "2"
  Then I should  Please Enter Valid ammount errorText displayed
 
 
 
 
 
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
 
 
 
 
  