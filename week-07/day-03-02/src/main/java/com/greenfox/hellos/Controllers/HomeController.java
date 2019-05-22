package com.greenfox.hellos.Controllers;

import com.greenfox.hellos.Service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

  @Autowired
  @Qualifier("Utilities")
  private UtilityService utility;

  @GetMapping("/useful")
  public String useful() {
    return "useful";
  }

  @GetMapping("/useful/colored")
  public String Colored(Model model) {
    model.addAttribute("color", utility.randomColor());
    return "colored";
  }

  @GetMapping("/useful/email")
  public String email(Model model, @RequestParam(required = true) String email) {
    if (utility.validateEmail(email)) {
      model.addAttribute("color", "color: green");
      model.addAttribute("text", email + " is a valid email address");
    } else {
      model.addAttribute("color", "color: red");
      model.addAttribute("text", email + " is an invalid email address");
    }
    return "email";
  }

  @GetMapping("/useful/encode")
  public String Encode(Model model, @RequestParam(required = true) String text, @RequestParam(required = true) int num) {
    model.addAttribute("toWrite", utility.caesar(text, num));
    return "useful";
  }

  @GetMapping("/useful/decode")
  public String Decode(Model model, @RequestParam(required = true) String text, @RequestParam(required = true) int num) {
    model.addAttribute("toWrite", utility.caesar(text, 0-num));
    return "useful";
  }

}
