$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LA_login.feature");
formatter.feature({
  "line": 3,
  "name": "Login Functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@UATTesting"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "User should be able to login successfully",
  "description": "",
  "id": "login-functionality;user-should-be-able-to-login-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user is on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user logins to page",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "enters valid Credentials",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "clicks on the Login button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Successful login message should be displayed on the console window",
  "keyword": "Then "
});
formatter.match({
  "location": "LeaseAccelaratorSearchStepDef.user_is_on_HomePage()"
});
formatter.result({
  "duration": 2801135000,
  "status": "passed"
});
formatter.match({
  "location": "LeaseAccelaratorSearchStepDef.user_logins_to_page()"
});
formatter.result({
  "duration": 3849788100,
  "status": "passed"
});
formatter.match({
  "location": "LeaseAccelaratorSearchStepDef.enters_valid_Credentials()"
});
formatter.result({
  "duration": 576106900,
  "status": "passed"
});
formatter.match({
  "location": "LeaseAccelaratorSearchStepDef.clicks_on_the_Login_button()"
});
formatter.result({
  "duration": 3889447400,
  "status": "passed"
});
formatter.match({
  "location": "LeaseAccelaratorSearchStepDef.successful_login_message_should_be_displayed_on_the_console_window()"
});
formatter.result({
  "duration": 996202200,
  "status": "passed"
});
});