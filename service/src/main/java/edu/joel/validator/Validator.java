package edu.joel.validator;

import static org.springframework.util.CollectionUtils.isEmpty;

import edu.joel.domain.arena.Arena;
import edu.joel.domain.arena.ArenaBase;
import edu.joel.domain.character.Character;
import java.util.ArrayList;
import java.util.List;

public class Validator {

  private List<String> validationMessages;

  private static final String YOU_NEED_TO_SEND_AT_LEAST_ONE_HEROE = "You need to send at least one heroe";

  private static final String YOU_NEED_TO_SEND_AT_LEAST_ONE_ENEMY = "You need to send at least one enemy";

  private static final String THE_ARENA_CAN_T_BE_NULL = "The arena can't be null";

  private static final String ANY_CHARACTER_CAN_T_BE_NULL = "Any character can't be null";

  public List<String> battleValidator(Arena battle) {

    validationMessages = new ArrayList<>();

    validateBattle(battle);
    validateEnemies(battle);

    return validationMessages;
  }

  private void addIfNull(Character character, List<String> validationMessages) {
    if (character == null) {
      validationMessages.add(ANY_CHARACTER_CAN_T_BE_NULL);
    }
  }

  private void validateEnemies(Arena arena) {
    if (arena != null) {

      if (isEmpty(((ArenaBase)arena).getHeroes())) {
        validationMessages.add(YOU_NEED_TO_SEND_AT_LEAST_ONE_HEROE);
      } else {
        ((ArenaBase)arena).getHeroes().forEach(character -> addIfNull(character, this.validationMessages));
      }

      if (isEmpty(((ArenaBase)arena).getEnemies())) {
        validationMessages.add(YOU_NEED_TO_SEND_AT_LEAST_ONE_ENEMY);

      } else {
        ((ArenaBase)arena).getEnemies().forEach(character -> addIfNull(character, this.validationMessages));
      }
    }
  }

  private void validateBattle(Arena battle) {
    if (battle == null) {
      validationMessages.add(THE_ARENA_CAN_T_BE_NULL);
    }
  }

  public List<String> getValidationMessages() {
    return validationMessages;
  }
}