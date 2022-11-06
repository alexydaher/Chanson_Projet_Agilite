@tag
Feature: Get Song and Playlist Score
  avoir le bon score de la chanson ou de la playlist

  @tag1
  Scenario Outline: un utilisateur ch
    Given une chanson
    And un utilisateur
    When un utilisateur ajoute une chanson dans sa playlist
    Then la playlist contient cette chanson
