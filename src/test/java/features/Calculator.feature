Feature: This feature would be creating the calculator for ADD and Substract

  Scenario Outline: Add the two numbers in calculator
    Given I have a calculator
    When I add <Num1> and <Num2>
    Then I should get result as <addresult>

    Examples: 
      | Num1 | Num2 | addresult |
      |    9 |    8 |        17 |
      |    7 |    3 |        10 |

  Scenario Outline: Subtract the two numbers in calculator
    Given I have a calculator
    When I sub <Num3> and <Num4>
    Then I should get the result as <subresult>

    Examples: 
      | Num3 | Num4 | subresult |
      |    9 |    8 |         1 |
      |    7 |    3 |         4 |

  Scenario: Add multiple numbers using cucumber data table
    Given I have a calculator
    When I add below numbers
      | 4 |
      | 5 |
      | 7 |
      | 8 |
    Then I should get the result as 24

  Scenario: Add multiple numbers using cucumber data table
    Given I have a calculator
    When I add below numbers using List
      |  4 |
      |  5 |
      |  7 |
      |  8 |
      | 10 |
    Then I should get the result as 34

  Scenario: To calculate the total bill of order
    Given I have a calculator
    When I order below items
      | coffee | 23 |
      | tea    | 27 |
    Then I should get result as 50

  Scenario: To calculate the total bill of order using quantity
    Given I have a calculator
    When I order below items and quantity
      | coffee | 1 | 10 |
      | tea    | 2 | 20 |
      | burgur | 3 | 30 |
    Then I should get result as 140
