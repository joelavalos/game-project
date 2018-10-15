package edu.joel.domain.item.weapon.impl;

import static org.junit.Assert.assertEquals;

import edu.joel.domain.item.weapon.Weapon;
import org.junit.Before;
import org.junit.Test;

public class SwordTest {

  private Weapon sword;

  @Before
  public void setup() {
    sword = new Sword("Sword effect", 15, 10, false);
  }

  @Test
  public void getTotalScoreTest() {
    assertEquals(25, sword.getTotalScore(), 0);
  }
}