package com.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.PersonService;

@RestController
public class MyController {
	
	private PersonService personService;
	
	@RequestMapping("/person/dtl")
	public ResponseEntity<?> getAllPerson(){
		return ResponseEntity.ok(this.personService.getAllPerson());
	}

}
