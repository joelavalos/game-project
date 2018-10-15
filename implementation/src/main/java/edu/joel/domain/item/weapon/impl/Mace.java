package edu.joel.domain.item.weapon.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import edu.joel.domain.item.weapon.Weapon;
import edu.joel.domain.item.weapon.WeaponBase;

public class Mace extends WeaponBase implements Weapon {

  public Mace(
      @JsonProperty("customEffect") String customEffect,
      @JsonProperty("damage") float damage,
      @JsonProperty("resistance") int resistance,
      @JsonProperty("broken") boolean broken) {
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