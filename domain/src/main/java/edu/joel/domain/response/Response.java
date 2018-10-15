package edu.joel.domain.response;

import java.util.List;

public class Response {

  private String status;

  private float heroeTeamScore;

  private float enemyTeamScore;

  List<String> validationMessages;

  public List<String> getValidationMessages() {
    return validationMessages;
  }

  public void setValidationMessages(List<String> validationMessages) {
    this.validationMessages = validationMessages;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public float getHeroeTeamScore() {
    return heroeTeamScore;
  }

  public void setHeroeTeamScore(float heroeTeamScore) {
    this.heroeTeamScore = heroeTeamScore;
  }

  public float getEnemyTeamScore() {
    return enemyTeamScore;
  }

  public void setEnemyTeamScore(float enemyTeamScore) {
    this.enemyTeamScore = enemyTeamScore;
  }
}