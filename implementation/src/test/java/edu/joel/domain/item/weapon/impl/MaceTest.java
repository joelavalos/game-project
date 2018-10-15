package edu.joel.domain.item.weapon.impl;

import static org.junit.Assert.assertEquals;

import edu.joel.domain.item.weapon.Weapon;
import org.junit.Before;
import org.junit.Test;

public class MaceTest {

  private Weapon mace;

  @Before
  public void setup() {
    mace = new Mace("Mace effect", 15, 10, false);
  }

  @Test
  public void getTotalScoreTest() {
    assertEquals(25, mace.getTotalScore(), 0);
  }
}