package com.faba.challenge_redis_fabfernandez.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.faba.challenge_redis_fabfernandez.service.QueueService;

@RequestMapping("/api/queue")
@RestController
public class QueueController {

  private QueueService queueService;

  public QueueController(final QueueService queueService) {
    this.queueService = queueService;
  }

  @PostMapping("/push")
  public String push(String name, String key, String value) {
    queueService.push(key, value);
    return "Message pushed successfully.";

  }
}
