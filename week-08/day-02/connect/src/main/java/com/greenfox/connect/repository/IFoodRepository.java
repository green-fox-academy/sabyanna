package com.greenfox.connect.repository;

import com.greenfox.connect.model.Food;
import org.springframework.data.repository.CrudRepository;

public interface IFoodRepository extends CrudRepository<Food, Long> {
}
