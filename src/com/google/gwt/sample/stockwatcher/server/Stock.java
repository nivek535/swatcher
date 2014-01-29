package com.google.gwt.sample.stockwatcher.server;

import java.util.Date;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import com.google.appengine.api.users.User;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Stock {

  @PrimaryKey
  @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
  private Long id;
  @Persistent
  private User user;
  @Persistent
  private String symbol;
  @Persistent
  private Date createDate;

  public Stock() {
    this.createDate = new Date();
//test test yolo test
  }

  public Stock(User user, String symbol) {
    this();
    this.user = user;
    this.symbol = symbol;
  }

  public Long get_Id() {
    return this.id;
  }

  public User get_User() {
    return this.user;
  }

  public String get_Symbol() {
    return this.symbol;
  }

  public Date get_CreateDate() {
    return this.createDate;
  }

  public void set_User(User user) {
	  this.user = user;
  }

  public void set_Symbol(String symbol) {
    this.symbol = symbol;
  }
}