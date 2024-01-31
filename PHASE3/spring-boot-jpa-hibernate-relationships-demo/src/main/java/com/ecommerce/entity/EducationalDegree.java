package com.ecommerce.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "educational_degree")
public class EducationalDegree {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long ID;

	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "user_educationaldegree",
			joinColumns = @JoinColumn(name = "educationaldegree_id"),
			inverseJoinColumns = @JoinColumn(name = "user_id")
			)
	List<User> users;

}
