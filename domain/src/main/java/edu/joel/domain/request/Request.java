package edu.joel.domain.request;

import edu.joel.domain.character.Character;
import java.util.List;

public class Request {

  List<Character> heroes;

  List<Character> enemies;

  public List<Character> getHeroes() {
    return heroes;
  }

  public void setHeroes(List<Character> heroes) {
    this.heroes = heroes;
  }

  public List<Character> getEnemies() {
    return enemies;
  }

  public void setEnemies(List<Character> enemies) {
    this.enemies = enemies;
  }
}