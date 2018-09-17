$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featuresfile/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login Functionality with valid userName and Password",
  "description": "",
  "id": "login-functionality;login-functionality-with-valid-username-and-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest,"
    },
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user launch the apllication",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter valid userName \"\u003cuserName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter valid password \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicked on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user is on the home page of the application",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "login-functionality;login-functionality-with-valid-username-and-password;",
  "rows": [
    {
      "cells": [
        "userName",
        "Password"
      ],
      "line": 12,
      "id": "login-functionality;login-functionality-with-valid-username-and-password;;1"
    },
    {
      "cells": [
        "pratikgavane@gmail.com",
        "ABCD"
      ],
      "line": 13,
      "id": "login-functionality;login-functionality-with-valid-username-and-password;;2"
    }
  ],
  "keyword": "Examples"
});
