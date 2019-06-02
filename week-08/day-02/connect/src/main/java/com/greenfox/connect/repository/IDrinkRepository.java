package com.greenfox.connect.repository;

import com.greenfox.connect.model.Drink;
import com.greenfox.connect.model.Fox;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IDrinkRepository extends CrudRepository<Drink, Long> {

  //List<Fox>
}
