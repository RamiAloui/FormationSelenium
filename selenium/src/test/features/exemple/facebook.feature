
@testfacebook
Feature: creation compte facebook
  En tant que administrateur je dois creer un compte facebook
  


  @testpassant
  Scenario: creation compte facebook valide
    Given ouvrir navigateur chromee
    And ouvrir url "https://www.facebook.com/"
    When cliquer sur creer un compte
    And saisir nom "jeremy"
    And saisir prenom "jhonson"
    And saisir mail "jjhonson@mail.com"
    And saisir mail de confirmation "jjhonson@mail.com"
    And saisir mot de passe "Jhonson1234"
    And choisir jour de naissance "8"
    And choisir mois de naissance "6"
    And choisir annee de naissance "1995"
    And choisir genre "Homme"
    And cliquer sur le bouton sinscrire
    Then Verifier la page home 
    
    
  @tag2_cas_personnalise
  Scenario: creation compte facebook valide avec genre personnalise
    Given ouvrir navigateur chromee
    And ouvrir url "https://www.facebook.com/"
    When cliquer sur creer un compte
    And saisir nom "kais"
    And saisir prenom "saied"
    And saisir mail "azerty1234@gmail.com"
    And saisir mail de confirmation "azerty1234@gmail.com"
    And saisir mot de passe "azerty"
    And choisir jour de naissance "11"
    And choisir mois de naissance "10"
    And choisir annee de naissance "1905"
    When choisir genre "personnalise" et selectionner "1"
    And cliquer sur le bouton sinscrire
    Then Verifier la page home 

  @tag3_cas_accepter
  Scenario Outline: cas d acceptance
    Given ouvrir navigateur chromee
    And ouvrir url "https://www.facebook.com/"
    When cliquer sur creer un compte
    And saisir nom "<nom>"
    And saisir prenom "<prenom>"
    And saisir mail "<mail>"
    And saisir mail de confirmation "<mail>"
    And saisir mot de passe "<mdp>"
    And choisir jour de naissance "<jdn>"
    And choisir mois de naissance "<mdn>"
    And choisir annee de naissance "<adn>"
    And choisir genre "<genre>"
    And cliquer sur le bouton sinscrire
    Then Verifier la page home

    Examples: 
      | nom   | prenom | mail                     | mdp        | jdn | mdn | adn  | genre |
      | kais  | salah  | mohamed.salah54@gmail.fr | salah12345 |  15 |  12 | 2000 | Homme |
      | leila | fatma  | lailaaftma45@hotmail.fr  | fatma12578 |  30 |  10 | 1994 | femme |
