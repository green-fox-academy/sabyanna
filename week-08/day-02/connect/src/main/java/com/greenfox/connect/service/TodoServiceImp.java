package com.greenfox.connect.service;

import com.greenfox.connect.model.Todo;
import com.greenfox.connect.repository.ITodoRepository;
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


