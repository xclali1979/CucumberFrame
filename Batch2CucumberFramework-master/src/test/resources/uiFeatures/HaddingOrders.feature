@TEC-202

Feature: Adding order functionality

  Scenario:Adding order and verify it
    Given Launch web browser
    Then  User input username"Tester" and pasvword"test" login page
    And   User click order
    Then  User create new order
      | product     | Quantitiy | Discount | customer name | street        | city       | state | zip   | card no   | expire date |
      | ScreenSaver | 10        | 5        | ali veli      | 2355 basswood | Schaumburg | IL    | 60173 | 123456789 | 20/22       |
    Then  User click view all orders and verify is created

  Scenario:Adding order and verify it
    Given Launch web browser
    Then  User input username"Tester" and pasvword"test" login page
    And   User click order
    Then  User create new order
      | product     | Quantitiy | Discount | customer name | street        | city       | state | zip   | card no   | expire date |
      | ScreenSaver | 10        | 5        | ali veli      | 2355 basswood | Schaumburg | IL    | asdf | 123456789 | 20/22       |
    Then  User click view all orders and verify isNot created