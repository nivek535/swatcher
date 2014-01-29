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
  private Long id_test;
  @Persistent
  private User user_test;
  @Persistent
  private String symbol_test;
  @Persistent
  private Date createDate_test;

  public Stock() {
   this.createDate_test = new Date();
//test test yolo test
  }

  public Stock(User user, String symbol) {
    this();
    this.user_test = user;
    this.symbol_test = symbol;
  }


  public Long get_Id() {
    return this.id_test;
  }

  public User get_User() {
    return this.user_test;
  }

  public String get_Symbol() {
    return this.symbol_test;
  }

  public Date get_CreateDate() {
    return this.createDate_test;
  }

  public void set_User(User user) {
	  this.user_test = user;
  }

  public void set_Symbol(String symbol) {
    this.symbol_test = symbol;
  }
}