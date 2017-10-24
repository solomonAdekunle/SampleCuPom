Feature: Chat
         As a user I should be able to click a chat icon 
         and chat with the customer service irespective of my status
         
         
@Chat        
 Scenario Outline: An Unauthentic user clicking a chat icon
 Given I navigate to the homepage on "<browser>"
 When I click on the chat icon
 Then I should see a Chat launch pop-up
 Examples:
 		|browser  |
 		| Mozilla |
 		
 @Chat  		
 Scenario Outline: An Unauthentic user clicking a chat icon
 Given I navigate to the homepage on "<browser>"
 When I click on Vegas Tab 
  And I click on the chat icon
 Then I should see a Chat launch pop-up
 Examples:
 		|browser  |
 		| Chrome  |
 		
 @Chat  		
Scenario Outline: An Unauthentic user clicking a chat icon
 Given I navigate to the homepage on "<browser>"
  When I click on Live Tab
  And I click on the chat icon
 Then I should see a Chat launch pop-up
 Examples:
 		|browser  |
 		| Chrome  |
 #@ignore
 @Chat  		
 Scenario Outline: An Authentic user clicking a chat icon on Casino Vertical
 Given  I have loggedin on the BasePage 
 When I click on the chat icon
 Then I should see a Chat launch pop-up
 Examples:
 		|browser  |
 		| Mozilla |
 		
 #@ignore		
 @Chat  		
Scenario Outline: An Authentic user clicking a chat icon Vegas Vertical
 Given  I have loggedin on the BasePage 
 When I click on Vegas Tab 
  And I click on the chat icon
 Then I should see a Chat launch pop-up
 Examples:
 		|browser  |
 		| Chrome  |
#@ignore
 @Chat  		
Scenario Outline: An Authentic user clicking a chat icon Live Vertical
 Given  I have loggedin on the BasePage 
 When I click on Live Tab
  And I click on the chat icon
 Then I should see a Chat launch pop-up
 Examples:
 		|browser  |
 		| Chrome  |