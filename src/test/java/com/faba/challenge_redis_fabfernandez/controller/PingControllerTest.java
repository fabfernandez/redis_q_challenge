package com.faba.challenge_redis_fabfernandez.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@ContextConfiguration(classes = {
    PingController.class
})
@WebMvcTest
class PingControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  void ping() throws Exception {

    this.mockMvc
        .perform(get("/"))
        .andExpect(status().isOk());
  }
}
