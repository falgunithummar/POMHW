@Test
  Feature: Registration
    Scenario: As a user, i should be able to register successfully
    so that, i can use all the user features on demoNopcommerce website

  Given I am on registration page
  When I enter required registration details
  And I click on submit button
  Then I should be able to register successfully

