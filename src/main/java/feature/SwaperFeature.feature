Feature: Simple Swaper login functionality test

  Scenario: Check user balance after authorization

    When I authorize to profile
    Then I check that users balance is 0.00 from "2024-01-01" to "2024-12-31"