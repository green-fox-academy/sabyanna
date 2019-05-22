package com.greenfox.hellos;


import com.greenfox.hellos.Service.Colorable;
import com.greenfox.hellos.Service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellosApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(HellosApplication.class, args);
  }


  private Printer printer;

  HellosApplication(Printer printer) {
    this.printer = printer;
  }

  @Autowired
  @Qualifier("Black")
  private Colorable myColor;

  @Override
  public void run(String... args) throws Exception {
    printer.log("hello");
    myColor.printColor();
  }


}
