$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/gmailLogin.feature");
formatter.feature({
  "id": "login-feature-file",
  "description": "",
  "name": "Login Feature File",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "login-feature-file;login-scenario-test-for-gmail",
  "tags": [
    {
      "name": "@selenium",
      "line": 3
    }
  ],
  "description": "",
  "name": "Login scenario test for Gmail",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "navigate to gmail page",
  "keyword": "Given ",
  "line": 6
});
formatter.step({
  "name": "user logged in using username as fairwayqa and password as fairwayqalajolla",
  "keyword": "When ",
  "line": 7
});
formatter.step({
  "name": "inbox page should be displayed",
  "keyword": "Then ",
  "line": 8
});
formatter.match({
  "location": "GmailLoginSteps.navigate()"
});
formatter.result({
  "duration": 3641526000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "fairwayqa",
      "offset": 33
    },
    {
      "val": "fairwayqalajolla",
      "offset": 59
    }
  ],
  "location": "GmailLoginSteps.login(String,String)"
});
formatter.result({
  "duration": 5222438000,
  "status": "passed"
});
formatter.match({
  "location": "GmailLoginSteps.verifySuccessful()"
});
formatter.result({
  "duration": 35179000,
  "status": "passed"
});
});