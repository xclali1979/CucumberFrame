@TEC-102
Feature: Adding Order

  Scenario: Verify create order functionality
    Given Navigate to login page
    Then Then User logs in with valid credential username"Tester" password"test"
    And User cliks on order
    Then User creates new order
      | Product Name | Quantity | Customer Name | Street  | City | Zip   | Card Number | Expire Date |
      | ScreenSaver  | 2        | Techtorial    | Chicago | IL   | 60000 | 123456890   | 12/21       |
      | ScreenSaver  | 5        | Techtorial    | Chicago | IL   | 60000 | 123456890   | 12/21       |

    Then User verifies order is created
