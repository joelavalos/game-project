package edu.joel.domain.character;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.CLASS,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type")
public interface Character {

  void attack();

  float getTotalScore();
}