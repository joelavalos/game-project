package edu.joel.domain.character.humanoid.impl;

import edu.joel.domain.character.Character;
import edu.joel.domain.character.enemy.EnemyBase;
import edu.joel.domain.item.weapon.Weapon;

public class Raider extends EnemyBase implements Character {

  private Weapon rightHandWeapon;

  public Raider() {
    super();
  }

  public Raider(float maxHealth, float currenthealth, float attack, float defense) {
    super(maxHealth, currenthealth, attack, defense);
  }

  public Weapon getRightHandWeapon() {
    return rightHandWeapon;
  }

  public void setRightHandWeapon(Weapon rightHandWeapon) {
    this.rightHandWeapon = rightHandWeapon;
  }

  @Override
  public void attack() {

  }

  @Override
  public float getTotalScore() {
    float weaponScore = (rightHandWeapon != null ? rightHandWeapon.getTotalScore() : 0);
    return maxHealth + currentHealth + attack + defense + weaponScore;
  }
}