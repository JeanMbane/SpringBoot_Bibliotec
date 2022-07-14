package com.mja_bliotech.users.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class Cathegorie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cat;
	@Getter @Setter
	private String type;

	@OneToMany(mappedBy = "cathegorie")
	@JsonIgnore
	private List<Livre> livre;

}
