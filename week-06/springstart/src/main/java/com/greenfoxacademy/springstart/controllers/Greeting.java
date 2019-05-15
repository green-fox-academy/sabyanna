package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
  private String content;
  private AtomicLong id = new AtomicLong();


  public Greeting(String content) {
    this.content = content;
  }

  public AtomicLong getId() {
    return id;
  }

  public void setId(AtomicLong id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

}
