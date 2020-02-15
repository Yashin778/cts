package com.cts.dao;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.cts.model.Person;

@Component
public class PersonDao {
	static List<Person> list =null;
	static {		
		list = new ArrayList<Person>(); 
		list.add(new Person(1, "Anil", "Mang"));
		list.add(new Person(2, "Aji", "Mang2"));
		list.add(new Person(3, "Sanal", "Pralin"));
		list.add(new Person(4, "Nibin", "Raj"));
	}
	public List<Person> getPersons(){		
		
		return PersonDao.list;
	}	
	public ResponseEntity<?> insertPerson(Person person){
		list.add(person);		
		return new ResponseEntity<Person>(person, HttpStatus.OK);
	}
	public ResponseEntity<?> getPerson(int id){
		for (Person person : list) {
			if(person.getUid() == id) {
				return new ResponseEntity<Person>(person, HttpStatus.OK);
			}
		}
		return null;
	}
	public int deletePerson(int id){
		for (Person person : list) {
			if(person.getUid() == id) {
				list.remove(person);
				return id;
			}
		}
		return 0;
	}
}

