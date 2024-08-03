Feature: Simple Swaper login functionality test

  Scenario: Check user balance after authorization

    When I authorize to profile
    Then I check that users balance is zero