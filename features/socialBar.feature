Feature: SocialBar

  Scenario: Social Bar
    Given User lands on Home Page
    When Click on Facebook logo
    Then facebook page should displayed
    And  Navigate back to BigSmall site
    When Click on Youtube logo
    Then Youtube page should displayed
    And  Navigate back to BigSmall site
    When Click on Twitter logo
    Then Twitter page should displayed
    And  Navigate back to BigSmall site