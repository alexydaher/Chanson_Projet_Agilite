@tag
Feature: Compare two users' playlists
  ajouter des chansons dans les playlists de deux utilisateurs et comparer leurs scores.

  @tag1
  Scenario Outline: Compare two users' playlists
    Given deux utilisateurs
    And trois chansons
    When deux utilisateurs ajoutent les chansons qu'ils aiment
    Then l'utilisateur avec le score le plus haut gagne
