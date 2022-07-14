package com.mja_bliotech.users.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;



@Entity
public class Auteur {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long Id_aut;
	@Getter @Setter
	private String firstName;
	@Getter @Setter
	private String lastName;
	@Getter @Setter
	private int age;
	@Getter @Setter
	private String biographie;
	
	@OneToMany(mappedBy = "auteur")
	@JsonIgnore
	private List<Livre> livre;
	
	public Auteur(String name,String surname,int ag,String biograph ) 
	{
		this.firstName=name;
		this.lastName=surname;
		this.age=ag;
		this.biographie=biograph;
		
	}
	
	public Auteur() {}
}
