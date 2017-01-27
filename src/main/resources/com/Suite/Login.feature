Feature: Login
         User should be able to login with a valid username and password
         after logining user should see his usernameInfo, account balance , Deposit button 
         and Account Menu	
    
  @Login 
 Scenario Outline:Login
  Given I navigate to the homepage on <browser>
  When  I enter Username as "<username>"
   And  I enter Password as "<password>"
   And  I click on SignIn button
  Then  I should see username as "SOLOMON2014" present
   And  I should see AccountBlance present
   And  I should see Depositbutton present
   And  I should see AccountMenu_
 
 Examples:  
 	|browser	| username   | password |
 	| Mozilla	| solomon2014| London01 |
       
       