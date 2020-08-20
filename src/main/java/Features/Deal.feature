Feature: Deal data creation

Scenario: Free CRM Create a new deal scenario

Given User is on CRM Login Page

When Title of page is Free CRM

Then User enters user and pass
|sahaiswat@gmail.com | 	P@ssword123|

Then User Logs in

Then User moves to Deals page

Then User clicks on New button

Then User enters deal details
|Ms|Test_deal|1000|50|
Then Closes the CRM applicaion
