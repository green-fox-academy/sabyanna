package com.greenfox.jsonfrontend.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class Log {
  Timestamp createdAt = new Timestamp(System.currentTimeMillis());
  String endpoint;
  String data;


}
