
@tag
Feature: Authentification orange 
  En tant que administrateur je dois m authentifier avec un login et un mot de passe valide

  @testnonpassants
  Scenario Outline: Authentifications Valides et non Valides
    Given ouvrir navigateur Chrome 
    And ouvrir URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When saisir username "<user>"
    And saisir password "<password>"
    And cliquer sur login
    Then Verifier le test "<message>"

    Examples: 
      | user   | password  | message |
      | Admin  | admin123  | Paul Collings |
      | Admin  | test5678  | Invalid credentials   |
      | Qatest | admin123  | Invalid credentials    |
      | Qatest | qa1234    | Invalid credentials    |
