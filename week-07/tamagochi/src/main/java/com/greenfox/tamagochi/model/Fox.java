package com.greenfox.tamagochi.model;

import java.util.ArrayList;
import java.util.List;

public class Fox {
  private String name;
  private String gender;
  private List<String> tricks;
  private String eats;
  private String drinks;
  private String color;
  private List<String> possibleTricks;
  private List<String> possibleEats;
  private List<String> possibleDrinks;



  public Fox(String name, String gender, String color) {
    tricks = new ArrayList<>();
    possibleTricks = new ArrayList<>();
    possibleEats = new ArrayList<>();
    possibleDrinks = new ArrayList<>();
    possibleTricks.add("play");
    possibleTricks.add("inject dependencies");
    possibleTricks.add("paint");
    possibleTricks.add("snore");
    possibleTricks.add("handstand");
    possibleTricks.add("cook");
    possibleTricks.add("sleep");
    possibleEats.add("watermelon");
    possibleEats.add("dry bread");
    possibleEats.add("cake");
    possibleEats.add("pizza");
    possibleDrinks.add("lemonade");
    possibleDrinks.add("wine");
    possibleDrinks.add("milkshake");
    possibleDrinks.add("water");

    this.name = name;
    this.gender = gender;
    //this.eats = eats;
    eats = "dry bread";
    drinks = "water";
    //this.drinks = drinks;
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getTricks() {
    return tricks;
  }
  /*

  public String listTricks() {
    StringBuilder output = new StringBuilder();
    if (tricks.size() == 1) {
      output.append(tricks.get(1));
    } else {
      for (String trick : tricks) {
        output.append(", " + trick);
      }
    }
    return output.toString();
  }

   */

  public void addToTricks(String trick) {
    tricks.add(trick);
    possibleTricks.remove(trick);
  }

  public String getEats() {
    return eats;
  }

  public void setEats(String eats) {
    possibleEats.add(eats);
    this.eats = eats;
    possibleEats.remove(eats);
  }

  public String getDrinks() {
    return drinks;
  }

  public void setDrinks(String drinks) {
    possibleDrinks.add(drinks);
    this.drinks = drinks;
    possibleDrinks.remove(drinks);
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public void setTricks(List<String> tricks) {
    tricks = tricks;
  }

  public String describe() {
    if (tricks.size() == 0) {
      return "This is " + getName() + ". " + "Currently living on " + eats + " and " + drinks + ". " + gender + " knows no tricks yet.";
    } else {
      return "This is " + getName() + ". " + "Currently living on " + gender + " knows " + tricks.size() + " tricks.";
    }
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void learnTrick(String trick) {
    tricks.add(trick);
  }

  public boolean isThereTrick(String name) {
    return tricks.contains(name);
  }

  public List<String> getPossibleTricks() {
    return possibleTricks;
  }

  public void setPossibleTricks(List<String> possibleTricks) {
    this.possibleTricks = possibleTricks;
  }
}
