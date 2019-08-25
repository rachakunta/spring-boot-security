package com.rana.spring.service;

import com.rana.spring.models.Person;
import com.rana.spring.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> getPersons(){
        final List<Person> persons = new ArrayList<>();
        personRepository.findAll().forEach(persons::add);
        return persons;
    }

    public void createPerson(final Person person){
        personRepository.save(person);
    }

    public Person getPersonById(final String id){
        return personRepository.getPersonByPersonId(id);//findById(id).orElse(null);
    }

    public void updatePerson(final Person person){
        personRepository.save(person);
    }

    public void deleteAllPerson(){
        personRepository.deleteAll();
    }

    public void deletePersonById(final String id){
        personRepository.deleteById(id);
    }
}
