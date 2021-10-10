Feature: Application Login

Background:
  Given Validate the browser
  When Browser is triggered
  Then Check if browser is started

  @RegTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with "Jin" username and password "1234"
    Then Home page is populated
    And Cards displayed are "true"

  @MobileTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with "John" username and password "4321"
    Then Home page is populated
    And Cards displayed are "false"

  @RegTest @SmokeTest @MobileTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User sign up with following details
    | Jenny | 34523 | Jenny@gmail.com | Australia | 22578 |
    | Steve | gmygm | Steven@gmail.com | US | 33597 |
    Then Home page is populated
    And Cards displayed are "false"

  @SmokeTest @RegTest
  Scenario Outline: Home page default login
    Given User is on NetBanking landing page
    When User login into app with <UserName> username and password <Password>
    Then Home page is populated
    And Cards displayed are "true"

    Examples:
      | UserName | Password |
      | user1    | pass1    |
      | user2    | pass2    |
      | user3    | pass3    |
      | user4    | pass4    |
