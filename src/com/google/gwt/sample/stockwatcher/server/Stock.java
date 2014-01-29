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
  private Long id_number;
  @Persistent
  private User user_name;
  @Persistent
  private String symb;
  @Persistent
  private Date create_Date;

  public Stock() {
    this.createDate = new Date();
//test test yolo test
  }

  public Stock(User user, String symbol) {
    this();
    this.user_name = user;
    this.symb = symbol;
  }

  public Long getId() {
    return this.id_number;
  }

  public User getUser() {
    return this.user_name;
  }

  public String getSymbol() {
    return this.symb;
  }

  public Date getCreateDate() {
    return this.create_Date;
  }

  public void setUser(User user) {
	  this.user_name = user;
  }

  public void setSymbol(String symbol) {
    this.symb = symbol;
  }
}