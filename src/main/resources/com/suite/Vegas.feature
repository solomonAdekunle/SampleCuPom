Feature: User should be able to navigate to Veags home page and lunch Vitue Fusion Game 



#@ignore 
@VegasGames 
Scenario: Navigating to Vegas Home Page
	Given I navigate to the homepage on "<browser>" 
	When I click on Vegas Tab 
	Then I should navigated to Vegas Home page 
	
#@ignore 
@VegasGames 
Scenario: Launching  game on Vegas HomePage
	Given I have loggedin on the BasePage 
	And I click on Vegas Tab 
	And I click one Virtue Fusion Game 
	Then i should see the Game launching 
 