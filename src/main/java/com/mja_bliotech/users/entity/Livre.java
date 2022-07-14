package com.mja_bliotech.users.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@ToString
public class Livre {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long Id_livre;
	@Getter @Setter
	private String titre;
	
	@Getter @Setter
	@ManyToOne
	private Editeur editeur;
	
	@Getter @Setter
	@ManyToOne
	private Auteur auteur;
	
	@ManyToOne
	private Cathegorie cathegorie;
	
	
	public Livre(String ti,Editeur e,Auteur a ) {
		
		this.titre=ti;
		this.auteur=a;
		this.editeur=e;
		
	}

	public Livre(){}
}
