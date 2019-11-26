@TEC-201
Feature: login Funnctionality

  Scenario Outline: test login
    Given launch web browser
    When user input username"<user>"
    And password "<password>"
    Then User validate login "<page>"
    Examples:
      | user   | password | page             |
      | Tester | test     | Web Orders       |
      | Tester | 1234     | Web Orders Login |
      | test   | test     | Web Orders Login |
      | test   | 1234     | Web Orders Login |

