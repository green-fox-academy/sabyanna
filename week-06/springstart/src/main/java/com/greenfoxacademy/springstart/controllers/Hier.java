package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
public class Hier {
  Greeting myGreet = new Greeting( "Hi ");
  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
          "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
          "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
          "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

  @RequestMapping("/web/hier")
  public String greeting(Model model, @RequestParam(required = true) String name) {
    model.addAttribute("name", name);
    model.addAttribute("greet", hellos[(int)myGreet.getId().getAndAdd(1)]);
    model.addAttribute("color", "color: rgb(" + Math.random()*255 + ", " + Math.random()*255 + ", " + Math.random()*255 + ") ;font-size:" + Math.random()*40 + 10 + "px");
    return "hier";
  }
}
//rgb(0, 0, 224)
//<p style="color: red" th:text="${name} + '! ,'"/>
//hellos[(int)myGreet.getId().getAndAdd(1)]