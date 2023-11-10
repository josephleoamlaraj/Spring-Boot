package com.training.springbootkafkaconsumer.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "UserTbl")
@Data
public class User implements Serializable {

  private static final long serialVersionUID = -557445276601557391L;
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String name;
  private double balance;

 }
