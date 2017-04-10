Feature: As a user I want to view a list of references

    Scenario: All references are listed
        Given list references is chosen
        When  no conditions for reference filtering are entered
        Then  all references are listed
    
    Scenario: Specific references are listed
        Given list references is chosen
        When  year "1953" is entered as a reference filter
        Then  reference "C programming language" is listed
        And   reference "Introduction to Algorithms" is not listed