Feature: User should be able Search for game by using the search fountionality on each Vertical

#@ignore
@GameSearch
Scenario: User Seacrching for game on Casino Vertical home Page
 Given I navigate to the homepage on "<browser>"
 When I enter game saerch as "Roulette Express Premium"
 And I click enter
 Then I should see Roulette Express Premoium display from the Search
 
 
@ignore
 @GameSearch
Scenario: User Seacrching for game on Vegas Vertical home Page
 Given I navigate to the homepage on "<browser>"
 When I click on Vegas Tab
 And I click enter
 And I enter game saerch as "CLEOPATRA"
 Then I should see Roulette GameSearch game display from the Search
 
 
 