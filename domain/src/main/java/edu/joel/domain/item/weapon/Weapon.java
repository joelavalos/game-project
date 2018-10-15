package edu.joel.domain.item.weapon;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.CLASS,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type")
public interface Weapon {

  void applyEffect();

  float getTotalScore();
}
