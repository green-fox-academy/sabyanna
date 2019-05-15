package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class GreetCounter {
  Greeting myGreet = new Greeting( "Hi ");

  @RequestMapping("/web/greetCount")
  public String greeting(Model model) {
    model.addAttribute("name", " World");
    model.addAttribute("id", myGreet.getId().getAndAdd(1));
    return "greetCounter";
  }

}
