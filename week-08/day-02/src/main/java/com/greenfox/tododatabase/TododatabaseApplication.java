package com.greenfox.tododatabase;

import com.greenfox.tododatabase.model.Todo;
import com.greenfox.tododatabase.repository.ITodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TododatabaseApplication  implements CommandLineRunner{

  private ITodoRepository iTodoRepository;

  public TododatabaseApplication(ITodoRepository iTodoRepository) {
    this.iTodoRepository = iTodoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(TododatabaseApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

    Todo todo = new Todo("walk the dog");
    iTodoRepository.save(todo);
  }




}
