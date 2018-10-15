package edu.joel.validator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import edu.joel.domain.arena.Arena;
import edu.joel.domain.arena.ArenaBase;
import edu.joel.domain.arena.impl.FireArena;
import edu.joel.domain.character.Character;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class ValidatorTest {

  private static final String YOU_NEED_TO_SEND_AT_LEAST_ONE_HEROE = "You need to send at least one heroe";

  private static final String YOU_NEED_TO_SEND_AT_LEAST_ONE_ENEMY = "You need to send at least one enemy";

  private static final String THE_ARENA_CAN_T_BE_NULL = "The arena can't be null";

  private static final String ANY_CHARACTER_CAN_T_BE_NULL = "Any character can't be null";

  private Validator validatorService;

  @Before
  public void setup() {
    validatorService = new Validator();
  }

  @Test
  public void validateNullBattle() {

    List<String> validations = validatorService.battleValidator(null);
    assertTrue(validations.contains(THE_ARENA_CAN_T_BE_NULL));

    validatorService.getValidationMessages().clear();
  }

  @Test
  public void validateNotNullAndNotEmptyHeroeList() {

    FireArena battleMock = mock(FireArena.class);
    when(battleMock.getHeroes()).thenReturn(null);

    List<String> validations = validatorService.battleValidator(battleMock);
    assertTrue(!validations.isEmpty());
    assertTrue(validations.contains(YOU_NEED_TO_SEND_AT_LEAST_ONE_HEROE));

    validatorService.getValidationMessages().clear();
  }

  @Test
  public void validateNotNullAndNotEmptyEnemyList() {

    FireArena battleMock = mock(FireArena.class);
    when((battleMock).getHeroes()).thenReturn(null);
    List<String> validations = validatorService.battleValidator(battleMock);

    assertTrue(!validations.isEmpty());
    assertTrue(validations.contains(YOU_NEED_TO_SEND_AT_LEAST_ONE_ENEMY));

    validatorService.getValidationMessages().clear();
  }

  @Test
  public void validateNotNullHeroesInTheList() {

    List<Character> heroes = new ArrayList<>(Arrays.asList(null, null, null));
    FireArena battleMock = mock(FireArena.class);
    when((battleMock).getHeroes()).thenReturn(heroes);
    List<String> validations = validatorService.battleValidator(battleMock);

    assertTrue(!validations.isEmpty());
    assertTrue(validations.contains(ANY_CHARACTER_CAN_T_BE_NULL));

    long matches = validations.stream()
        .filter(item -> item.equals(ANY_CHARACTER_CAN_T_BE_NULL))
        .count();

    assertEquals(3, matches);

    validatorService.getValidationMessages().clear();
  }

  @Test
  public void validateNotNullEnemiesInTheList() {

    List<Character> enemies = new ArrayList<>(Arrays.asList(null, null, null));
    FireArena battleMock = mock(FireArena.class);
    when((battleMock).getHeroes()).thenReturn(enemies);
    List<String> validations = validatorService.battleValidator(battleMock);

    assertTrue(!validations.isEmpty());
    assertTrue(validations.contains(ANY_CHARACTER_CAN_T_BE_NULL));

    long matches = validations.stream()
        .filter(item -> item.equals(ANY_CHARACTER_CAN_T_BE_NULL))
        .count();

    assertEquals(3, matches);

    validatorService.getValidationMessages().clear();
  }

  @Test
  public void validateNotNullHeroesAndEnemiesInTheList() {

    List<Character> enemies = new ArrayList<>(Arrays.asList(null, null, null));
    List<Character> heroes = new ArrayList<>(Arrays.asList(null, null));
    FireArena battleMock = mock(FireArena.class);
    when((battleMock).getEnemies()).thenReturn(enemies);
    when(((ArenaBase)battleMock).getHeroes()).thenReturn(heroes);
    List<String> validations = validatorService.battleValidator(battleMock);

    assertTrue(!validations.isEmpty());
    assertTrue(validations.contains(ANY_CHARACTER_CAN_T_BE_NULL));

    long matches = validations.stream()
        .filter(item -> item.equals(ANY_CHARACTER_CAN_T_BE_NULL))
        .count();

    assertEquals(5, matches);

    validatorService.getValidationMessages().clear();
  }
}