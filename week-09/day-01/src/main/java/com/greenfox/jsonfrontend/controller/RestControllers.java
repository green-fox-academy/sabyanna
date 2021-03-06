package com.greenfox.jsonfrontend.controller;

import com.greenfox.jsonfrontend.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.sym.error;


public class RestControllers {

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(required = false) Integer input) {
    if (!(input == null)) {
      return new Inputom(input);
    }
    return new ErrorResponse(0);
      //return "error: Please provide an input!";
  }

  @GetMapping("/greeter")
  public Object greeting(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
    if (!(name == null) && !(title == null)) {
      return new Greeter(name, title);
    } else if ((name == null) && (title == null)) {
      return new ErrorResponse(1);
    } else if ((name == null)) {
      return new ErrorResponse(3);
    } else {
      return new ErrorResponse(2);
    }
  }



  @GetMapping("/appenda/{appendable}")
  public ResponseEntity<?> appending(@PathVariable("appendable") String append) {
    if (!(append == null) && !(append.equals(""))) {
      return new ResponseEntity<>(new Appender(append), HttpStatus.OK);
    }
    return new ResponseEntity<>("not found", HttpStatus.NOT_FOUND);
  }

   /*



  @GetMapping("/appenda/{appendable}")
  public Object appending(@PathVariable("appendable") String append) {
    if (!(append == null) && !(append.equals(""))) {
      return new Appender(append);
    } return "404";
  }

    */



  @GetMapping("/dountil/{action}")
  public Object doUntil(@PathVariable("action") String operation, @RequestParam(required = false) int until) {
    if (operation.equals("sum") || operation.equals("factor") ) {
      return new DoUntil(operation, until);
    } return "404";
  }



  @PostMapping("/dountil/{action}")
  public ResponseEntity<?> doUntil(@PathVariable("action") String operation, @RequestBody UntilInput untilInput) {
    if ((untilInput.getUntil() != null) && (untilInput.getUntil() != 0)) {
      return new ResponseEntity<>(new DoUntil(operation, untilInput.getUntil()), HttpStatus.OK);
    } else {
      return new ResponseEntity<>("Please provide a number!", HttpStatus.BAD_REQUEST);
    }
  }

  /*

  @PostMapping("/arrays")
  public ResponseEntity<?> handleArrays(@RequestBody ArrayInput arrayInput) {
    if (arrayInput != null) {
      return new ResponseEntity<HandleArray>(new HandleArray(arrayInput.getWhat(), arrayInput.getNumbers()), HttpStatus.OK);
    } return new ResponseEntity<ErrorResponse>(new ErrorResponse(4), HttpStatus.BAD_REQUEST);
  }

   */


  @PostMapping("/arrays")
  public ResponseEntity<?> handleArrays(@RequestBody ArrayInput arrayInput) {
    if ((arrayInput.getWhat() != null)&&(arrayInput.getNumbers() != null)) {
      return new ResponseEntity<HandleArray>(new HandleArray(arrayInput.getWhat(), arrayInput.getNumbers()), HttpStatus.OK);
    } return new ResponseEntity<>("Please provide what to do with the numbers!", HttpStatus.BAD_REQUEST);
  }


  /*

  @GetMapping("/manual")
  void manual(HttpServletResponse response) throws IOException {
    response.setHeader("Custom-Header", "foo");
    response.setStatus(200);
    response.getWriter().println("Hello World!");
  }

  ResponseEntity.status((HttpStatus.BAD_REQUEST)).body(errorService.showError("enter number"));


   */




}
