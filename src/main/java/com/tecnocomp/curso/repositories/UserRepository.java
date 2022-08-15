package com.tecnocomp.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecnocomp.curso.entities.Person;

public interface UserRepository extends JpaRepository<Person, Long>{
	
	
}
