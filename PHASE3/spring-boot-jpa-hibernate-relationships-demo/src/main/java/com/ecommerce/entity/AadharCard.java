package com.ecommerce.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "aadhar")
public class AadharCard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long ID;

	// @Pattern(regexp = "\\d{12}")
	private long number;

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

}
