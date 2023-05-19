Feature: cheapair fligth booking

  @tag1
  Scenario: Search fligth
    Given Launch the website
    When Enter the from to locations and count of passengers
    And Select the lowest price fligth for depart and return
    And Enter the details of passengers
      | Tamilmani   | P | Male   | June     | 06 | 1955 |
      | lokesh      | S | Male   | December | 13 | 1997 |
      | raja        | P | Male   | July     | 13 | 1972 |
      |brindha      | R | Female | March    | 06 | 1982 |
      | ravimurugan | T | Male   | December | 16 | 1992 |
      | swetha      | S | Female | June     | 06 | 2003 |
      | shruthi     | K | Female | August   | 24 | 2015 |
      | anu         | K | Female | February | 21 | 2017 |
    And Enter the cerdit card details
      | 1234567899842641 | 016 - April | 2025 | 0780 | Ravimurugan | India | Thottiyam,Trichy,tamilnadu | Trichy | 9842641518 |
    Then Click on purchase button 