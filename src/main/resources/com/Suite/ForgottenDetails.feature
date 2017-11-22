Feature: ForgottenDetails
       user should should be able to reset there password 
       when they for it either their usename or password by clicking 
       forgotten details link on the HomePage

#@ignore
  @ForgottenDetails
  Scenario: ForgottenDetails with invalid data
    Given I navigate to the ForgottenDetails page on "<browser>"
    When I enter Forgotten Deatils username as "solomon2014"
    And I enter  Forgotten Deatils email as "testme@gmail.com"
    And I enter  Forgotten Deatils  DOBday as "10"
    And I enter  Forgotten Deatils DOBmonth as "Oct"
    And I enter  Forgotten Deatils DOBYear as "1980"
    And I click on  Forgotten Deatils Submit Button
   Then I should see an error Messeage on Forgotten Details Page

 #ignore
  @ForgottenDetails
 Scenario: ForgottenDetails with invalid data
    Given I navigate to the ForgottenDetails page on "<browser>"
    When I enter Forgotten Deatils username as "Nobelbug11"
    And I enter  Forgotten Deatils email as "testplay.com"
    And I enter  Forgotten Deatils  DOBday as "3"
    And I enter  Forgotten Deatils DOBmonth as "Aug"
    And I enter  Forgotten Deatils DOBYear as "1980"
    And I click on  Forgotten Deatils Submit Button
   Then I should see an error Messeage on Forgotten Details Page
  
 #@ignore
  @ForgottenDetails
  Scenario: ForgottenDetails with invalid data
    Given I navigate to the ForgottenDetails page on "<browser>"
    When I enter Forgotten Deatils username as ""
    And I enter  Forgotten Deatils email as "test@playtech.com"
    And I enter  Forgotten Deatils  DOBday as "3"
    And I enter  Forgotten Deatils DOBmonth as "Aug"
    And I enter  Forgotten Deatils DOBYear as "1980"
    And I click on  Forgotten Deatils Submit Button
   Then I should see an error Messeage on Forgotten Details Page
 
#@ignore
  @ForgottenDetails
  Scenario: ForgottenDetails with invalid data
    Given I navigate to the ForgottenDetails page on "<browser>"
    When I enter Forgotten Deatils username as "H"
    And I enter  Forgotten Deatils email as "test@playtech.com"
    And I enter  Forgotten Deatils  DOBday as "12"
    And I enter  Forgotten Deatils DOBmonth as "Aug"
    And I enter  Forgotten Deatils DOBYear as "1980"
    And I click on  Forgotten Deatils Submit Button
   Then I should see an error Messeage on Forgotten Details Page
   
  #@ignore
  @ForgottenDetails
  Scenario: ForgottenDetails with valid data
    Given I navigate to the ForgottenDetails page on "<browser>"
    When I enter Forgotten Deatils username as "Noblebug228"
    And I enter  Forgotten Deatils email as "test@playtech.com"
    And I enter  Forgotten Deatils  DOBday as "30"
    And I enter  Forgotten Deatils DOBmonth as "Oct"
    And I enter  Forgotten Deatils DOBYear as "1980"
    And I click on  Forgotten Deatils Submit Button
    And I enter Reset Password as "Bola123$%^"
    And I enter ResetConFirmPassword as "Bola123$%^"
    And I click on ResetSubmitt Button
    Then I should reset my password 

 
 
 
 
 
# @ignore
#  @ForgottenDetails
#  Scenario Outline: ForgottenDetails
#    Given I navigate to the ForgottenDetails page on "<browser>"
#    When I enter Forgotten Deatils username as "H"
#    And I enter  Forgotten Deatils email as "<Email>"
#    And I enter  Forgotten Deatils  DOBday as "<day>"
#    And I enter  Forgotten Deatils DOBmonth as "<month>"
#    And I enter  Forgotten Deatils DOBYear as "<year>"
#    And I click on  Forgotten Deatils Submit Button
#    And I enter Reset Password as "<newpassword>"
#    And I enter ResetConFirmPassword as "<confirmPassword>"
#    And I click on ResetSubmitt Button
#    Then I should reset my password 
#
#    Examples: 
#      | browser | username    | Email             | day | month | year | Result			| newpassword 	 | confirmPassword| 
#      | Mozilla | solomon2014 | testme@gmail.com  |  10 | Oct   | 1980 | Incomplete 	|	asnanannn    | anananann      | 
#      | Mozilla | Nobelbug11  |  testplay.com	   |  3  | Aug   | 1980 | Incomplete     |  bola1234      | bola1234	      |
#      | Mozilla | 	           |  testplay.com	   |  3  | Aug   | 1980 | Incomplete     |  bola1234      | bola1234	      |
#      | Chrome  | H	       |  testplay.com	   |  3  | Aug   | 1980 | Incomplete     |  bola1234      | bola1234	      |
#      | Mozilla | Noblebug22  | test@playtech.com |  30 | Oct   | 1980 |  Complete	    |	Bola123$%^   | Bola123$%^     | 
