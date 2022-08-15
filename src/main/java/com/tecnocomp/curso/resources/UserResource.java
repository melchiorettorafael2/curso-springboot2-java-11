package com.tecnocomp.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecnocomp.curso.entities.Person;


@RestController
@RequestMapping(value = "/user")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<Person> findAll(){
		Person p = new Person(1L, "Maria", "maria@gmail.com", "999999999", "12345");
		return ResponseEntity.ok().body(p);
	}
}
