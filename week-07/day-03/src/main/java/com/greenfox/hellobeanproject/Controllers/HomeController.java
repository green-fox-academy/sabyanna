package com.greenfox.hellobeanproject.Controllers;

import com.greenfox.hellobeanproject.Service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sun.text.normalizer.Utility;

@Controller
public class HomeController {

  @Autowired
  @Qualifier("Utilities")
  private UtilityService utility;

  @GetMapping("/useful")
  public String useful() {
    return "useful";
  }

  @GetMapping("/colored")
  public String Colored(Model model) {
    model.addAttribute("color", utility.randomColor());
    return "colored";
  }

  @GetMapping("/email")
  public String email() {
    return "email";
  }
}
