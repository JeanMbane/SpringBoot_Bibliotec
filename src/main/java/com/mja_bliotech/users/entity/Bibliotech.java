package com.mja_bliotech.users.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class Bibliotech {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_bi;
	@Getter @Setter
	private String  username;
	@Getter @Setter
	private int password;
	
	@ManyToOne()
	private Roles role;

}
