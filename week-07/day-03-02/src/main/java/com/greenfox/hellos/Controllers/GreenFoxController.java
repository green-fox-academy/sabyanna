package com.greenfox.hellos.Controllers;

import com.greenfox.hellos.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreenFoxController {

  @Autowired
  @Qualifier("StService")
  StudentService studentService;


  @GetMapping("/gfa")
  public String Colored(Model model) {

    return "gfa";
  }

  @GetMapping("/gfa/list")
  public String List(Model model) {
    model.addAttribute("students", studentService.findAll());
    return "list";
  }
}
