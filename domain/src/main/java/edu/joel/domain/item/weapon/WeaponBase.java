package edu.joel.domain.item.weapon;

public abstract class WeaponBase {

  protected String customEffect;

  protected float damage;

  protected int resistance;

  protected boolean broken;

  public WeaponBase() {
  }

  public WeaponBase(String customEffect, float damage, int resistance, boolean broken) {
    this.customEffect = customEffect;
    this.damage = damage;
    this.resistance = resistance;
    this.broken = broken;
  }

  public float getDamage() {
    return damage;
  }

  public void setDamage(float damage) {
    this.damage = damage;
  }

  public int getResistance() {
    return resistance;
  }

  public void setResistance(int resistance) {
    this.resistance = resistance;
  }

  public boolean isBroken() {
    return this.broken;
  }

  public void setBroken(boolean broken) {
    this.broken = broken;
  }

  public String getCustomEffect() {
    return customEffect;
  }

  public void setCustomEffect(String customEffect) {
    this.customEffect = customEffect;
  }
}