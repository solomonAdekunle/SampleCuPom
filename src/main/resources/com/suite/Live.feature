Feature: User should be able to launch live game from live Vertical
 
 
 
 #@ignore
   @VegasGames
  Scenario: Navigating to Live vertical home page
  Given I navigate to the homepage on "<browser>"
  When I click on Live Tab
  Then I should navigated to Live Home page
  
   
 
#@ignore
  @VegasGames
 Scenario: Checking if  user can launch a Roulette game from live vertical
 Given I navigate to the homepage on "<browser>"
 When I have logged in username as "solomon2014" and password "London01"
 And I click on Live Tab
 And I click one Live Game
Then I should see the live Game launching 