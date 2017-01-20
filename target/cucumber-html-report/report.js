$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("main/resources/com/suite/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "       User should be able to login with a valid username and password\n       after logining user should see his usernameInfo, account balance , Deposit button \n       and Account Menu",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Login",
  "description": "",
  "id": "login;login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@ignore"
    },
    {
      "line": 6,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I navigate to the homepage on \u003cbrowser\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I enter Username as \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I enter Password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on SignIn button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should see username as \"SOLOMON2014\" present",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I should see AccountBlance present",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should see Depositbutton present",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should see AccountMenu_",
  "keyword": "And "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "login;login;",
  "rows": [
    {
      "cells": [
        "browser",
        "username",
        "password"
      ],
      "line": 18,
      "id": "login;login;;1"
    },
    {
      "cells": [
        "Mozilla",
        "solomon2014",
        "London01"
      ],
      "line": 19,
      "id": "login;login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 19,
  "name": "Login",
  "description": "",
  "id": "login;login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Login"
    },
    {
      "line": 5,
      "name": "@ignore"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I navigate to the homepage on Mozilla",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I enter Username as \"solomon2014\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I enter Password as \"London01\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on SignIn button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should see username as \"SOLOMON2014\" present",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I should see AccountBlance present",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should see Depositbutton present",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should see AccountMenu_",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "solomon2014",
      "offset": 21
    }
  ],
  "location": "StepDefinition.i_enter_Username_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "London01",
      "offset": 21
    }
  ],
  "location": "StepDefinition.i_enter_Password_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.i_click_on_SignIn_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "SOLOMON2014",
      "offset": 26
    }
  ],
  "location": "StepDefinition.i_should_see_username_as_present(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.i_should_see_AccountBlance_present()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.i_should_see_Depositbutton_present()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.i_should_see_AccountMenu_()"
});
formatter.result({
  "status": "skipped"
});
});