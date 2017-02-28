Feature: Withdrawal
        User should be able to make a withdraw from his/her account
        
   
   
   
  @ignore
  @Withdrawal
 Scenario: WithDrawal
Given I navigate to the homepage on "<browser>"
When I have logged in username as "safecharge2" and password "Bola123"
 And I click on Account Menu dropDown box
 And I click on Withdrawal link 
 Then I should navigate to Withdrawl page.
   
# @ignore
  @Withdrawal      
 Scenario: WithDrawal
Given I navigate to the homepage on "<browser>"
 When I have logged in username as "SafaCharge4" and password "Bola123"
  And I click on Account Menu dropDown box
  And I click on Withdrawal link 
  And I enter withdraw amount as "10"
  And I click Withdrawal Button
  Then I should see Withdrawal success Pop-up box
 #@ignore
  @Withdrawal
  Scenario: Clicking on Withdrawal Pop-up success Ok button
Given I navigate to the homepage on "<browser>"
 When I have logged in username as "safacHARGE4" and password "Bola123"
 And I click on Account Menu dropDown box
 And I click on Withdrawal link 
 And I enter withdraw amount as "10"
 And I click Withdrawal Button
 And I click success pop-up box Ok Button
 Then I should see no pop-up box displayed
 And I should see a withdrawl Pending displayed
  
  @ignore
  @Withdrawal
 Scenario: Clicking on Withdrawal Pop-up success Ok button
Given I navigate to the homepage on "<browser>"
 When I have logged in username as "safecharge7" and password "Bola123"
  And I click a Depositbutton
  And I click on withdrawal tab link
  And I enter withdraw amount as "10"
  And I click Withdrawal Button
  And I click success pop-up box Ok Button
  Then I should see no pop-up box displayed
  @ignore
  @Withdrawal
 Scenario: Clicking on Withdrawal Pop-up success Ok button
Given I navigate to the homepage on "<browser>"
 When I have logged in username as "safacHARGE4" and password "Bola123"
 And I click on Account Menu dropDown box
 And I click on Withdrawal link 
 Then I should see a withdrawl Pending displayed
 
  @ignore
  @Withdrawal
 Scenario: Checking withdrawl Pending  button is displayed
Given I navigate to the homepage on "<browser>"
 When I have logged in username as "safecharge1" and password "Bola123"
  And I click a Depositbutton
  And I click on withdrawal tab link
  Then I should see a withdrawl Pending displayed

@ignore
  @Withdrawal
Scenario: Checking withdrawl Pending  button is displayed via withdrawal link within account menu
Given I navigate to the homepage on "<browser>"
 When I have logged in username as "safacHARGE4" and password "Bola123"
 And I click on Account Menu dropDown box
 And I click on Withdrawal link 
 Then I should see a withdrawl Pending displayed
@ignore
 @Withdrawal
Scenario: Check if Confirmation Pending pop-up box will be displayed after clicking on Cancel Pending via withdrawal link within account menu
Given I navigate to the homepage on "<browser>"
 When I have logged in username as "safacHARGE4" and password "Bola123"
 And I click on Account Menu dropDown box
 And I click on Withdrawal link 
 And I click on Pending withdrwal Cancel Button
 Then I should see a see Confirmation Pop-up box.
 
 #@ignore
 #@Withdrawal
# Scenario: Check if Confirmation Pending pop-up box will be displayed after clicking on Cancel Pending
#Given I navigate to the homepage on "<browser>"
# When I have logged in username as "safecharge1" and password "Bola123"
#  And I click a Depositbutton
#  And I click on withdrawal tab link
#  And I click on Pending withdrwal Cancel Button
#  Then I should see a see Confirmation Pop-up box.


#@ignore
 @Withdrawal
Scenario: Check if clicking NO button on Confirmation box will close the box and pending will still be displayed
Given I navigate to the homepage on "<browser>"
 When I have logged in username as "safacharge4" and password "Bola123"
 And I click on Account Menu dropDown box
 And I click on Withdrawal link 
 And I click on Pending withdrwal Cancel Button
 And I click on No Button on Pending Confirmation box
Then I should see Pending withdrwal Cancel Button
 
#@ignore
# @Withdrawal
# Scenario: Check if clicking NO button on Confirmation box will close the box and pending will still be displayed
#Given I navigate to the homepage on "<browser>"
# When I have logged in username as "safecharge1" and password "Bola123"
#  And I click a Depositbutton
#  And I click on withdrawal tab link
#  And I click on Pending withdrwal Cancel Button
#  And I click on No Button on Pending Confirmation box
# Then I should see Pending withdrwal Cancel Button
# 



#@ignore
 @Withdrawal
 Scenario: Check if clicking Yes button on Confirmation box will close the box and Another Confirmation box will be displayed
Given I navigate to the homepage on "<browser>"
 When I have logged in username as "safacharge4" and password "Bola123"
 And I click on Account Menu dropDown box
 And I click on Withdrawal link 
 And I click on Pending withdrwal Cancel Button
 And I click on Yes Button on Pending Confirmation box
Then I should see Amount Withdrawal cancell Comfirmation box

#@ignore
 @Withdrawal
Scenario: Check if clicking Ok button on Confirmation box will close the box 
Given I navigate to the homepage on "<browser>"
 When I have logged in username as "safacharge4" and password "Bola123"
 And I click on Account Menu dropDown box
 And I click on Withdrawal link 
 And I enter withdraw amount as "10"
 And I click Withdrawal Button
 And I click success pop-up box Ok Button
 And I click on Pending withdrwal Cancel Button
 And I click on Yes Button on Pending Confirmation box
 And I click on OK button on Confirmation success Pending Cancellation Pop up Box
 Then I should navigate to Withdrawl page.
 
@ignore
 @Withdrawal
 Scenario: Check if clicking Yes button on Confirmation box will close the box and Another Confirmation box will be displayed
Given I navigate to the homepage on "<browser>"
 When I have logged in username as "safecharge1" and password "Bola123"
  And I click a Depositbutton
  And I click on withdrawal tab link
  And I click on Pending withdrwal Cancel Button
  And I click on Yes Button on Pending Confirmation box
  Then I should see Amount Withdrawal cancell Comfirmation box
  And  My balance should increase by amount withdrawn

