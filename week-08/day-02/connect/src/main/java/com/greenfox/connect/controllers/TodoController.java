/*
package com.greenfox.connect.controllers;

import com.greenfox.connect.model.Todo;
import com.greenfox.connect.service.ITodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {


  private ITodoService iTodoService;

  public TodoController(ITodoService iTodoService) {
    this.iTodoService = iTodoService;
  }


  @GetMapping("/active")
  public String list(Model model, @RequestParam(required = true) boolean isActive) {
    model.addAttribute("todos", iTodoService.findAll());
    model.addAttribute("active", isActive);
    return "todolist";
  }

  @GetMapping("/todo/add")
  public String save(Model model) {
    return "add";
  }

  @PostMapping("/create")
  public String create(Model model, String todo) {
    Todo myto = new Todo(todo);
    iTodoService.save(myto);
    model.addAttribute("todos", iTodoService.findAll());
    return "index";
  }

  @GetMapping("/todo")
  public String listAll(Model model) {
    model.addAttribute("todos", iTodoService.findAll());
    return "index";
  }

  @GetMapping("delete")
  public String delete(Model model, @RequestParam(required = true) long id) {
    iTodoService.delete(id);
    model.addAttribute("todos", iTodoService.findAll());
    return "index";
  }

  @GetMapping("update")
  public String update(Model model, @RequestParam(required = true) long id) {
    model.addAttribute("todo", id);
    model.addAttribute("todotitle", iTodoService.findById(id).getTitle());
    model.addAttribute("todourgent", iTodoService.findById(id).isUrgent());
    model.addAttribute("tododone", iTodoService.findById(id).isDone());
    return "update";
  }

  @PostMapping("/update")
  public String update(Model model, @RequestParam(required = true) long id, String title, boolean urgent, boolean done) {
    iTodoService.findById(id).setTitle(title);
    iTodoService.findById(id).setUrgent(urgent);
    iTodoService.findById(id).setDone(done);
    iTodoService.save(iTodoService.findById(id));
    model.addAttribute("todos", iTodoService.findAll());
    return "redirect:/todo";
  }
}

//<input name = "id" th:value="${id}" th:type="hidden">



 */
