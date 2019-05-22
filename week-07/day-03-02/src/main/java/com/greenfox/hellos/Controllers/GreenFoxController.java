package com.greenfox.hellos.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreenFoxController {
  @GetMapping("/useful/colored")
  public String Colored(Model model) {
    model.addAttribute("color", "red");
    return "colored";
  }
}
