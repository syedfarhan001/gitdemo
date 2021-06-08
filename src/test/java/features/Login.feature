Feature: Login application

Scenario: Check if user able to login
Given user lands at the page with username "farhan" and password "456"
When he enter his details
Then he gets a success message
And he becomes happy

Scenario: Checking if regular expn works
Given user lands at the page with username "farhan" and password "456"
When he enter his details
Then he gets a failure message
And he becomes happy