package edu.joel.domain.character.enemy;

public abstract class EnemyBase {

  protected float maxHealth;

  protected float currentHealth;

  protected float attack;

  protected float defense;

  public EnemyBase() {
  }

  public EnemyBase(final float maxHealth, final float currenthealth, final float attakc,
      final float defense) {

    this.maxHealth = maxHealth;
    this.currentHealth = currenthealth;
    this.attack = attakc;
    this.defense = defense;
  }

  public float getMaxHealth() {
    return maxHealth;
  }

  public void setMaxHealth(float maxHealth) {
    this.maxHealth = maxHealth;
  }

  public float getCurrentHealth() {
    return currentHealth;
  }

  public void setCurrentHealth(float currentHealth) {
    this.currentHealth = currentHealth;
  }

  public float getAttack() {
    return this.attack;
  }

  public void setAttack(float attack) {
    this.attack = attack;
  }

  public float getDefense() {
    return this.defense;
  }

  public void setDefense(float defense) {
    this.defense = defense;
  }
}