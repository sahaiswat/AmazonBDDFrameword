Feature: Deal data creation

Scenario: Free CRM Create a new deal scenario

Given User is on CRM Login Page

When Title of page is Free CRM

Then User enters user and pass
|username | password|
|sahaiswat@gmail.com | 	P@ssword123|

Then User Logs in

Then User moves to Deals page

Then User clicks on New button

Then User enters deal details
|Title|Description|Probability|Commission|
|Ms|Test_deal1|1000|50|
|Mr|Test_deal2|2000|50|
|Mrs|Test_deal3|3000|50|
|Miss|Test_deal4|4000|50|

Then Closes the CRM applicaion
