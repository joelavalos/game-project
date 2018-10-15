package edu.joel.domain.arena.impl;

import edu.joel.domain.arena.Arena;
import edu.joel.domain.arena.ArenaBase;
import edu.joel.domain.character.Character;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FireArena extends ArenaBase implements Arena {

  private static final Logger logger = LogManager.getLogger("Fire Arena");

  private static final String HEROE_TEAM_WINS = "Heroe team wins";

  private static final String ENEMY_TEAM_WINS = "Enemy team wins";

  private static final String TEAMS_TIE = "Teams tie";

  public FireArena(List<Character> heroes, List<Character> enemies) {
    super(heroes, enemies);
  }

  @Override
  public void start() {
    logger.info("Battle Started");

    heroesScore = (float) heroes.stream()
        .mapToDouble(Character::getTotalScore)
        .sum();

    enemiesScore = (float) enemies.stream()
        .mapToDouble(Character::getTotalScore)
        .sum();

    if (heroesScore > enemiesScore) {
      winnerTeam = HEROE_TEAM_WINS;

    } else if (enemiesScore > heroesScore) {
      winnerTeam = ENEMY_TEAM_WINS;

    } else {
      winnerTeam = TEAMS_TIE;
    }
  }

  @Override
  public void stop() {

  }

  @Override
  public void restart() {

  }
}