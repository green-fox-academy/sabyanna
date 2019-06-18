package com.greenfox.jsonfrontend.controller;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.web.bind.annotation.RestController;

import static org.hamcrest.Matchers.is;
import java.nio.charset.Charset;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@WebMvcTest(RestController.class)
public class RestControllersTest {
  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void doUntilTest() throws Exception {
    mockMvc.perform(post("/dountil/sum")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"until\": \"5\"}"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.result", is(15)));

  }

  @Test
  public void doUntilTestWithNoParams() throws Exception {
    mockMvc.perform(post("/dountil/sum")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{}"))
            .andExpect(status().isBadRequest())
             .andExpect(content().string("Please provide a number!"));
            //.andExpect(jsonPath("$.result", is(15)));

  }



  @Test
  public void doArraysTest() throws Exception {
    int[] data = {1, 2, 5, 10};
    mockMvc.perform(post("/arrays")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"what\": \"sum\", \"numbers\": [1, 2, 5, 10]}"))
            .andExpect(status().isOk());
            //.andExpect(content().contentType(contentType))
            //.andExpect(jsonPath("$.result", is(15)));

  }




}
