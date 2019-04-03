package com.springboot.jhipster.app.web.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SimpleCRUDoperationsResource {

	@PostMapping("/person/create")
	public ResponseEntity<String> createPerson() {
		
		return new ResponseEntity<>("Person Created",HttpStatus.OK);
	}

	@GetMapping("/person/get")
	public String getPerson() {
		//throw new SimpleISException("Throw RuntimeException");
		//return new ResponseEntity<>("Person Data Rettrived",HttpStatus.OK);
		return "Person Data Rettrived";
	}

	@PutMapping("/person/update")
	public ResponseEntity<String> updatePerson() {
		return new ResponseEntity<>("Person Updated",HttpStatus.OK);
	}

	@DeleteMapping("/person/delete")
	public ResponseEntity<String> deletePerson() {
		return new ResponseEntity<>("Person Deleted",HttpStatus.OK);
	}
}
