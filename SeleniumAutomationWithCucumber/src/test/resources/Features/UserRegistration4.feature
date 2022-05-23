@Regression
Feature: 1st feature

  Scenario: Naivgation scenario4
    Given I navigate to flipkart website
    When I enter username as "9618095002"
    When I enter below password
    """
    password
    """
    When I click on sign-in button


#
#  Scenario Outline: Naivgation scenario for <username>
#    Given I navigate to flipkart website
#    When I enter username as "<username>"
#    When I enter password as "<password>"
#    Examples:
#      |username  |password|
#    |        96180950023  |  passwords      |
#      |        96180950023  |  passwords      |
#      |        96180950023  |  passwords      |
#      |        96180950023  |  passwords      |
#      |        96180950023  |  passwords      |

  Scenario: Naivgation scenario
    Given I navigate to flipkart website
    When I enter username as "9618095002"
    When I enter below password
    """
    password
    """
    When I click on sign-in button
    Then Verify Login is Successful