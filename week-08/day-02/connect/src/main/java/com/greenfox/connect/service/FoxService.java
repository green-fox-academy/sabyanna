package com.greenfox.connect.service;

import com.greenfox.connect.model.Fox;
import com.greenfox.connect.repository.IFoxRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {

  private IFoxRepository foxRepository;

  public FoxService(IFoxRepository foxRepository) {
    this.foxRepository = foxRepository;
  }

  public List<Fox> findAll() {
    List<Fox> foxes = new ArrayList<>();
    foxRepository.findAll().forEach(foxes::add);
    return foxes;
  }

  public Fox findById(long id) {
    return foxRepository.findById(id).orElse(null);
  }

  public void save(Fox fox) {
    foxRepository.save(fox);
  }

  public void delete(long id) {
    foxRepository.deleteById(id);
  }
}
