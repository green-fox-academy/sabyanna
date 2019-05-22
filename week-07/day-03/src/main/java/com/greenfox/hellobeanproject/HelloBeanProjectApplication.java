package com.greenfox.hellobeanproject;

import com.greenfox.hellobeanproject.Service.Colorable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloBeanProjectApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(HelloBeanProjectApplication.class, args);
  }

  private Printer printer;

  HelloBeanProjectApplication(Printer printer) {
    this.printer = printer;
  }

  @Autowired
  @Qualifier("Black")
  private Colorable myColor;


  @Override
  public void run(String... args) throws Exception {
    //printer.log("hello");
    myColor.printColor();
  }
}
