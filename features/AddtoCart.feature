Feature: AddToCart

Scenario: AddToCart and CheckOut

Given User lands on Home Page
And Search for a product
Then User selects second product and click on it
When the Page loads the details of the product
And get the product name from product page
And Clicks on Add to Cart button
Then cart will open with containing product
And verify product name
And checkout button will displayed
