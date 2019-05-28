package com.greenfox.connect.repository;

import com.greenfox.connect.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface ITodoRepository extends CrudRepository<Todo, Long> {

}
