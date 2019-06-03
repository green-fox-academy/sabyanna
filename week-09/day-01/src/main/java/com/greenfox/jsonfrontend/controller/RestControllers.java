package com.greenfox.jsonfrontend.controller;

import com.greenfox.jsonfrontend.model.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestControllers {

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(required = false) Integer input) {
    if (!(input == null)) {
      return new Inputom(input);
    }
    return new ErrorResponse(0);
      //return "error: Please provide an input!";
  }

  @GetMapping("/greeter")
  public Object greeting(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
    if (!(name == null) && !(title == null)) {
      return new Greeter(name, title);
    } else if ((name == null) && (title == null)) {
      return new ErrorResponse(1);
    } else if ((name == null)) {
      return new ErrorResponse(3);
    } else {
      return new ErrorResponse(2);
    }
  }

  @GetMapping("/appenda/{appendable}")
  public Object appending(@PathVariable("appendable") String append) {
    if (!(append == null) && !(append.equals(""))) {
      return new Appender(append);
    } return "404";
  }
  /*

  @GetMapping("/dountil/{action}")
  public Object doUntil(@PathVariable("action") String operation, @RequestParam(required = false) int until) {
    if (operation.equals("sum") || operation.equals("factor") ) {
      return new DoUntil(operation, until);
    } return "404";
  }

   */

  @PostMapping("/dountil/{action}")
  public Object doUntil(@PathVariable("action") String operation, @RequestParam(required = false) int until) {
    if (operation.equals("sum") || operation.equals("factor") ) {
      return new DoUntil(operation, until);
    } return "404";
  }




}
