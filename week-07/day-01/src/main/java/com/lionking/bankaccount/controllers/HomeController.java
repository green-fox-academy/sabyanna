package com.lionking.bankaccount.controllers;

import com.lionking.bankaccount.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.constraints.Max;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

  BankAccount simba = new BankAccount("Simba", 2000, "lion", true, true);
  List<BankAccount> accounts = new ArrayList<>();

  public HomeController() {
    accounts.add(simba);
    accounts.add(new BankAccount("Zazu", 500, "bird", false, true));
    accounts.add(new BankAccount("Nala", 1000, "lion", false, true));
    accounts.add(new BankAccount("Ed", 2000, "hyena", true, false));
    accounts.add(new BankAccount("Scar", 5000, "lion", false, false));
    accounts.add(new BankAccount("Anna", 5000, "human", false, true));
  }

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
  model.addAttribute("accounts", accounts);
    return "table";
  }

  @PostMapping("/form")
  public String handlingForm(Model model,int val) {
    if (accounts.get(val).isKing()) {
      accounts.get(val).setBalance(accounts.get(val).getBalance()+100);
    } else {
      accounts.get(val).setBalance(accounts.get(val).getBalance()+10);
    }
    model.addAttribute("accounts", accounts);
    return "table";
  }







}
