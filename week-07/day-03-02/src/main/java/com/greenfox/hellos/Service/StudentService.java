package com.greenfox.hellos.Service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Qualifier("StService")
public class StudentService {
  ArrayList<String> names;

  private int counter = 0;

  public StudentService() {
    names = new ArrayList<>();
    names.add("Sanyi");
    names.add("Lilla");
    names.add("John");
  }

  public List<String> findAll() {
    return names;
  }

  public void save(String student) {
    names.add(student);
  }

  public int studentCounter(){
    return names.size();
  }

  public int getCounter() {
    return counter;
  }

  public void setCounter(int counter) {
    this.counter = counter;
  }
}