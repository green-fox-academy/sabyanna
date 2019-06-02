package com.greenfox.connect.repository;

import com.greenfox.connect.model.Food;
import com.greenfox.connect.model.Fox;
import org.springframework.data.repository.CrudRepository;

public interface IFoxRepository  extends CrudRepository<Fox, Long> {
}
