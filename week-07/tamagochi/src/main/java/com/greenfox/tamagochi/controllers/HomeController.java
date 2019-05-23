package com.greenfox.tamagochi.controllers;

import com.greenfox.tamagochi.Service.FoxService;
import com.greenfox.tamagochi.model.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

  private FoxService foxService;
  private String currentFox;

  public HomeController(FoxService foxService) {
    this.foxService = foxService;
  }

  @GetMapping("/")
  public String Colored(Model model) {
    model.addAttribute("title", "Please log in!");
    return "login";
  }

  @GetMapping("/login")
  public String LogIn(Model model) {
    model.addAttribute("title", "Please log in!");
    return "login";
  }

  @PostMapping("/login")
  public String LoggedIn(Model model, String name) {
    if (foxService.isThereFox(name)) {
      currentFox = name;
      model.addAttribute("color", "/" + foxService.getFoxByName(name).getColor() + ".png");
      model.addAttribute("text", foxService.getFoxByName(name).describe());
      return "redirect:/info?name=" + name;
    } else {
      model.addAttribute("title", "Incorrect Fox name, please try again!");
      return "login";
    }
  }

  @GetMapping("/create")
  public String Create(Model model) {
    model.addAttribute("colors", foxService.getColors());
    model.addAttribute("title", "Create a new fox!");
    return "create";
  }

  @PostMapping("/create")
  public String email(Model model, String name, String color, String gender) {
    if (!foxService.isThereFox(name)) {
      currentFox = name;
      Fox newFox = new Fox(name, gender, color);
      foxService.addFox(newFox);
      model.addAttribute("color", "/" + foxService.getFoxByName(currentFox).getColor() + ".png");
      model.addAttribute("text", foxService.getFoxByName(currentFox).describe());
      return "redirect:/info?name=" + name;
    } else {
      model.addAttribute("colors", foxService.getColors());
      model.addAttribute("title", "There is already a fox with that name, please choose a different one!");
      return "create";
    }

  }

  @GetMapping("/info")
  public String Info(Model model) {
    model.addAttribute("color", "/" + foxService.getFoxByName(currentFox).getColor() + ".png");
    model.addAttribute("text", foxService.getFoxByName(currentFox).describe());
    if (foxService.getFoxByName(currentFox).getTricks().size()==0) {
      model.addAttribute("trickText", "No tricks :(");
    } else {
      model.addAttribute("trickText", "Tricks:");
      model.addAttribute("tricks", foxService.getFoxByName(currentFox).getTricks());
    }
    return "info";
  }

  @GetMapping("/learn")
  public String Learn(Model model) {
    model.addAttribute("tricks", foxService.getFoxByName(currentFox).getPossibleTricks());
    model.addAttribute("title", "Learn a new trick!");
    return "learn";
  }

  @PostMapping("/learn")
  public String Learn(Model model, String trick) {
    foxService.getFoxByName(currentFox).addToTricks(trick);
    model.addAttribute("text", foxService.getFoxByName(currentFox).describe());
    model.addAttribute("trickText", "Known tricks");
    model.addAttribute("tricks", foxService.getFoxByName(currentFox).getTricks());
    return "redirect:/info?name=" + currentFox;
  }

  @GetMapping("/nutrition")
  public String Nutrition(Model model) {
    model.addAttribute("tricks", foxService.getFoxByName(currentFox).getPossibleTricks());
    model.addAttribute("title", "Learn a new trick!");
    return "learn";
  }

  @PostMapping("/nutrition")
  public String Nutrition(Model model, String trick) {
    foxService.getFoxByName(currentFox).addToTricks(trick);
    model.addAttribute("text", foxService.getFoxByName(currentFox).describe());
    model.addAttribute("trickText", "Known tricks");
    model.addAttribute("tricks", foxService.getFoxByName(currentFox).getTricks());
    return "redirect:/info?name=" + currentFox;
  }
}


