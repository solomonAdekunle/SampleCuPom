Feature: Game Launch
        User Should be able to Launch a game after loggin with a valid username and Password
@ignore
 @GameLaunch    
Scenario Outline::User Launching a Roulette Live TV game
  Given  I have loggedin on the BasePage 
   When I click on "<GameType>"
   Then I should see a game Launching in another window
   Examples:
   |GameType				|
   |Roulette Express Premium|