Feature: Login
         User should be able to login with a valid username and password
         after logining user should see his usernameInfo, account balance , Deposit button 
         and Account Menu	
 
  
    
  #@ignore
   @Login
 Scenario Outline:Login with Invalid data
  Given I navigate to the homepage on "<browser>"
  When  I enter Username as "<username>"
   And  I enter Password as "<password>"
   And  I click on SignIn button
   Then I should see Login errorMesssage Pop-up box
  
  Examples:  
 	|browser|username               | password      |
    |Mozilla|mmm12	                |MNNH$1         |
    |Chrome	|Noblebug229	        |Bola123        |
  
  
 #@ignore
  @Login 
 Scenario Outline:Login
  Given I navigate to the homepage on "<browser>"
  When  I enter Username as "<username>"
   And  I enter Password as "<password>"
   And  I click on SignIn button
  Then  I should see username as "<username>" present
   And  I should see AccountBlance present
   And  I should see Depositbutton present
   And  I should see AccountMenu
 
 Examples:  
 	|browser|username               | password     |
 	|Mozilla|NOBLEBUG228	        |Bola123$%^    |
       
       