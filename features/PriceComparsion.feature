Feature: SearchBar Validation

Scenario: Entering data into search box and validating the results

Given User lands on Home Page
And User pass the input into search box and press Enter
Then Getting first product Price from searchList
And  Clicking on First Product
And getting Product Price from Product Page and matching to SearchList Price
