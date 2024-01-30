package com.ecommerce.entity;

import jakarta.persistence.*;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private long ID;
	
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	AadharCard aadharCard;
	

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

	public AadharCard getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(AadharCard aadharCard) {
		this.aadharCard = aadharCard;
	}	

}
