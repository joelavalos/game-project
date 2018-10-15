package edu.joel.domain.item.weapon.impl;

import edu.joel.domain.item.weapon.Weapon;
import edu.joel.domain.item.weapon.WeaponBase;

public class Sword extends WeaponBase implements Weapon {

  public Sword() {
    super();
  }

  public Sword(String customEffect, float damage, int resistance, boolean broken) {
    super(customEffect, damage, resistance, broken);
  }

  @Override
  public void applyEffect() {
    System.out.println(customEffect);
  }

  @Override
  public float getTotalScore() {
    return damage + resistance;
  }
}