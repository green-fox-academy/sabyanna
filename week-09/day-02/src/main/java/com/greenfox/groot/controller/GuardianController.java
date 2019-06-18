package com.greenfox.groot.controller;



import com.greenfox.groot.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
public class GuardianController {

  @GetMapping("/groot")
  public ResponseEntity<?> grootAPI(String message) {
    if (message != null) {
      return new ResponseEntity<>(new MyMess(message), HttpStatus.OK);
    }
    return new ResponseEntity<>("Please provide what to do with the numbers!", HttpStatus.BAD_REQUEST);
  }

  @GetMapping("/yondu")
  public ResponseEntity<?> yonduAPI( Float distance, Float time) {
    if ((distance != null) && (time != null) && time != 0) {
      return new ResponseEntity<>(new Arrow(distance, time), HttpStatus.OK);
    } else if ((distance != null) && (time != null) && time == 0) {

      return new ResponseEntity<>("time cannot be 0", HttpStatus.BAD_REQUEST);
    }
    return new ResponseEntity<>("please give the parameters correctly", HttpStatus.BAD_REQUEST);
  }
}
//return new ResponseEntity<>("Please provide what to do with the numbers!", HttpStatus.OK);
