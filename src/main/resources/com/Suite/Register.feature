Feature: Registration and Deposit limit
  	 I want to register in order to play roulette games
@ignore
  @Register
  Scenario Outline: Registration
   Given I navigate to the Registrationpage on "<browser>"
    When I enter regUsername as "<username>"
    And I enter RegPassword as "<password>"
    And I enter RegConfirmPassword as "<ConfPass>"
    And I enter a RegScreenName as "<screenName>"
    And I enter RegEmail as "<E-mail>"
    And I enter RegTitle as "<title>"
    And I enter RegFirstName as "<firstName>"
    And I enter RegSurName as "<surname>"
    And I enter RegDOBDay as "<Day>"
    And I enter RegDOBMonth as "<Month>"
    And I enter RegDOBYear as "<Year>"
    And I click on RegClickHere
    And I enter RegAddress as "<Address>"
    And I enter RegTown as "<Town>"
    And I enter RegCounty as "<county>"
    And I enter RegPostCode as "<Postcode>"
    And I enter RegContactNum as "<contactNumber>"
    And I click on RegT$CCheckBox
    And I click on RegSubmitButton
    Then I should navigate "<expectedResult>" to welcome page.

    Examples: 
      | browser | username    | password | ConfPass | screenName   | E-mail            | title | firstName | surname | Day | Month | Year | Address        | Town    | county | Postcode | contactNumber   | expectedResult	 |
      | Mozilla | Cucumber109 | Bola123  | Bola123  | huyasig12qaz | test@playtech.com | Ms    | tolu      | lawal   |  06 | OCT   | 1982 | 6 goodhew Road | Croydon | surrey | CR0 6JX  |  020700070100   |  failure		 |
      | Mozilla | {generator} |Bola123   | Bola123  |{generator}   | test@playtech.com   | Ms    | tolu      | lawal   |  06 | OCT   | 1982 | 6 goodhew Road | Croydon | surrey | CR0 6JX  |  020700070100 |  Successfully	 |

      
#     @Register
#  Scenario: Deposit Limit link on Registrition Page
#   Given I navigate to the Registrationpage on "<browser>"
#   Then I should see Deposit Limit Link
#   
#      @Register
#  Scenario: Deposit Limit link on Registrition Page
#   Given I navigate to the Registrationpage on "<browser>"
#   When I click on deposit limit click here link
#   Then I should see Choose Type dropdown box
#   And I should  see Choose Limit  dropdown box
#   
#      @Register
#  Scenario: setting a Daily  deposit limit  on Registration page
#   Given I navigate to the Registrationpage on "<browser>"
#   When I click on deposit limit click here link
#   And I enter Choose Type as "Daily"
#   And I enter Choose limit as "£1000"
#   Then I should see Choose Type as "Daily"
#   And I should  see Choose Limit  as "£1000"
   
   
      @Register
  Scenario Outline: setting a Weekly   deposit limit  on Registration page
   Given I navigate to the Registrationpage on "<browser>"
   When I click on deposit limit click here link
   And I enter Choose Type as "<ChooseType>"
   And I enter Choose limit as "<WeeklyLimit>"
   Then I should see Choose Type as "<ExpectResultChooseType>"
   And I should  see Choose Limit  as "<ExpectResultChooseLimit>"
     
   Examples:
    		|ChooseType | WeeklyLimit| ExpectResultChooseType	|ExpectResultChooseLimit|
    		|Weekly		|1000		 |Weekly					|1000					|
    		
#     @Register
#  Scenario: setting a Monthly deposit limit  on Registration page
#   Given I navigate to the Registrationpage on "<browser>"
#   When I click on deposit limit click here link
#   And I enter Choose Type as "Monthly"
#   And I enter Choose limit as "£50,000"
#   Then I should see Choose Type as "Monthly"
#   And I should  see Choose Limit  as "£50,000"
   
   
#    @Register
#  Scenario: setting a Monthly deposit limit  on Registration page
#   Given I navigate to the Registrationpage on "<browser>"
#   When I click on deposit limit click here link
#   And  I enter Choose Type as "Monthly"
#   And I click on RegSubmitButton
#   Then I should see Choose Type as "Monthly"
#   And I should  see Choose Limit  as "£50,000"
   
#      @Register
#  Scenario: setting a Other deposit limit  on Registration page
#   Given I navigate to the Registrationpage on "<browser>"
#   When I click on deposit limit click here link
#   And I enter Choose Type as "Monthly"
#   And I enter Choose limit as "Other"
#   Then I should see Choose Type as "Monthly"
#   And I should  see Choose Limit  as "Other"
#   And I should see Othe Amount Input box
 
#      @Register
#  Scenario: setting a Other deposit limit  on Registration page
#   Given I navigate to the Registrationpage on "<browser>"
#   When I click on deposit limit click here link
#   And I enter Choose Type as "Monthly"
#   And I enter Choose limit as "Other"
#   And I enter Other Amount as "£10,000"
#   Then I should see Choose Type as "Monthly"
#   And I should  see Choose Limit  as "Other"
#   And I should see Other Amount  as "£10,000"
#   
#    @Register
#  Scenario: Closing Deposit limit  on Registration page
#   Given I navigate to the Registrationpage on "<browser>"
#   When I click on deposit limit close link
#   Then I should see Choose Type as "Monthly"
#   And I should  see no Choose Limit  as "Other"
#   And I should see no  Other Amount  as "£10,000"
#   
#   @ignore
#    @Register
#  Scenario Outline: Registration with Deposit Limit Set
#   Given I navigate to the Registrationpage on "<browser>"
#    When I enter regUsername as "<username>"
#    And I enter RegPassword as "<password>"
#    And I enter RegConfirmPassword as "<ConfPass>"
#    And I enter a RegScreenName as "<screenName>"
#    And I enter RegEmail as "<E-mail>"
#    And I enter RegTitle as "<title>"
#    And I enter RegFirstName as "<firstName>"
#    And I enter RegSurName as "<surname>"
#    And I enter RegDOBDay as "<Day>"
#    And I enter RegDOBMonth as "<Month>"
#    And I enter RegDOBYear as "<Year>"
#    And I click on RegClickHere
#    And I enter RegAddress as "<Address>"
#    And I enter RegTown as "<Town>"
#    And I enter RegCounty as "<county>"
#    And I enter RegPostCode as "<Postcode>"
#    And I enter RegContactNum as "<contactNumber>"
#    And I click on DepositLimit link
#    And I enter Choose Type as "<DailyLimit>"
#    And I enter Choose limit as "<ChooseLimit>"
#    And I click on RegT$CCheckBox
#    And I click on RegSubmitButton
#    Then I should navigate "<expectedResult>" to welcome page.
#
#    Examples: 
#      | browser | username    | password | ConfPass | screenName   | E-mail            | title | firstName | surname | Day | Month | Year | Address        | Town    | county | Postcode | contactNumber   | DailyLimit  | ChooseLimit 		|expectedResult	 |
#      | Mozilla | Cucumber109 | Bola123  | Bola123  | huyasig12qaz | test@playtech.com | Ms    | tolu      | lawal   |  06 | OCT   | 1982 | 6 goodhew Road | Croydon | surrey | CR0 6JX  |  020700070100   |  	Daily	 | 		£1000	    |   failure		 |
#      | Mozilla | {generator} |Bola123   | Bola123  |{generator}   | test@playtech.com   | Ms    | tolu      | lawal   |  06 | OCT   | 1982 | 6 goodhew Road | Croydon | surrey | CR0 6JX  |  020700070100 |  	Daily	 |		£1000		| Successfully	 |
   