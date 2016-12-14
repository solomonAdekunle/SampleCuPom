#Feature: Registration
#  	 I want to register in order to play roulette games
#@ignore
#  @Register
#  Scenario Outline: Registration
#   Given I navigate to the Registrationpage on <browser>
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
#    And I click on RegT$CCheckBox
#    And I click on RegSubmitButton
#    Then I should navigate "<expectedResult>" to welcome page.
#
#    Examples: 
#      | browser | username    | password | ConfPass | screenName   | E-mail            | title | firstName | surname | Day | Month | Year | Address        | Town    | county | Postcode | contactNumber   | expectedResult	 |
#      | Mozilla | Cucumber109 | Bola123  | Bola123  | huyasig12qaz | test@playtech.com | Ms    | tolu      | lawal   |  06 | OCT   | 1982 | 6 goodhew Road | Croydon | surrey | CR0 6JX  |  020700070100   |  failure		 |
#      | Mozilla | {generator} |Bola123   | Bola123  |{generator}   | test@playtech.com   | Ms    | tolu      | lawal   |  06 | OCT   | 1982 | 6 goodhew Road | Croydon | surrey | CR0 6JX  |  020700070100 |  Successfully	 |
