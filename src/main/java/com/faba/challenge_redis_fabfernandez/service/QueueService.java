package com.faba.challenge_redis_fabfernandez.service;

import org.springframework.stereotype.Service;
import com.faba.challenge_redis_fabfernandez.model.Queue;
import com.faba.challenge_redis_fabfernandez.repository.QueueRepository;

@Service
public class QueueService {

  private QueueRepository queueRepository;

  public QueueService(final QueueRepository queueRepository) {
    this.queueRepository = queueRepository;
  }

  public void push(final String key, final String value) {

  }
}
