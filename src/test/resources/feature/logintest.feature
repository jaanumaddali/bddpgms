Feature:test login functionality

Scenario Outline:check login is successful with

Given chrome browser is open
And user is on login page 
When user enters <username> and <password>
And user clicks on login 
Then user is navigated to homepage 


Examples:
|username|password|
|standard_user|secret_sauce|
|problem_user|secret_sauce|
|error_user|secret_sauce|