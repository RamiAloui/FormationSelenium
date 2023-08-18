
@test
Feature: Authentification
  En tant que un administrateur je dois m authentifier avec un login et un mot de passe valide

  @testpasssant
  Scenario: Authentification valide
    Given ouvrir navigateur chrome
    And ouvrir url
    When saisir mail
    And saisir mot de passe
    And cliquer sur le bouton
    Then Verifier page home
   

 