package cn.hesion.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
  private String id;
  private String username;
  private String password;
  private Date registertime;
  private String avatarUrl;
}
