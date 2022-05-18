
Feature: adiClub
  In order to gain early access to Adidas products, special events, adidas Runtastic premium and more,
  Users can use the adidas membership program “adiClub” to earn points with every purchase and interaction.

Scenario Outline: Outline : AdiClub card is shown in more tab
    Given The user is registered using correct "<FirstName>", "<LastName>", "<Email>", "<Password>" and AdiClub country
    And The user accepted legal consent
    And The user finished the on-boarding
    When The user opens the more tab
    Then The AdiClub card is shown in more tab

    Examples:
      | FirstName | LastName | Email                   | Password|
      | AHD       | QA       | ahd+reg133@runtastic.com | Testtest1!|


  Scenario: User details are shown in the adiClub overview
    Given The adiClub card is shown in the more tab
    When The user taps on the show more option
    Then The user details are shown in the overview tab


  Scenario: User can check the adiClub pass in the adiClub overview
    Given The user is in the overview tab of AdiClub screen
    And The adiClub pass entry point is shown
    When The user taps on adiClub pass entry point
    Then User details are shown in the adiClub
    And The Bar code is shown
    And The info screen can be viewed


  Scenario: User can check the how to earn points screen from the adiClub overview
    Given The user is in the overview tab of AdiClub screen
    And The How to earn points entry point is shown
    When The user taps on how to earn points entry point
    Then The how to earn points screen is shown


  Scenario: User can check the level details in the adiClub overview
    Given The user is in the overview tab of AdiClub screen
    When The user scroll down in the adiClub overview screen
    Then The user can see the current level is unlocked
    And the user can view the level details
    And The user can see the higher levels are locked


  Scenario: New registered user can check the points history in the history tab
    Given The new registered user in the overview tab of AdiClub
    When The user tap on the history tab
    Then The user can see the joined adiClub points in the history tab
