Feature:Login Functionality

Scenario: User should be able to login successfully

Given user is on HomePage

When user logins to page 

And enters valid Credentials

|userName|password|
|opensourcecms|opensourcecms|

And clicks on the Login button

Then Successful login message should be displayed on the console window
