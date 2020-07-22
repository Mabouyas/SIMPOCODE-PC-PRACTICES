@Login
Feature: Login feature

   As a user, I should be able to login with correct credentials to different accounts. And
  dashboard should be displayed

  @Librarian
  Scenario: Librarian Login scenario
    Given User is on the login page
    When User librarian logs in successfully
    Then Dashboard should be displayed

  @Student
  Scenario: Student Login scenario
    Given User is on the login page
    When User student logs in successfully
    Then Dashboard should be displayed

  @Admin
  Scenario: Admin Login scenario
    Given User is on the login page
    When User admin logs in successfully
    Then Dashboard should be displayed

