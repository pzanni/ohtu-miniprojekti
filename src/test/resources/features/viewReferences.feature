Feature: As a user I want to view references

    Scenario: user views a list of all references
        Given user has added refences
        When home page is selected
        Then all references are listed

