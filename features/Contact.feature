Feature: Contact Us

Scenario Outline: Fill the details and Submit the contact form

Given User lands on Home Page
Then User clicks on Contact Us link
When the User lands on Contact Us form
Then User should enter "<Name>", "<Email-id>" and "<Message>"
And User Clicks on submit
Then A Thankyou Message should be displayed

Examples:
|Name         |Email-id              |Message     |
|Raushan Kumar|flashrk9801@gamil.com |Nice Website|