Feature: AllofIt

  Scenario: Clicking AllofIt and validating Next Page
    Given User lands on Home Page
    And Clicks on AllOfIt Section from Navigation Bar
    When Product Page should Displayed Click on second page
    Then The user should be taken to second page of product
    And validate Current Page
