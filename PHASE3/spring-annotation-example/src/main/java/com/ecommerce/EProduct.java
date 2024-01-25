package com.ecommerce;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.stereotype.Component;


public class EProduct {
	
	 private long ID;
     private String name="Bean1";
     private BigDecimal price=new BigDecimal(2000.25f);
     private Date dateAdded;  
     
     public long getID() {return this.ID; }
     public String getName() { return this.name;}
     public BigDecimal getPrice() { return this.price;}
     public Date getDateAdded() { return this.dateAdded;}
     
     public void setID(long id) { this.ID = id;}
     public void setName(String name) { this.name = name;}
     public void setPrice(BigDecimal price) { this.price = price;}
     public void setDateAdded(Date date) { this.dateAdded = date;}   

}
