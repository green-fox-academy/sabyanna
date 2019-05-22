package com.greenfox.hellobeanproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellobeanprojectApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(HellobeanprojectApplication.class, args);
  }

  private Printer printer;

  HellobeanprojectApplication(Printer printer) {
    this.printer = printer;
  }

  @Autowired
  private MyColor myColor;


  @Override
  public void run(String... args) throws Exception {
    //printer.log("hello");
    myColor.printColor();
  }
}
