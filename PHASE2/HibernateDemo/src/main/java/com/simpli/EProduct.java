package com.simpli;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class EProduct {
	
	 private long ID;
     private String name;
     private BigDecimal price;
     private Date dateAdded;
     
     
     List<Color> colors;   
        
     
	public List<Color> getColors() {
		return colors;
	}
	public void setColors(List<Color> colors) {
		this.colors = colors;
	}
	
	
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Date getDateAdded() {
		return dateAdded;
	}
	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}
     
     

}
