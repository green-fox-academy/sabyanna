package com.greenfox.connect;

import com.greenfox.connect.model.Drink;
import com.greenfox.connect.model.Food;
import com.greenfox.connect.model.Fox;
import com.greenfox.connect.model.Trick;
import com.greenfox.connect.repository.*;
import com.greenfox.connect.service.DrinkService;
import com.greenfox.connect.service.FoodService;
import com.greenfox.connect.service.FoxService;
import com.greenfox.connect.service.TrickService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectApplication  implements CommandLineRunner {

  private ITodoRepository iTodoRepository;
  private IFoxRepository foxRepository;
  private IFoodRepository foodRepository;
  private FoodService foodService;
  private FoxService foxService;
  private IDrinkRepository drinkRepository;
  private DrinkService drinkService;
  private TrickService trickService;
  private ITrickRepository trickRepository;


  public ConnectApplication(ITodoRepository iTodoRepository, IFoxRepository foxRepository, IFoodRepository foodRepository, FoodService foodService, FoxService foxService, IDrinkRepository drinkRepository, DrinkService drinkService, TrickService trickService, ITrickRepository trickRepository) {
    this.iTodoRepository = iTodoRepository;
    this.foxRepository = foxRepository;
    this.foodRepository = foodRepository;
    this.foodService = foodService;
    this.foxService = foxService;
    this.drinkRepository = drinkRepository;
    this.drinkService = drinkService;
    this.trickService = trickService;
    this.trickRepository = trickRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(ConnectApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

    Food pali = new Food("husospalacsinta");
    //Food karfiol = new Food("rakott karfiol");
    Drink lemonade = new Drink("lemonade");
    Trick sleep = new Trick("sleep");

    //Drink tea = new Drink("tea");
    Fox fox = new Fox("anna", pali, lemonade);
    fox.addTrick(sleep);

    //Fox fox = new Fox("anna");
    //pali.addFox(fox);
    //lemonade.addFox(fox);
    //drinkService.save(lemonade);
    //drinkService.save(lemonade);
    //foodService.save(pali);
    foxService.save(fox);
  }
}
