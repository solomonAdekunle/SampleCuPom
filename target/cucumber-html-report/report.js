$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("main/resources/com/Suite/JoinNowButton.feature");
formatter.feature({
  "line": 1,
  "name": "Registration",
  "description": "\t I want to register in order to play roulette games",
  "id": "registration",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Login",
  "description": "",
  "id": "registration;login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@RegisterButton"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I navigate to the homepage on \u003cbrowser\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on JoinNow Button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should navigate  to Registration page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "registration;login;",
  "rows": [
    {
      "cells": [
        "browser"
      ],
      "line": 11,
      "id": "registration;login;;1"
    },
    {
      "cells": [
        "Mozilla"
      ],
      "line": 12,
      "id": "registration;login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Login",
  "description": "",
  "id": "registration;login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@RegisterButton"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I navigate to the homepage on Mozilla",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on JoinNow Button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should navigate  to Registration page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.i_navigate_to_on_Mozilla()"
});
formatter.result({
  "duration": 12505356766,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_click_on_JoinNow_Button()"
});
formatter.result({
  "duration": 324682818,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_should_navigate_to_Registration_page()"
});
formatter.result({
  "duration": 4079882588,
  "status": "passed"
});
formatter.uri("main/resources/com/Suite/Login.feature");
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
formatter.match({
  "location": "StepDefinition.i_navigate_to_on_Mozilla()"
});
formatter.result({
  "duration": 11205482106,
  "status": "passed"
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
  "duration": 348567605,
  "status": "passed"
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
  "duration": 178899050,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_click_on_SignIn_button()"
});
formatter.result({
  "duration": 218013513,
  "status": "passed"
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
  "duration": 3944974319,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_should_see_AccountBlance_present()"
});
formatter.result({
  "duration": 29186,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_should_see_Depositbutton_present()"
});
formatter.result({
  "duration": 635165171,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_should_see_AccountMenu_()"
});
formatter.result({
  "duration": 33035,
  "status": "passed"
});
formatter.uri("main/resources/com/Suite/Register.feature");
formatter.feature({
  "line": 1,
  "name": "Registration",
  "description": "\t I want to register in order to play roulette games",
  "id": "registration",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Registration",
  "description": "",
  "id": "registration;registration",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Register"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I navigate to the Registrationpage on \u003cbrowser\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter regUsername as \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter RegPassword as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter RegConfirmPassword as \"\u003cConfPass\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter a RegScreenName as \"\u003cscreenName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter RegEmail as \"\u003cE-mail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter RegTitle as \"\u003ctitle\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter RegFirstName as \"\u003cfirstName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter RegSurName as \"\u003csurname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter RegDOBDay as \"\u003cDay\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter RegDOBMonth as \"\u003cMonth\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter RegDOBYear as \"\u003cYear\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on RegClickHere",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I enter RegAddress as \"\u003cAddress\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I enter RegTown as \"\u003cTown\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I enter RegCounty as \"\u003ccounty\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I enter RegPostCode as \"\u003cPostcode\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I enter RegContactNum as \"\u003ccontactNumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on RegT$CCheckBox",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I click on RegSubmitButton",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I should navigate \"\u003cexpectedResult\u003e\" to welcome page.",
  "keyword": "Then "
});
formatter.examples({
  "line": 28,
  "name": "",
  "description": "",
  "id": "registration;registration;",
  "rows": [
    {
      "cells": [
        "browser",
        "username",
        "password",
        "ConfPass",
        "screenName",
        "E-mail",
        "title",
        "firstName",
        "surname",
        "Day",
        "Month",
        "Year",
        "Address",
        "Town",
        "county",
        "Postcode",
        "contactNumber",
        "expectedResult"
      ],
      "line": 29,
      "id": "registration;registration;;1"
    },
    {
      "cells": [
        "Mozilla",
        "Cucumber109",
        "Bola123",
        "Bola123",
        "huyasig12qaz",
        "test@playtech.com",
        "Ms",
        "tolu",
        "lawal",
        "06",
        "OCT",
        "1982",
        "6 goodhew Road",
        "Croydon",
        "surrey",
        "CR0 6JX",
        "020700070100",
        "failure"
      ],
      "line": 30,
      "id": "registration;registration;;2"
    },
    {
      "cells": [
        "Mozilla",
        "{generator}",
        "Bola123",
        "Bola123",
        "{generator}",
        "test@playtech.com",
        "Ms",
        "tolu",
        "lawal",
        "06",
        "OCT",
        "1982",
        "6 goodhew Road",
        "Croydon",
        "surrey",
        "CR0 6JX",
        "020700070100",
        "Successfully"
      ],
      "line": 31,
      "id": "registration;registration;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 30,
  "name": "Registration",
  "description": "",
  "id": "registration;registration;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Register"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I navigate to the Registrationpage on Mozilla",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter regUsername as \"Cucumber109\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter RegPassword as \"Bola123\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter RegConfirmPassword as \"Bola123\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter a RegScreenName as \"huyasig12qaz\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter RegEmail as \"test@playtech.com\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter RegTitle as \"Ms\"",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter RegFirstName as \"tolu\"",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter RegSurName as \"lawal\"",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter RegDOBDay as \"06\"",
  "matchedColumns": [
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter RegDOBMonth as \"OCT\"",
  "matchedColumns": [
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter RegDOBYear as \"1982\"",
  "matchedColumns": [
    11
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on RegClickHere",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I enter RegAddress as \"6 goodhew Road\"",
  "matchedColumns": [
    12
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I enter RegTown as \"Croydon\"",
  "matchedColumns": [
    13
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I enter RegCounty as \"surrey\"",
  "matchedColumns": [
    14
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I enter RegPostCode as \"CR0 6JX\"",
  "matchedColumns": [
    15
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I enter RegContactNum as \"020700070100\"",
  "matchedColumns": [
    16
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on RegT$CCheckBox",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I click on RegSubmitButton",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I should navigate \"failure\" to welcome page.",
  "matchedColumns": [
    17
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.i_navigate_to_the_Registrationpage_on_Mozilla()"
});
formatter.result({
  "duration": 13498417859,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber109",
      "offset": 24
    }
  ],
  "location": "StepDefinition.i_enter_regUsername_as(String)"
});
formatter.result({
  "duration": 211192632,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bola123",
      "offset": 24
    }
  ],
  "location": "StepDefinition.i_enter_RegPassword_as(String)"
});
formatter.result({
  "duration": 443739203,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bola123",
      "offset": 31
    }
  ],
  "location": "StepDefinition.i_enter_RegConfirmPassword_as(String)"
});
formatter.result({
  "duration": 1464660483,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "huyasig12qaz",
      "offset": 28
    }
  ],
  "location": "StepDefinition.i_enter_a_RegScreenName_as(String)"
});
formatter.result({
  "duration": 129354898,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test@playtech.com",
      "offset": 21
    }
  ],
  "location": "StepDefinition.i_enter_RegEmail_as(String)"
});
formatter.result({
  "duration": 287916711,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ms",
      "offset": 21
    }
  ],
  "location": "StepDefinition.i_enter_RegTitle_as(String)"
});
formatter.result({
  "duration": 134241480,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tolu",
      "offset": 25
    }
  ],
  "location": "StepDefinition.i_enter_RegFirstName_as(String)"
});
formatter.result({
  "duration": 74161798,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lawal",
      "offset": 23
    }
  ],
  "location": "StepDefinition.i_enter_RegSurName_as(String)"
});
formatter.result({
  "duration": 135520215,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "06",
      "offset": 22
    }
  ],
  "location": "StepDefinition.i_enter_RegDOBDay_as(String)"
});
formatter.result({
  "duration": 78515654,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "OCT",
      "offset": 24
    }
  ],
  "location": "StepDefinition.i_enter_RegDOBMonth_as(String)"
});
formatter.result({
  "duration": 91615709,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1982",
      "offset": 23
    }
  ],
  "location": "StepDefinition.i_enter_RegDOBYear_as(String)"
});
formatter.result({
  "duration": 98431137,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_click_on_RegClickHere()"
});
formatter.result({
  "duration": 178399038,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6 goodhew Road",
      "offset": 23
    }
  ],
  "location": "StepDefinition.i_enter_RegAddress_as(String)"
});
formatter.result({
  "duration": 722553711,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Croydon",
      "offset": 20
    }
  ],
  "location": "StepDefinition.i_enter_RegTown_as(String)"
});
formatter.result({
  "duration": 139576437,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "surrey",
      "offset": 22
    }
  ],
  "location": "StepDefinition.i_enter_RegCounty_as(String)"
});
formatter.result({
  "duration": 138773018,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CR0 6JX",
      "offset": 24
    }
  ],
  "location": "StepDefinition.i_enter_RegPostCode_as(String)"
});
formatter.result({
  "duration": 133202648,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "020700070100",
      "offset": 26
    }
  ],
  "location": "StepDefinition.i_enter_RegContactNum_as(String)"
});
formatter.result({
  "duration": 108030146,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_click_on_RegT$CCheckBox()"
});
formatter.result({
  "duration": 641610160,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_click_on_RegSubmitButton()"
});
formatter.result({
  "duration": 4459587559,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "failure",
      "offset": 19
    }
  ],
  "location": "StepDefinition.i_should_navigate_to_welcome_page(String)"
});
formatter.result({
  "duration": 5028079884,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"h1.welcome_header\"}\nCommand duration or timeout: 5.02 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027NP-SADEKUNLE\u0027, ip: \u002710.44.3.81\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_102\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d46.0, platform\u003dWINDOWS, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: f838118c-9e5d-4729-be73-728e8b7ba1bb\n*** Element info: {Using\u003dcss selector, value\u003dh1.welcome_header}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:492)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:430)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat pages.RegisterPage.getWelcomePage(RegisterPage.java:155)\r\n\tat com.Suite.StepDefinition.i_should_navigate_to_welcome_page(StepDefinition.java:280)\r\n\tat ✽.Then I should navigate \"failure\" to welcome page.(main/resources/com/Suite/Register.feature:26)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"h1.welcome_header\"}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027NP-SADEKUNLE\u0027, ip: \u002710.44.3.81\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_102\u0027\nDriver info: driver.version: unknown\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElementInternal_(file:///C:/Users/SOLOMO~1.ADE/AppData/Local/Temp/anonymous3930794475659711630webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10770)\r\n\tat \u003canonymous class\u003e.fxdriver.Timer.prototype.setTimeout/\u003c.notify(file:///C:/Users/SOLOMO~1.ADE/AppData/Local/Temp/anonymous3930794475659711630webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:625)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 31,
  "name": "Registration",
  "description": "",
  "id": "registration;registration;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Register"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I navigate to the Registrationpage on Mozilla",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter regUsername as \"{generator}\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter RegPassword as \"Bola123\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter RegConfirmPassword as \"Bola123\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter a RegScreenName as \"{generator}\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter RegEmail as \"test@playtech.com\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter RegTitle as \"Ms\"",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter RegFirstName as \"tolu\"",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter RegSurName as \"lawal\"",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter RegDOBDay as \"06\"",
  "matchedColumns": [
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter RegDOBMonth as \"OCT\"",
  "matchedColumns": [
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter RegDOBYear as \"1982\"",
  "matchedColumns": [
    11
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on RegClickHere",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I enter RegAddress as \"6 goodhew Road\"",
  "matchedColumns": [
    12
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I enter RegTown as \"Croydon\"",
  "matchedColumns": [
    13
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I enter RegCounty as \"surrey\"",
  "matchedColumns": [
    14
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I enter RegPostCode as \"CR0 6JX\"",
  "matchedColumns": [
    15
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I enter RegContactNum as \"020700070100\"",
  "matchedColumns": [
    16
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on RegT$CCheckBox",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I click on RegSubmitButton",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I should navigate \"Successfully\" to welcome page.",
  "matchedColumns": [
    17
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.i_navigate_to_the_Registrationpage_on_Mozilla()"
});
formatter.result({
  "duration": 11059671718,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "{generator}",
      "offset": 24
    }
  ],
  "location": "StepDefinition.i_enter_regUsername_as(String)"
});
formatter.result({
  "duration": 1062818682,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bola123",
      "offset": 24
    }
  ],
  "location": "StepDefinition.i_enter_RegPassword_as(String)"
});
formatter.result({
  "duration": 363848276,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bola123",
      "offset": 31
    }
  ],
  "location": "StepDefinition.i_enter_RegConfirmPassword_as(String)"
});
formatter.result({
  "duration": 1404693055,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "{generator}",
      "offset": 28
    }
  ],
  "location": "StepDefinition.i_enter_a_RegScreenName_as(String)"
});
formatter.result({
  "duration": 178103008,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test@playtech.com",
      "offset": 21
    }
  ],
  "location": "StepDefinition.i_enter_RegEmail_as(String)"
});
formatter.result({
  "duration": 380382665,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ms",
      "offset": 21
    }
  ],
  "location": "StepDefinition.i_enter_RegTitle_as(String)"
});
formatter.result({
  "duration": 126494663,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tolu",
      "offset": 25
    }
  ],
  "location": "StepDefinition.i_enter_RegFirstName_as(String)"
});
formatter.result({
  "duration": 88731741,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lawal",
      "offset": 23
    }
  ],
  "location": "StepDefinition.i_enter_RegSurName_as(String)"
});
formatter.result({
  "duration": 131582982,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "06",
      "offset": 22
    }
  ],
  "location": "StepDefinition.i_enter_RegDOBDay_as(String)"
});
formatter.result({
  "duration": 70497825,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "OCT",
      "offset": 24
    }
  ],
  "location": "StepDefinition.i_enter_RegDOBMonth_as(String)"
});
formatter.result({
  "duration": 82033698,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1982",
      "offset": 23
    }
  ],
  "location": "StepDefinition.i_enter_RegDOBYear_as(String)"
});
formatter.result({
  "duration": 81861789,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_click_on_RegClickHere()"
});
formatter.result({
  "duration": 157921003,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6 goodhew Road",
      "offset": 23
    }
  ],
  "location": "StepDefinition.i_enter_RegAddress_as(String)"
});
formatter.result({
  "duration": 623349304,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Croydon",
      "offset": 20
    }
  ],
  "location": "StepDefinition.i_enter_RegTown_as(String)"
});
formatter.result({
  "duration": 100455880,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "surrey",
      "offset": 22
    }
  ],
  "location": "StepDefinition.i_enter_RegCounty_as(String)"
});
formatter.result({
  "duration": 97389097,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CR0 6JX",
      "offset": 24
    }
  ],
  "location": "StepDefinition.i_enter_RegPostCode_as(String)"
});
formatter.result({
  "duration": 100232976,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "020700070100",
      "offset": 26
    }
  ],
  "location": "StepDefinition.i_enter_RegContactNum_as(String)"
});
formatter.result({
  "duration": 137483378,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_click_on_RegT$CCheckBox()"
});
formatter.result({
  "duration": 682730122,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_click_on_RegSubmitButton()"
});
formatter.result({
  "duration": 8367727779,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Successfully",
      "offset": 19
    }
  ],
  "location": "StepDefinition.i_should_navigate_to_welcome_page(String)"
});
formatter.result({
  "duration": 35785968,
  "status": "passed"
});
});