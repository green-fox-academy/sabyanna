package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {


  @RequestMapping("/greeting")
  public String greeting(@RequestParam(required = true) String name) {
    Greeting myGreet = new Greeting(1, "Hi ");

    return myGreet.getContent() + name;


    //String greeting = myGreet.getContent() + name;
    //return greeting;
  }
}
