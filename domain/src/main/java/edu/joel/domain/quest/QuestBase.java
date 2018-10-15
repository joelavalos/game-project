package edu.joel.domain.quest;

public class QuestBase {

  private String description;

  private String status;

  private int Stage;

  private boolean completed;

  public QuestBase(String description, String status, int stage, boolean completed) {
    this.description = description;
    this.status = status;
    this.Stage = stage;
    this.completed = completed;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public int getStage() {
    return Stage;
  }

  public void setStage(int stage) {
    Stage = stage;
  }

  public boolean isCompleted() {
    return completed;
  }

  public void setCompleted(boolean completed) {
    this.completed = completed;
  }
}