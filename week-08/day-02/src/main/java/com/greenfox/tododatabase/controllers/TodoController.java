package com.greenfox.tododatabase.controllers;

import com.greenfox.tododatabase.service.ITodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {


  private ITodoService iTodoService;

  public TodoController(ITodoService iTodoService) {
    this.iTodoService = iTodoService;
  }


  @GetMapping("/todo")
  public String list(Model model) {
    model.addAttribute("todos", iTodoService.findAll());
    return "todolist";
  }
}
