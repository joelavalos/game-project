package edu.joel.controller.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.joel.domain.arena.Arena;
import edu.joel.domain.arena.ArenaBase;
import edu.joel.domain.arena.impl.FireArena;
import edu.joel.domain.request.Request;
import edu.joel.domain.response.Response;
import edu.joel.validator.Validator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BattleController {

  private Validator validator = new Validator();

  private ObjectMapper mapper = new ObjectMapper();

  private static final Logger logger = LogManager.getLogger("BattleController");

  @RequestMapping(value = "/startbattle", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
  public Response health(@RequestBody Request request) {

    logRequest(request);

    FireArena arenaBase = new FireArena(request.getHeroes(), request.getEnemies());
    Response response = new Response();
    List<String> validationMessages = validator.battleValidator(arenaBase);

    if (validationMessages.isEmpty()) {
      arenaBase.start();
      response.setStatus(arenaBase.getWinnerTeam());
      response.setHeroeTeamScore(arenaBase.getHeroesScore());
      response.setEnemyTeamScore(arenaBase.getEnemiesScore());

    } else {
      response.setStatus("It does not just work");
      response.setValidationMessages(validationMessages);
    }

    logResponse(response);
    return response;
  }

  private void logRequest(Request request) {

    try {
      logger.info("Reguest from user:\n" + mapper.writeValueAsString(request));
    } catch (JsonProcessingException e) {
      logger.info("Can't map the request to json: ");
      e.printStackTrace();
    }
  }

  private void logResponse(Response response) {
    try {
      logger.info("Response from user:\n" + mapper.writeValueAsString(response));
    } catch (JsonProcessingException e) {
      logger.info("Can't map the request to json: ");
      e.printStackTrace();
    }
  }
}
