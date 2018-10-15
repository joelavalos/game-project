package edu.joel.domain.character.player.impl;

import static org.junit.Assert.assertEquals;

import edu.joel.domain.character.Character;
import edu.joel.domain.item.weapon.Weapon;
import edu.joel.domain.item.weapon.impl.Sword;
import org.junit.Before;
import org.junit.Test;

public class MageHeroeTest {

  private Character mageHeroe;

  @Before
  public void setup() {
    mageHeroe = new MageHeroe();
    ((MageHeroe) mageHeroe).setMaxHealth(100);
    ((MageHeroe) mageHeroe).setCurrentHealth(100);
    ((MageHeroe) mageHeroe).setAttack(5);
    ((MageHeroe) mageHeroe).setDefense(50);
  }

  @Test
  public void getTotalScoreWithoutWeaponTest() {
    assertEquals(255, mageHeroe.getTotalScore(), 0);
  }

  @Test
  public void getTotalScoreWithWeaponTest() {
    Weapon sword = new Sword("Sword effect", 15, 5, false);
    ((MageHeroe) mageHeroe).setRightHandWeapon(sword);

    assertEquals(275, mageHeroe.getTotalScore(), 0);
  }

  @Test
  public void getTotalScoreWithNullWeaponTest() {
    ((MageHeroe) mageHeroe).setRightHandWeapon(null);

    assertEquals(255, mageHeroe.getTotalScore(), 0);
  }
}