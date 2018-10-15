package edu.joel.domain.arena.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import edu.joel.domain.character.Character;
import edu.joel.domain.character.animal.impl.MoleRat;
import edu.joel.domain.character.humanoid.impl.Raider;
import edu.joel.domain.character.player.impl.MageHeroe;
import edu.joel.domain.item.weapon.impl.Sword;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class FireArenaTest {

  private static final String HEROE_TEAM_WINS = "Heroe team wins";

  private static final String ENEMY_TEAM_WINS = "Enemy team wins";

  private static final String TEAMS_TIE = "Teams tie";

  private Sword sword;

  @Before
  public void setup() {
    sword = new Sword("Sword effect", 40, 50, false);
  }

  @Test
  public void arenaMoreScoreHeroesThanEnemiesTest() {

    MageHeroe heroe1 = new MageHeroe();
    heroe1.setMaxHealth(100);
    heroe1.setCurrentHealth(5);
    heroe1.setDefense(20);
    heroe1.setAttack(30);
    heroe1.setRightHandWeapon(sword);

    MageHeroe heroe2 = new MageHeroe();
    heroe2.setMaxHealth(10);
    heroe2.setCurrentHealth(5);
    heroe2.setDefense(20);
    heroe2.setAttack(30);

    int totalHeroeExpected = 0;
    totalHeroeExpected += 100+5+20+30+40+50;
    totalHeroeExpected += 10+5+20+30;

    Raider raider1 = new Raider();
    raider1.setMaxHealth(10);
    raider1.setCurrentHealth(5);
    raider1.setDefense(20);
    raider1.setAttack(30);
    raider1.setRightHandWeapon(sword);

    Raider raider2 = new Raider();
    raider2.setMaxHealth(10);
    raider2.setCurrentHealth(5);
    raider2.setDefense(20);
    raider2.setAttack(30);

    MoleRat moleRat = new MoleRat();
    moleRat.setMaxHealth(10);
    moleRat.setCurrentHealth(5);
    moleRat.setDefense(20);
    moleRat.setAttack(30);

    int totalEnemyExpected = 0;
    totalEnemyExpected += 10+5+20+30+40+50;
    totalEnemyExpected += 10+5+20+30;
    totalEnemyExpected += 10+5+20+30;

    List<Character> heroes = new ArrayList<>(Arrays.asList(heroe1, heroe2));
    List<Character> enemies = new ArrayList<>(Arrays.asList(raider1, raider2, moleRat));

    FireArena fireArenaMock = new FireArena(heroes, enemies);
    fireArenaMock.start();

    assertNotNull(fireArenaMock.getWinnerTeam());
    assertEquals(totalHeroeExpected, fireArenaMock.getHeroesScore(), 0);
    assertEquals(totalEnemyExpected, fireArenaMock.getEnemiesScore(), 0);
    assertTrue(fireArenaMock.getHeroesScore() > fireArenaMock.getEnemiesScore());
    assertTrue(totalHeroeExpected > totalEnemyExpected);
    assertEquals(HEROE_TEAM_WINS, fireArenaMock.getWinnerTeam());
  }

  @Test
  public void arenaMoreScoreEnemiesThanHeroesTest() {

    MageHeroe heroe1 = new MageHeroe();
    heroe1.setMaxHealth(100);

    Raider raider1 = new Raider();
    raider1.setDefense(15);

    Sword brutalSword = new Sword();
    brutalSword.setDamage(1200);

    Raider raider2 = new Raider();
    raider2.setDefense(15);
    raider2.setRightHandWeapon(brutalSword);

    List<Character> heroes = new ArrayList<>(Collections.singleton(heroe1));
    List<Character> enemies = new ArrayList<>(Arrays.asList(raider1, raider2));

    FireArena fireArenaMock = new FireArena(heroes, enemies);

    fireArenaMock.start();

    assertNotNull(fireArenaMock.getWinnerTeam());
    assertEquals(100, fireArenaMock.getHeroesScore(), 0);
    assertEquals(1230, fireArenaMock.getEnemiesScore(), 0);
    assertEquals(ENEMY_TEAM_WINS, fireArenaMock.getWinnerTeam());
  }

  @Test
  public void arenaSameAmountOfEnemiesAndHeroesTest() {

    MageHeroe heroe1 = new MageHeroe();
    heroe1.setMaxHealth(100);

    MageHeroe heroe2 = new MageHeroe();
    heroe2.setCurrentHealth(100);

    Raider raider1 = new Raider();
    raider1.setDefense(120);

    MoleRat moleRat1 = new MoleRat();
    moleRat1.setAttack(80);

    List<Character> heroes = new ArrayList<>(Arrays.asList(heroe1, heroe2));
    List<Character> enemies = new ArrayList<>(Arrays.asList(raider1, moleRat1));

    FireArena fireArenaMock = new FireArena(heroes, enemies);

    fireArenaMock.start();

    assertNotNull(fireArenaMock.getWinnerTeam());
    assertEquals(200, fireArenaMock.getHeroesScore(), 0);
    assertEquals(200, fireArenaMock.getEnemiesScore(), 0);
    assertEquals(TEAMS_TIE, fireArenaMock.getWinnerTeam());
  }
}