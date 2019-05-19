package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class Test1 {
  @RequestMapping(value = "/spring-rest/ex/foos", headers = "key=val", method = GET)
  @ResponseBody
  public String getFoosWithHeader() {
    return "Get some Foos with Header";
  }


}
