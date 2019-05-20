package com.lionking.bankaccount.controllers;

import com.lionking.bankaccount.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

  BankAccount account;

  @RequestMapping("/show")
  public String showAccount(Model model) {
    account = new BankAccount("Simba", 2000, "lion");
    model.addAttribute("account", account);
    return "index";
  }



}
