package com.greenfox.connect.controllers;

import com.greenfox.connect.service.ITodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {


  private ITodoService iTodoService;

  public TodoController(ITodoService iTodoService) {
    this.iTodoService = iTodoService;
  }


  @GetMapping("/todo")
  public String list(Model model, @RequestParam(required = true) boolean isActive) {
    model.addAttribute("todos", iTodoService.findAll());
    model.addAttribute("active", isActive);
    return "todolist";
  }
}
