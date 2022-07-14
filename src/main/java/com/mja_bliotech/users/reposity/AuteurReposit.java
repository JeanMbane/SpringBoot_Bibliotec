package com.mja_bliotech.users.reposity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mja_bliotech.users.entity.Auteur;

public interface AuteurReposit extends JpaRepository<Auteur, Long> {

}
