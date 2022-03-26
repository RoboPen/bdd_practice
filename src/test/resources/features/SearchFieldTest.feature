Feature: Test scenarios for search field
  Background: User opens website
    Given User is on "Index Page"

  Scenario Outline: Verify no result for incorrect input
    When User enters "<input>" into searchbar on "Index Page"

    Then "No results for <input>" on "Search Result Page" is displayed

    Examples:
      | input                            |
      | qwrt4Q&577&&$$$fdsbdrewrewrewrew |

  Scenario Outline: Verify input is present in result info bar
    When User enters "<input>" into searchbar on "Index Page"

    Then "<input>" in result info bar on "Search Result Page" is displayed

    Examples:
      | input  |
      | laptop |
      | mouse  |
      | shovel |

  Scenario Outline: Verify any result title contains input
    When User enters "<input>" into searchbar on "Index Page"

    Then At least one title contains input on "Search Result Page"

    Examples:
      | input     |
      | laptop    |
      | keyboard  |
      | mouse pad |