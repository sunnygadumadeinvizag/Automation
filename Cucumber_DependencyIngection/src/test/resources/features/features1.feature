Feature: 1st feature

  Scenario: new scenario
    Given a book exists with an isbn of "bingo"
    When a user retrieves the book by isbn
    And response includes the following in any order
    Then the status code is 200
    And response includes the following
   |Body|bing|