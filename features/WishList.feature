Feature: WishList

Scenario: Validating WishList

Given User lands on Home Page
And User search for gifts in search box
When The Page is displayed user clicks on first product
Then The Page with product details open user get product name
And User clicks on add to Wishlist Option
When user click on wishlist button
Then The wishlist Page is displayed with a welcome message
And user accept the welcome message
Then The product added should be displayed correctly