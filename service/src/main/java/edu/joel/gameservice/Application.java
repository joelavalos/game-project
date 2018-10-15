package edu.joel.gameservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;

@SpringBootApplication(scanBasePackages = "edu")
public class Application {

  public static void main(final String... args) {
    //SpringApplication.run(Application.class, args);

    AnimalBase cat = new Cat();

    System.out.println(cat instanceof Animal);

    if (cat instanceof Animal) {
      Object o = (Animal) cat;
    }
  }
}