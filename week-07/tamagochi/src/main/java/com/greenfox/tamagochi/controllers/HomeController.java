package com.greenfox.tamagochi.controllers;

import com.greenfox.tamagochi.Service.FoxService;
import com.greenfox.tamagochi.model.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.xml.stream.events.Attribute;
import java.util.jar.Attributes;

@Controller
public class HomeController {

  private FoxService foxService;
  private String currentFox;

  public HomeController(FoxService foxService) {
    this.foxService = foxService;
  }

  @GetMapping("/")
  public String Colored(Model model) {
    model.addAttribute("foxTest", foxService.getFoxes().size() != 0);
    model.addAttribute("foxName", currentFox);
    model.addAttribute("title", foxService.getFoxes().size() == 0);
    model.addAttribute("title", "Please log in!");
    return "login";
  }

  @GetMapping("/login")
  public String LogIn(Model model) {
    model.addAttribute("foxTest", foxService.getFoxes().size() != 0);
    model.addAttribute("foxName", currentFox);
    model.addAttribute("title", "Please log in!");
    return "login";
  }

  @PostMapping("/login")
  public String LoggedIn(Model model, String name) {
    if (foxService.isThereFox(name)) {
      currentFox = name;
      model.addAttribute("text", foxService.getFoxByName(name).describe());
      model.addAttribute("fulltext", foxService.getFoxByName(currentFox).getFullness());
      return "redirect:/info?name=" + name;
    } else {
      model.addAttribute("title", "Incorrect Fox name, please try again!");
      return "login";
    }
  }

  @GetMapping("/create")
  public String Create(Model model) {
    model.addAttribute("foxTest", foxService.getFoxes().size() != 0);
    model.addAttribute("foxName", currentFox);
    model.addAttribute("colors", foxService.getColors());
    model.addAttribute("title", "Create a new fox!");
    return "create";
  }

  @PostMapping("/create")
  public String Create(Model model, String name, String color, String gender) {
    if (!foxService.isThereFox(name)) {
      currentFox = name;
      Fox newFox = new Fox(name, gender, color);
      foxService.addFox(newFox);
      model.addAttribute("text", foxService.getFoxByName(currentFox).describe());
      model.addAttribute("fulltext", foxService.getFoxByName(currentFox).getFullness());

      return "redirect:/info?name=" + name;
    } else {
      model.addAttribute("colors", foxService.getColors());
      model.addAttribute("title", "There is already a fox with that name, please choose a different one!");
      return "create";
    }
  }

  @GetMapping("/info")
  public String Info(Model model) {
    model.addAttribute("foxTest", foxService.getFoxes().size() != 0);
    model.addAttribute("foxName", currentFox);
    model.addAttribute("color", "/" + foxService.getFoxByName(currentFox).getColor() + ".png");
    model.addAttribute("colordead", "/" + foxService.getFoxByName(currentFox).getColor() + "-dead.png");
    model.addAttribute("text", foxService.getFoxByName(currentFox).describe());
    model.addAttribute("trickText", foxService.getFoxByName(currentFox).getTricks().size() == 0);
    model.addAttribute("tricks", foxService.getFoxByName(currentFox).getTricks());
    model.addAttribute("fulltext", foxService.getFoxByName(currentFox).getFullness());
    model.addAttribute("isalive", foxService.getFoxByName(currentFox).isAlive());
    return "info";
  }

  @GetMapping("/learn")
  public String Learn(Model model) {
    model.addAttribute("foxTest", foxService.getFoxes().size() != 0);
    model.addAttribute("foxName", currentFox);
    model.addAttribute("tricks", foxService.getFoxByName(currentFox).getPossibleTricks());
    //model.addAttribute("title", "Learn a new trick!");
    model.addAttribute("trickTest", foxService.getFoxByName(currentFox).getPossibleTricks().size() != 0);
    return "learn";
  }

  @PostMapping("/learn")
  public String Learn(Model model, String trick) {
    foxService.getFoxByName(currentFox).addToTricks(trick);
    model.addAttribute("trickText", "Known tricks");
    model.addAttribute("text", foxService.getFoxByName(currentFox).describe());
    model.addAttribute("tricks", foxService.getFoxByName(currentFox).getTricks());
    model.addAttribute("fulltext", foxService.getFoxByName(currentFox).getFullness());
    return "redirect:/info?name=" + currentFox;
  }

  @GetMapping("/nutrition")
  public String Nutrition(Model model) {
    model.addAttribute("foxTest", foxService.getFoxes().size() != 0);
    model.addAttribute("foxName", currentFox);
    model.addAttribute("currentDrink", foxService.getFoxByName(currentFox).getDrinks());
    model.addAttribute("foods", foxService.getFoxByName(currentFox).getPossibleEats());
    model.addAttribute("drinks", foxService.getFoxByName(currentFox).getPossibleDrinks());
    model.addAttribute("foodTitle", "What to eat?");
    model.addAttribute("drinkTitle", "What to drink?");
    return "nutrition";
  }

  @PostMapping("/nutrition")
  public String Nutrition(Model model, String food, String drink) {
    foxService.getFoxByName(currentFox).setEats(food);
    foxService.getFoxByName(currentFox).setDrinks(drink);
    foxService.getFoxByName(currentFox).feed();
    model.addAttribute("foxTest", foxService.getFoxes().size() != 0);
    model.addAttribute("foxName", currentFox);
    model.addAttribute("text", foxService.getFoxByName(currentFox).describe());
    model.addAttribute("trickText", "Known tricks");
    model.addAttribute("tricks", foxService.getFoxByName(currentFox).getTricks());
    model.addAttribute("fulltext", foxService.getFoxByName(currentFox).getFullness());

    return "redirect:/info?name=" + currentFox;
  }
}


