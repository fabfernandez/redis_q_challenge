package com.faba.challenge_redis_fabfernandez.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@ContextConfiguration(classes = {
    QueueController.class
})
@WebMvcTest
class QueueControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  void push() throws Exception {

    this.mockMvc
        .perform(post("/api/queue/push"))
        .andExpect(status().isOk());
  }

}
