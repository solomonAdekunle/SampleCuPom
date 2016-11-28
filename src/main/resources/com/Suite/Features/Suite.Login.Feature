Feature: Login
         User should be able to login with a valid username and password
         after logining user should see his usernameInfo, account balance , Deposit button 
         and Account Menu	
         
  @Login 
 Scenario Outline:Login
  Given I navigate to "siteName" on <browser>
  When  I enter "LoginUsername_Selector" as "<username>"
   And  I enter "LoginPassword_Selector" as "<password>"
   And  I click on "LoginButton_Selector"
  Then  I should see "UserNameInfo_Selector" displayed as UsernameInfo
   And  I should see "AccountBalance_Selector" displayed as Account Balance
   And  I should see "Depositbutton_Selector" displayed as Deposit button
   And  I should see "AccountMenu_Selector" displayed as Account Menu
 
 Examples:  
 		|browser	|
    | Mozilla	|
       
       