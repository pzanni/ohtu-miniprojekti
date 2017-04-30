Feature: As a user I want generate BibTex

    Scenario: user generates Bibtex successfully
       Given user has added references
       When  generate Bibtex is selected
       Then  Bibtex is successfully generated

