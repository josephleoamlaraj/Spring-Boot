

package com.training.springbootkafkaproducer.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "OrderTbl")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Order implements Serializable {
	
  private static final long serialVersionUID = -7551545476601557391L;
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private double orderAmount;
  private String status;
  private int userId;

}
