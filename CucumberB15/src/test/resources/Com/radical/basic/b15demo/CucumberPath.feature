Feature: Facebook login
As a fb user, I want to enter username and pwd as a parameter 

Scenario: validate fb login Scenario1
Given open facebook page
When he enters "farhana" as user name
And he enters "pwd" as password
Then check username is present in textbox
