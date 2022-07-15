package com.faba.challenge_redis_fabfernandez.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/queue")
@RestController
public class QueueController {

  @PostMapping("/push")
  public String push() {
    return "Pushhhh";
  }
}
