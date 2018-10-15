package edu.joel.domain.character.humanoid;

import static org.junit.Assert.assertEquals;

import edu.joel.domain.character.Character;
import edu.joel.domain.character.humanoid.impl.Raider;
import edu.joel.domain.item.weapon.Weapon;
import edu.joel.domain.item.weapon.impl.Sword;
import org.junit.Before;
import org.junit.Test;

public class EnemyRaiderTest {

  private Character enemy;

  @Before
  public void setup() {

    enemy = new Raider();
    ((Raider) enemy).setMaxHealth(100);
    ((Raider) enemy).setCurrentHealth(100);
    ((Raider) enemy).setAttack(5);
    ((Raider) enemy).setDefense(50);
  }

  @Test
  public void getTotalScoreWithoutWeaponTest() {
    assertEquals(255, enemy.getTotalScore(), 0);
  }

  @Test
  public void getTotalScoreWithWeaponTest() {
    Weapon sword = new Sword("Sword effect", 15, 5, false);
    ((Raider) enemy).setRightHandWeapon(sword);

    assertEquals(275, enemy.getTotalScore(), 0);
  }

  @Test
  public void getTotalScoreWithNullWeaponTest() {
    ((Raider) enemy).setRightHandWeapon(null);

    assertEquals(255, enemy.getTotalScore(), 0);
  }
}