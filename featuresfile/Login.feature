Feature: Login Functionality

@SmokeTest, @Regression
Scenario Outline: Login Functionality with valid userName and Password
Given user launch the apllication
When user enter valid userName "<userName>"
And user enter valid password "<Password>"
When user clicked on the login button
Then user is on the home page of the application

Examples:
|userName|Password|
|pratikgavane@gmail.com|ABCD|


@Sanity
Scenario Outline: Login Functionality with valid userName and Password
Given user launch the apllication
When user enter valid userName "<userName>"
And user enter valid password "<Password>"
When user clicked on the login button
Then user is on the home page of the application

Examples:
|userName|Password|
|pratikgavane@gmail.com|ABCD|