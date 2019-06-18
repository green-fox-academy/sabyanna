package com.greenfox.groot.controller;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
//@AutoConfigureMockMvc
public class GuardianControllerTest {
  @Autowired
  private MockMvc mockMvc;

  @Test
  public void myMessReturnWhenMessageGiven() throws Exception{
    mockMvc.perform(get("/groot/?message=hello"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("translated", is("I am Groot!")));
  }

  @Test
  public void myMessReturnWhenMessageNotGiven() throws Exception{
    mockMvc.perform(get("/groot"))
            .andExpect(status().isBadRequest())
            .andExpect(content().string("Please provide what to do with the numbers!"));
  }

  @Test
  public void ArrowReturnWhenParametersCorrectlyGiven() throws Exception{
    mockMvc.perform(get("/yondu/?distance=100.0&time=10.0"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("speed", is(10.0)));
  }

  @Test
  public void ArrowReturnWhenTimeIsNull() throws Exception{
    mockMvc.perform(get("/yondu/?distance=100.0&time=0"))
            .andExpect(status().isBadRequest())
            .andExpect(content().string("time cannot be 0"));
  }

  @Test
  public void ArrowReturnWhenParametersNotGiven() throws Exception{
    mockMvc.perform(get("/yondu"))
            .andExpect(status().isBadRequest())
            .andExpect(content().string("please give the parameters correctly"));
  }
}
