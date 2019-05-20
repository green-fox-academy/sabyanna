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

  @RequestMapping("/weird")
  public String weirdEnd(Model model) {
    model.addAttribute("String", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "stringer";
  }





}
