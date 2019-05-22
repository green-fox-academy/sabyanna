package com.greenfox.hellos.Controllers;

import com.greenfox.hellos.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreenFoxController {

  @Autowired
  @Qualifier("StService")
  StudentService studentService;


  @GetMapping("/gfa")
  public String Colored(Model model) {
    model.addAttribute("counter", "Currently we have " + studentService.studentCounter() + " users");
    return "gfa";
  }

  @GetMapping("/gfa/list")
  public String List(Model model) {
    model.addAttribute("students", studentService.findAll());
    return "list";
  }

  @GetMapping("/gfa/add")
  public String Add(Model model) {
    return "add";
  }

  @PostMapping("/gfa/save")
  public String handlingForm(Model model,String name) {
    studentService.save(name);
    model.addAttribute("students", studentService.findAll());
    return "list";
  }



}
