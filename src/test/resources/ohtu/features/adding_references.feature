Feature: As a user I want to add references

    Scenario: A new reference is added
        Given add new reference is chosen
        When  required fields for a reference are entered
        Then  a new reference is added
    
    Scenario: Adding a reference fails
        Given add new reference is chosen
        When  not all required fields for a reference are entered
        Then  adding a new reference fails