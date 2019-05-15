package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

  Greeting myGreet = new Greeting( "Hi ");

  @RequestMapping("/greeting")
  public Greeting greeting(@RequestParam(required = true) String name) {
    
    myGreet.getId().getAndAdd(1);
    return myGreet;

  }
}
