package com.paulina.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.paulina.relationships.models.Person;
import com.paulina.relationships.repositories.PersonRepository;

@Service
public class PersonService {
    //agregando person al repositorio como dependencia
    private final PersonRepository personRepository;
       
    public PersonService(PersonRepository personRepository) {
	this.personRepository = personRepository;
    }
    
    //devolviendo todas las persons
    public List<Person> findAllPersons() {
   	return personRepository.findAll();
       }
    
    public Person createPerson(Person p) {
	return  personRepository.save(p);
    }
    //obteniendo la info de una sola persona
    public Person findPersonById(Long id) {
	Optional<Person> person = personRepository.findById(id);
	if(person.isPresent()) {
	    return person.get();
	}
	return null;
    }

   

}
