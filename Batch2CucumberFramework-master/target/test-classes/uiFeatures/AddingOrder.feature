@TEC-102
Feature: Adding Order

  Scenario: Verify create order functionality
    Given Navigate to login page
    Then User logs in with valid credentials username "Tester" password "test"
    And User clicks on Order
    Then User creates new order
      | Product Name | Quantity | Customer Name | Street     | City    | State | Zip   | Card Nr    | Expire Date |
      | ScreenSaver  | 2        | Techtorial    | 123 N tech | Chicago | IL    | 60000 | 1234567890 | 12/21       |
    Then User verifies Order "is" created

  Scenario: Verify create order functionality with invalid data
    Given Navigate to login page
    Then User logs in with valid credentials username "Tester" password "test"
    And User clicks on Order
    Then User creates new order
      | Product Name | Quantity | Customer Name | Street     | City    | State | Zip   | Card Nr    | Expire Date |
      | ScreenSaver  | 2        | Techtorial    | 123 N tech | Chicago | IL    | zipCode | 1234567890 | 12/21       |
    Then User verifies Order "is NOT" created
