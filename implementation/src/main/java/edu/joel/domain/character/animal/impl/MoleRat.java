package edu.joel.domain.character.animal.impl;

import edu.joel.domain.character.Character;
import edu.joel.domain.character.enemy.EnemyBase;

public class MoleRat extends EnemyBase implements Character {

  public MoleRat() {
  }

  public MoleRat(final float maxHealth, final float currenthealth, final float attack,
      final float defense) {
    super(maxHealth, currenthealth, attack, defense);
  }

  @Override
  public void attack() {

  }

  @Override
  public float getTotalScore() {
    return maxHealth + currentHealth + attack + defense;
  }
}