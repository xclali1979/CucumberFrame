@TEC-103
Feature: Etsy Search Functionality

  @TECTC-1011
  Scenario Outline: Validate Etsy Search message
    Given Navigate Etsy Homepage
    When User searches for "<item>"
    Then Validate search message have word "<item>"
    Examples:
      | item   |
      | carpet |
      | 123    |

  @TECTC-1012
  Scenario Outline: Validate each department of Etsy has valid title
    Given Navigate Etsy Homepage
    When User clicks on "<department>"
    Then User validate title "<title>"
    Examples:
      | department            | title                         |
      | Jewelry & Accessories | Jewelry & Accessories \| Etsy |
      | Clothing & Shoes      | Clothing & Shoes \| Etsy      |
      | Home & Living         | Home & Living \| Etsy         |
      | Wedding & Party       | Wedding & Party \| Etsy       |
      | Toys & Entertainment  | Toys & Entertainment \| Etsy  |
