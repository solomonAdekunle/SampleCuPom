Feature: ForgottenDetails
       user should should be able to reset there password 
       when they for it either their usename or password by clicking 
       forgotten details link on the HomePage
@ignore
  @ForgottenDetails
  Scenario Outline: ForgottenDetails
    Given I navigate to the ForgottenDetails page on "<browser>"
    When I enter Forgotten Deatils username as "<username>"
    And I enter  Forgotten Deatils email as "<Email>"
    And I enter  Forgotten Deatils  DOBday as "<day>"
    And I enter  Forgotten Deatils DOBmonth as "<month>"
    And I enter  Forgotten Deatils DOBYear as "<year>"
    And I click on  Forgotten Deatils Submit Button
    And I enter Reset Password as "<newpassword>"
    And I enter ResetConFirmPassword as "<confirmPassword>"
    And I click on ResetSubmitt Button
    Then I should reset my password 

    Examples: 
      | browser | username    | Email             | day | month | year | newpassword | confirmPassword | 
      | Mozilla | solomon2014 | testme@gmail.com  |  10 | Oct   | 1980 | asnanannn   | anananann       | 
      | Mozilla | Noblebug228 | test@playtech.com |  30 | Oct   | 1980 | Bola123$%^  | Bola123$%^      | 
