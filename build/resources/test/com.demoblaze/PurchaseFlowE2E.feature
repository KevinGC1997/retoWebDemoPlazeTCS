Feature: the user make a purchase

  Scenario Outline: the user adds two products to the cart and completes the entire purchase flow
    Given that user access successfully to the <website>
    When the user adds two products to the cart
    Then the user validate completion of the purchase with the <message>

    Examples:
      | website                    | message                      |
      | https://www.demoblaze.com/ | Thank you for your purchase! |