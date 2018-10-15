package edu.joel.domain.character.animal;

import static org.junit.Assert.assertEquals;

import edu.joel.domain.character.Character;
import edu.joel.domain.character.animal.impl.MoleRat;
import org.junit.Before;
import org.junit.Test;

public class MoleRatTest {

  private Character enemy;

  @Before
  public void setup() {

    enemy = new MoleRat();
    ((MoleRat) enemy).setMaxHealth(100);
    ((MoleRat) enemy).setCurrentHealth(100);
    ((MoleRat) enemy).setAttack(5);
    ((MoleRat) enemy).setDefense(50);
  }

  @Test
  public void getTotalScoreWithoutWeaponTest() {
    assertEquals(255, enemy.getTotalScore(), 0);
  }
}