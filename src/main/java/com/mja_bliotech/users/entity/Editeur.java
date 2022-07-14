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

public class Editeur {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long Id_edit;
	@Getter @Setter
	private String Compagny;
	@Getter @Setter
	private String Address;
	@Getter @Setter
	private int tel;

	@OneToMany(mappedBy = "editeur")
	@JsonIgnore
	private List<Livre> livre;
	
	public Editeur(){}
	
	public Editeur(String comp,String Add,int phone)
	{
	this.Address=Add;
	this.Compagny=comp;
	this.tel=phone;
		
	}
	

}
