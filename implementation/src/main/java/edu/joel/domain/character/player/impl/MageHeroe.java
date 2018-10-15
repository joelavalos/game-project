package edu.joel.domain.character.player.impl;

import edu.joel.domain.character.Character;
import edu.joel.domain.character.player.HeroeBase;

public class MageHeroe extends HeroeBase implements Character {

  @Override
  public void attack() {

  }

  @Override
  public float getTotalScore() {
    float weaponScore = (rightHandWeapon != null ? rightHandWeapon.getTotalScore() : 0);
    return maxHealth + currentHealth + attack + defense + weaponScore;
  }
}