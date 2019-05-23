package com.greenfox.tamagochi.controllers;

import com.greenfox.tamagochi.Service.FoxService;
import com.greenfox.tamagochi.model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

  private FoxService foxService;
  private String currentFox;

  public HomeController(FoxService foxService) {
    this.foxService = foxService;
  }

  @GetMapping("/")
  public String Colored(Model model) {
    return "welcome";
  }

  @GetMapping("/login")
  public String LogIn(Model model) {
    model.addAttribute("title", "Welcome to the Fox Club");
    return "login";
  }

  @PostMapping("/login")
  public String LoggedIn(Model model, String name) {
    if (foxService.isThere(name)) {
      currentFox = name;
      model.addAttribute("color", "/" + foxService.getFoxByName(currentFox).getColor() + ".png");
      model.addAttribute("text", foxService.getFoxByName(currentFox).describe());
      return "info";
    } else {
      model.addAttribute("title", "Incorrect Fox name, please try again!");
      return "login";
    }

  }

  @GetMapping("/create")
  public String Create(Model model) {
    model.addAttribute("colors", foxService.getColors());
    return "create";
  }

  @PostMapping("/create")
  public String email(Model model, String name, String color, String gender) {
    currentFox = name;
    Fox newFox = new Fox(name, gender, color);
    foxService.addFox(newFox);
    model.addAttribute("color", "/" + foxService.getFoxByName(currentFox).getColor() + ".png");
    model.addAttribute("text", foxService.getFoxByName(currentFox).describe());
    return "info";
  }

  @GetMapping("/info")
  public String Info(Model model) {
    model.addAttribute("color", "/" + foxService.getFoxByName(currentFox).getColor() + ".png");
    model.addAttribute("text", foxService.getFoxByName(currentFox).describe());
    return "info";
  }
}


