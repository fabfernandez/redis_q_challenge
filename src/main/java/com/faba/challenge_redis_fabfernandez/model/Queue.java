package com.faba.challenge_redis_fabfernandez.model;


import java.io.Serializable;

import org.springframework.data.redis.core.*;


@RedisHash
public class Queue implements Serializable {

  private String name;
  private String key;
  private String value;

}
