//package com.ecommerce.entity;

package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "eproduct")
public class EProduct {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private long ID;

	@NotBlank
	@Size(min=2, max=10, message = "Name should be min 2 chars and not more than 10 chars")
	@Column(name = "name")
	private String name;

	
	@Digits(integer = 5, fraction = 2, message = "Price can only be up to 99999.99")
	@Column(name = "price")
	private BigDecimal price;

	@Column(name = "date_added")
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
