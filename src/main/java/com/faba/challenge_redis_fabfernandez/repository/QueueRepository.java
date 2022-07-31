package com.faba.challenge_redis_fabfernandez.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faba.challenge_redis_fabfernandez.model.Queue;

@Repository
public interface QueueRepository extends CrudRepository<Queue, String> {
}
