
@tag
Feature: authentification orange 



  @tag1
  Scenario: authentification valide orange
    Given Saisir URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When Remplir champs username "Admin"
    And Remplir champs Password "admin123"
    And Cliquer sur la bouton login
    Then acces sur la page home


 