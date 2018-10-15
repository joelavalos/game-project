package edu.joel.domain.arena;

import edu.joel.domain.character.Character;
import java.util.List;

public abstract class ArenaBase {

  protected String winnerTeam;

  protected List<Character> heroes;

  protected float heroesScore;

  protected List<Character> enemies;

  protected float enemiesScore;

  protected ArenaBase() {

  }

  public ArenaBase(List<Character> heroe, List<Character> enemies) {
    this.heroes = heroe;
    this.enemies = enemies;
  }

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

  public String getWinnerTeam() {
    return winnerTeam;
  }

  public void setWinnerTeam(String winnerTeam) {
    this.winnerTeam = winnerTeam;
  }

  public float getHeroesScore() {
    return heroesScore;
  }

  public void setHeroesScore(float heroesScore) {
    this.heroesScore = heroesScore;
  }

  public float getEnemiesScore() {
    return enemiesScore;
  }

  public void setEnemiesScore(float enemiesScore) {
    this.enemiesScore = enemiesScore;
  }
}