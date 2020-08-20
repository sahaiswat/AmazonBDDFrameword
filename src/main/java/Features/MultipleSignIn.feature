Feature: Sign In for Amazon

Scenario Outline: Amazon Sign In Test Scenario

Given User is already on Sign In Page

When Title of Sign In Page is Amazon

Then User clicks on Sign In Button

Then User enters "<userid>" and "<passid>"

Then User clicks on Login Button

Then User is on LoginPage

Then Closes the applicaion

Examples:

|userid             |passid|
|sahaiswat@gmail.com  |sw1986@TI|
|chandrasmi@gmail.com |lalok6476|
|123457               |pass|
