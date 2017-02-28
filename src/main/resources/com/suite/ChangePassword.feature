Feature: Deposit
    User should be able to Change there Password after Login by Navigating to the Change Password page  
   
   @ignore
   @ChangePassword
  Scenario: Navigating to the Changepassword page 
  Given I have loggedin on the BasePage 
  When I click on Account Menu dropDown box
  And I click on ChangePassword link 
  Then I should See ChangePassword Title displayed
  And I should see Old Password Text box displayed
  And I should see New Password Text box displayed 
  And I should see Confirm Password Text box displayed
  And I should see Submit Button displayed
  
 @ignore
  @ChangePassword
  Scenario: Testing Change Password functionality with invalid Data
   Given I have loggedin on the BasePage 
   When I click on Account Menu dropDown box
  	And I click on ChangePassword link 
 	And I enter Old Password as "london "
 	And I enter New Password as "Bola123"
 	And I enter Confirm Password as "Bola123"
 	And I click on ChangePasswordSubmit Button
 	Then I should see an error Messeage displayed
  @ignore	 	
 @ChangePassword
  Scenario: Testing Change Password functionality with invalid Data
   Given I have loggedin on the BasePage 
   When I click on Account Menu dropDown box
  	And I click on ChangePassword link 
 	And I enter Old Password as "Bola1234"
 	And I enter New Password as "Bola1234"
 	And I enter Confirm Password as "Bola1234"
 	And I click on ChangePasswordSubmit Button
  Then I should see an error Messeage displayed
   @ignore	 	
 @ChangePassword
   Scenario: Testing Change Password functionality with invalid Data
   Given I have loggedin on the BasePage 
   When I click on Account Menu dropDown box
  	And I click on ChangePassword link 
 	And I enter Old Password as "Bola1234"
 	And I enter New Password as "Bola12345"
 	And I enter Confirm Password as "Bola1234"
 	And I click on ChangePasswordSubmit Button
  Then I should see an error Messeage displayed
 	
 	@ignore	 	
 @ChangePassword
  Scenario: Testing Change Password functionality with invalid Data
   Given I have loggedin on the BasePage 
   When I click on Account Menu dropDown box
  	And I click on ChangePassword link 
 	And I enter Old Password as "Bola1234"
 	And I enter New Password as "Bola12345"
 	And I enter Confirm Password as ""
 	And I click on ChangePasswordSubmit Button
  Then I should see an error Messeage displayed
  
  @ignore	 	
    @ChangePassword
  Scenario: Testing Change Password functionality with valid Data
   Given I have loggedin on the BasePage 
   When I click on Account Menu dropDown box
  	And I click on ChangePassword link 
 	And I enter Old Password as "Bola123456"
 	And I enter New Password as "Bola1234567"
 	And I enter Confirm Password as "Bola1234567"
 	And I click on ChangePasswordSubmit Button
  Then I should see Your Password Have successfully Rest
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
#  @ignore
#  @ChangePassword
# Scenario Outline: Testing Change Password functionality
#   Given I have loggedin on the BasePage 
#   When I click on Account Menu dropDown box
#  	And I click on ChangePassword link 
# 	And I enter Old Password as "<oldpassword>"
# 	And I enter New Password as "<newpassword>"
# 	And I enter Confirm Password as "<ConfPassWord>"
# 	And I click on ChangePasswordSubmit Button
# 	Then I should your Reset Password "<ExpeectedResult>" displayed	
# 	 	 	
#  Examples: 
#      | oldpassword | newpassword | ConfPassword | ExpeectedResult | Result   |
#      | london      | Bola1234    | Bola123      | Failure         | Incorrect|
#      | Bola123  	| Bola123     | Bola123      | Failure         |Incorrect |
#      | Bola123		| Bola1234	  | Bola123		 | Failure         |Incorrect |
#      | Bola123     | Bola1234	  | 			 | Failure		   |Incorrect |
#      | Bola1234    | Bola1235	  | Bola1235     | Success         |correct   |
# 	