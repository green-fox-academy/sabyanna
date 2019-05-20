package com.lionking.bankaccount.controllers;

import com.lionking.bankaccount.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.constraints.Max;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

  BankAccount simba = new BankAccount("Simba", 2000, "lion");


  @RequestMapping("/show")
  public String showAccount(Model model) {
    model.addAttribute("account", simba);
    return "index";
  }

  @RequestMapping("/weird")
  public String weirdEnd(Model model) {
    model.addAttribute("String", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "stringer";
  }

@RequestMapping("/table")
  public String inTable(Model model) {
    List<BankAccount> accounts = new ArrayList<>();
    accounts.add(simba);
    accounts.add(new BankAccount("Zazu", 500, "bird"));
    accounts.add(new BankAccount("Nala", 1000, "lion"));
    accounts.add(new BankAccount("Ed", 2000, "hyena"));
    accounts.add(new BankAccount("Scar", 5000, "lion"));
    model.addAttribute("accounts", accounts);
    return "table";
  }





}
