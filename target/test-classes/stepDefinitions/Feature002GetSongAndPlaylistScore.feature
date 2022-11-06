@tag
Feature: Get Song and Playlist Score
  avoir le bon score de la chanson ou de la playlist

  @tag1
  Scenario Outline: un utilisateur cherche à savoir le score de la chanson
    Given un utilisateur
    And une chanson
    When un utilisateur cherche le score de la chanson qui est dans sa playlist
    Then le score de la chanson est renvoyé

	@tag2
  Scenario Outline: un utilisateur cherche à savoir le total score de la playlist
    Given un utilisateur
    When un utilisateur cherche le score de sa playlist
    Then le score de la playlist est renvoyé
