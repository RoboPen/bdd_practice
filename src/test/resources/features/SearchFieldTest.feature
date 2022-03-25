Feature: Test scenarios for search field

  Scenario Outline: Verify no result for incorrect input
    Given User is on "Index Page"

    When User enters "<input>" into searchbar on "Index Page"

    Then "No results for <input>" on "Search Result Page" is printed

    Examples:
      | input                             |
      | qwrt4Q&577&&$$$fdsbdrewrewrewrew  |

  Scenario Outline: Verify input is present in result info bar
    Given User is on "Index Page"

    When User enters "<input>" into searchbar on "Index Page"

    Then "<input>" in result info bar on "Search Result Page" is displayed

    Examples:
      | input  |
      | laptop |

  Scenario Outline: Verify any result title contains input
    Given User is on "Index Page"

    When User enters "<input>" into searchbar on "Index Page"

    Then At least one title contains input on "Search Result Page"

    Examples:
      | input  |
      | laptop |