$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("00_Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 307358,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Login with valid username and password",
  "description": "",
  "id": "login-functionality;login-with-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Navigate to basqar",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User sending the keys in the dialog content class",
  "rows": [
    {
      "cells": [
        "username",
        "daulet2030@gmail.com"
      ],
      "line": 7
    },
    {
      "cells": [
        "password",
        "TechnoStudy123@"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User click on the element in the dialog content class",
  "rows": [
    {
      "cells": [
        "loginButton"
      ],
      "line": 10
    },
    {
      "cells": [
        "gotItButton"
      ],
      "line": 11
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User should login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.navigateToBasqar()"
});
formatter.result({
  "duration": 8946299923,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userSendingTheKeysInTheDialogContentClass(DataTable)"
});
formatter.result({
  "duration": 535691146,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userClickOnTheElementInTheDialogContentClass(DataTable)"
});
formatter.result({
  "duration": 915954764,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userShouldLoginSuccessfully()"
});
formatter.result({
  "duration": 2043794277,
  "status": "passed"
});
formatter.after({
  "duration": 6713079418,
  "status": "passed"
});
});