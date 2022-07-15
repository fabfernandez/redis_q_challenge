package com.faba.challenge_redis_fabfernandez.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

  @GetMapping("/")
  public String ping() {
    return "Pong! this API is up and running.";
  }

}
