package com.ecommerce.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class EProduct {

	private long ID;
	private String name;
	private BigDecimal price;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateAdded;

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

	public void setDateAdded(LocalDate date) {
		this.dateAdded = date;
	}

	public LocalDate getDateAdded() {
		return this.dateAdded;
	}

}
