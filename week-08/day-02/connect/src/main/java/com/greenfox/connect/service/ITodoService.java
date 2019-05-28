package com.greenfox.connect.service;

import com.greenfox.connect.model.Todo;

import java.util.List;

public interface ITodoService {
  List<Todo> findAll();
  Todo findById(long id);
  void save(Todo todo);
  void delete(long id);
}

