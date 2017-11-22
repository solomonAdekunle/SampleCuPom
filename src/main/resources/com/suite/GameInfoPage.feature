Feature: User should be able to Navigate to Game info page of any game on the site
#@ignore
@gameInfo
Scenario: Unauthenticated user Navigating to Roulette Game  game Info page 
 Given I navigate to the homepage on "<browser>"
When I click on Roulette Express Premium Game Info icon
Then I should see Roulette Express Premium as title Page
 And I should see Game Details Information
 And I should see Game Devices images
 And I should Game Air Status
 And I should see Play for Real Button on Roulette Express Premium Game Info page
 And I should see Roulette Express Banner display on Roulette Express Premium Game Info
 And I should see Jackpot slider on the Roulette Express Premium Game Info
 And I should see Winners SliderRoulette Express Premium Game Info
 And I should see AppStore logo on Roulette Express Premium Game Info
 And I should see Android Logo on Roulette Express Premium Game Info
 
@ignore
@gameInfo
Scenario: Unauthenticated user Navigating to Roulette Game  game Info page and Click onPlay For Real
 Given I navigate to the homepage on "<browser>"
When I click on Roulette Express Premium Game Info icon
And I click on Play For Real on Roulette Express Premium
Then I should see a Login Pop-up box displayed on Roulette Express Premium Game Info

#@ignore
@gameInfo
Scenario: Authenticated user Navigating to Roulette Game  game Info page 
Given I have loggedin on the BasePage
When I click on Roulette Express Premium Game Info icon
Then I should see Roulette Express Premium as title Page
 And I should see Game Details Information
 And I should see Game Devices images
 And I should Game Air Status
 #And I should see Play For Fun Button on Roulette Express Premium Game Info page
 And I should see Play for Real Button on Roulette Express Premium Game Info page
 And I should see Roulette Express Banner display on Roulette Express Premium Game Info
 And I should see Roulette Express Banner display on Roulette Express Premium Game Info
 And I should see Jackpot slider on the Roulette Express Premium Game Info
 And I should see Winners SliderRoulette Express Premium Game Info
 And I should see AppStore logo on Roulette Express Premium Game Info
 And I should see Android Logo on Roulette Express Premium Game Info

#@ignore
@gameInfo
Scenario: Authenticated user launching  Roulette Game from  game Info page 
Given I have loggedin on the BasePage
When I click on Roulette Express Premium Game Info icon
And I click on Play For Real on Roulette Express Premium
Then I should see a game Launching in another window

@ignore
@gameInfo
Scenario: Authenticated user launching  Roulette Game from  game Info page 
Given I have loggedin on the BasePage
When I click on Roulette Express Premium Game Info icon
And I click on Play For Fun on Roulette Express Premium
Then I should see a game Launching in another window
#@ignore
@gameInfo
Scenario: Unauthenticated user Navigating to Platech Game  game Info page 
 Given I navigate to the homepage on "<browser>"
When I click on Playtech casino slot Game Info icon
Then I should see the Name of the game as title Page
 And I should see Game Details Information
 And I should see Game Devices images
 And I should see Play for Real Button on this Playtech game GameInfo page
 #And I should see Play For Fun Button on this Playtech game GameInfo page
 And I should see the Game Banner display on this Playtech game GameInfo page
 And I should see Jackpot slider on the this Playtech game GameInfo page
 And I should see Winners Slider this Playtech game GameInfo page
 And I should see AppStore logo on this Playtech game GameInfo page
 And I should see Android Logo on this Playtech game GameInfo page
 
 #@ignore
@gameInfo
 Scenario: Unauthenticated user Navigating to Playtech Casino Slot game Info page and Click on Play For Real
 Given I navigate to the homepage on "<browser>"
When I click on Playtech casino slot Game Info icon
And I click on Play For Real on this Playtech game GameInfo page
Then  I should see a Login Pop-up box displayed on this Playtech game GameInfo page
 
 @ignore
@gameInfo
Scenario: Unauthenticated user Navigating to Playtech Casino Slot game Info page and Click on Play For Fun
 Given I navigate to the homepage on "<browser>" 
When I click on Playtech casino slot Game Info icon
And I click on Play For Fun on this Playtech game GameInfo page
Then I should see a game Launching in another window
#@ignore
@gameInfo
Scenario: Authenticated user navigating to Playtech Casino Slot game Info page
Given I have loggedin on the BasePage
When I click on Playtech casino slot Game Info icon
Then I should see the Name of the game as title Page
 And I should see Game Details Information
 And I should see Game Devices images
 And I should see Play for Real Button on this Playtech game GameInfo page
 #And I should see Play For Fun Button on this Playtech game GameInfo page
 And I should see the Game Banner display on this Playtech game GameInfo page
 And I should see Jackpot slider on the this Playtech game GameInfo page
 And I should see Winners Slider this Playtech game GameInfo page
 And I should see AppStore logo on this Playtech game GameInfo page
# And I should see Android Logo on this Playtech game GameInfo page
#@ignore
@gameInfo 
Scenario: Authenticated user navigating to Playtech Casino Slot game Info page
Given I have loggedin on the BasePage
When I click on Playtech casino slot Game Info icon
And I click on Play For Real on this Playtech game GameInfo page
Then I should see a game Launching in another window
@ignore
@gameInfo
Scenario: Authenticated user navigating to Playtech Casino Slot game Info page
Given I have loggedin on the BasePage
When I click on Playtech casino slot Game Info icon
When I click on Play For Fun on this Playtech game GameInfo page
Then I should see a game Launching in another window


#@ignore
@gameInfo
Scenario: Unauthenticated user Navigating to  Vegas Virtue Fusion Game  game Info page 
Given I navigate to the homepage on "<browser>" 
When  I click on Vegas Tab 
And  I click on Playtech casino slot Game Info icon
Then I should see the Name of the game as title Page
 And I should see Game Details Information
 And I should see Game Devices images
 And I should see Play for Real Button on this Playtech game GameInfo page
 #And I should see Play For Fun Button on this Playtech game GameInfo page
 And I should see the Game Banner display on this Playtech game GameInfo page
 And I should see Jackpot slider on the this Playtech game GameInfo page
 And I should see Winners Slider this Playtech game GameInfo page
 And I should see AppStore logo on this Playtech game GameInfo page
 And I should see Android Logo on this Playtech game GameInfo page


#@ignore
@gameInfo
Scenario: Authenticated user navigating to Playtech VegasVirtue Fusion Slot game Info page
Given I have loggedin on the BasePage
When I click on Vegas Tab 
When I click on Playtech Virtue Fusion  slot Game Info icon
Then I should see the Name of the game as title Page
 And I should see Game Details Information
 And I should see Game Devices images
 And I should see Play for Real Button on this Playtech game GameInfo page
 #And I should see Play For Fun Button on this Playtech game GameInfo page
 And I should see the Game Banner display on this Playtech game GameInfo page
 And I should see Jackpot slider on the this Playtech game GameInfo page
 And I should see Winners Slider this Playtech game GameInfo page
 And I should see AppStore logo on this Playtech game GameInfo page
 And I should see Android Logo on this Playtech game GameInfo page
 
#@ignore
@gameInfo
Scenario: Authenticated user navigating to Playtech Casino Slot game Info page
Given I have loggedin on the BasePage
When I click on Vegas Tab 
When I click on Playtech Virtue Fusion  slot Game Info icon
And I click on Play For Real on this Playtech game GameInfo page
Then I should see a game Launching in another window
 