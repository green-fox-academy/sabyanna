package com.greenfox.connect.service;

import com.greenfox.connect.model.Drink;
import com.greenfox.connect.repository.IDrinkRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DrinkService {

  private IDrinkRepository drinkRepository;
  public DrinkService(IDrinkRepository drinkRepository) {
    this.drinkRepository = drinkRepository;
  }

  public List<Drink> findAll() {
    List<Drink> drinks = new ArrayList<>();
    drinkRepository.findAll().forEach(drinks::add);
    return drinks;
  }

  public Drink findById(long id) {
    return drinkRepository.findById(id).orElse(null);
  }

  public void save(Drink drink) {
    drinkRepository.save(drink);
  }

  public void delete(long id) {
    drinkRepository.deleteById(id);
  }
}
