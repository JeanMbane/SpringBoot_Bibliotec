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
public class Roles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_rol;
	@Getter @Setter
	private String status;
	
	@OneToMany(mappedBy = "role")
	@JsonIgnore
	private List<Bibliotech> bibliotech; 

	
	
}
