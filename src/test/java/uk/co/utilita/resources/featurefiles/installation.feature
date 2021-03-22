Feature: Installation functionality
  As a user
  I want to visit utilita help page

  Scenario: User should able to visit utilita help page
    Given I am on the utilita website

    When user clicks on Help Then Help screen (https://utilita.co.uk/help) will load

    When user clicks Manage your install

    Then Manage your install screen will load

    When user clicks ‘Installation’

    Then installing your Smart Meter screen will show

    When user selects ‘Send us an email’

    Then ‘Manage your install’ drop down will open

    When user clicks ‘Have a question about your install?’

    Then contact form will load

    When user chooses ‘A question about my install’ from the ‘How can we help’ field

    And no other details are filled out

    And clicks Submit button

    Then error message ‘This field is required’ will show below the field ‘Title’

    And error message ‘This field is required’ will show below the field ‘First name’

    And error message ‘This field is required’ will show below the field ‘Last name’

    And error message ‘This field is required’ will show below the field ‘Address 1’

    And error message ‘Preferred contact method’

    And error message ‘This field is required’ will show below the field ‘Your question’

