package com.cts.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.dao.PersonDao;
import com.cts.model.Person;

@RestController
public class HomeController {
	@Autowired
	PersonDao dao;
	@RequestMapping("/homedata")
	public ResponseEntity<?> getHomeData() {
		return new ResponseEntity<Person>(new Person(11,"Giri", "Add1111"), HttpStatus.OK);
	}
	@GetMapping("/getAllPersons")
	public List<Person> getPersons(){
				
		return dao.getPersons();
	}
	@GetMapping("/person/{id}")
	public ResponseEntity<?> getPerson(@PathVariable("id") int id) {
		return dao.getPerson(id);
	}
	
	@PostMapping("/person")
	public ResponseEntity<?> savePerson(@RequestBody Person person) {
		return dao.insertPerson(person);
	}
	
	@DeleteMapping("person/{id}")
	public int deletePerson(@PathVariable("id") int id) {
		return dao.deletePerson(id);
	}
	
}
