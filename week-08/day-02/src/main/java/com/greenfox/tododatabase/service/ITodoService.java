package com.greenfox.tododatabase.service;

import com.greenfox.tododatabase.model.Todo;

import java.util.List;

public interface ITodoService {
  List<Todo> findAll();
  Todo findById(long id);
  void save(Todo todo);
  void delete(long id);
}
