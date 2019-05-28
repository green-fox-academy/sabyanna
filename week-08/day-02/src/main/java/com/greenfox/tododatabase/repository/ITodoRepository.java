package com.greenfox.tododatabase.repository;

import com.greenfox.tododatabase.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface ITodoRepository extends CrudRepository<Todo, Long> {

}
