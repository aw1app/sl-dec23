package com.ecommerce.entity;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private long ID;
	
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	AadharCard aadharCard;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	List<MobilePhone> phones;
	
	@ManyToMany(mappedBy = "users", cascade = CascadeType.ALL)
	List<EducationalDegree> degrees = new CopyOnWriteArrayList<EducationalDegree>() ;// new ArrayList<EducationalDegree>();
	

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

	public List<MobilePhone> getPhones() {
		return phones;
	}

	public void setPhones(List<MobilePhone> phones) {
		this.phones = phones;
	}

	public List<EducationalDegree> getDegrees() {
		return degrees;
	}

	public void setDegrees(List<EducationalDegree> degrees) {
		this.degrees = degrees;
	}	
	
	

}
