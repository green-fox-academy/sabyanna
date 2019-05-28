package com.greenfox.tododatabase.service;

import com.greenfox.tododatabase.model.Todo;
import com.greenfox.tododatabase.repository.ITodoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class TodoServiceImp implements ITodoService {

  private ITodoRepository todoRepository;

  public TodoServiceImp(ITodoRepository iTodoRepository) {
    this.todoRepository=iTodoRepository;
  }

  @Override
  public List<Todo> findAll() {
    List<Todo> todoList = new ArrayList<>();
    todoRepository.findAll().forEach(todoList::add);
    return todoList;
  }

  @Override
  public Todo findById(long id) {
    return todoRepository.findById(id).orElse(null);
  }

  @Override
  public void save(Todo todo) {
    todoRepository.save(todo);

  }

  @Override
  public void delete(long id) {
    todoRepository.deleteById(id);
  }
}

