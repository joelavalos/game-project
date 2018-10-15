package edu.joel.domain.character.player;

import edu.joel.domain.quest.Quest;
import edu.joel.domain.item.weapon.Weapon;

public abstract class HeroeBase {

  protected float maxHealth;

  protected float currentHealth;

  protected float attack;

  protected float defense;

  protected Quest quest;

  protected Weapon rightHandWeapon;

  public HeroeBase() {
  }

  public HeroeBase(float maxHealth, float currentHealth, float attack, float defense,
      Quest quest, Weapon rightHandWeapon) {
    this.maxHealth = maxHealth;
    this.currentHealth = currentHealth;
    this.attack = attack;
    this.defense = defense;
    this.quest = quest;
    this.rightHandWeapon = rightHandWeapon;
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
    return attack;
  }

  public void setAttack(float attack) {
    this.attack = attack;
  }

  public float getDefense() {
    return defense;
  }

  public void setDefense(float defense) {
    this.defense = defense;
  }

  public Quest getQuest() {
    return quest;
  }

  public void setQuest(Quest quest) {
    this.quest = quest;
  }

  public Weapon getRightHandWeapon() {
    return rightHandWeapon;
  }

  public void setRightHandWeapon(Weapon rightHandWeapon) {
    this.rightHandWeapon = rightHandWeapon;
  }

}