//package com.ecommerce.entity;

package com.example.demo;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@Entity
@Table(name = "eproduct")
public class EProduct {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private long ID;

	@Column(name = "name")
	private String name;

	@Column(name = "price")
	private BigDecimal price;

	@Column(name = "date_added")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateAdded;

	@Transient
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateAddedConverted;

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

	public void setDateAdded(Date date) {
		this.dateAdded = date;
	}

	public Date getDateAdded() {
		return this.dateAdded;
	}

	public void setDateAddedConverted(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Date getDateAddedConverted() {
        return dateAddedConverted;
    }

}
