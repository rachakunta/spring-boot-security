package com.rana.spring.controller;

import com.rana.spring.models.Person;
import com.rana.spring.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/getAll")
    public List<Person> getAll(){
        return personService.getPersons();
    }

    @RequestMapping(value = "/hello")
    public String healthCheck(){
        return "Greetings!! Hello World";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/")
    public void createPerson(@RequestBody Person person){
        personService.createPerson(person);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Person getPersonById(@PathVariable String id){
        return personService.getPersonById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/")
    public void updatePerson(@RequestBody Person person){
        personService.updatePerson(person);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/")
    public void deleteAllPersons(){
        personService.deleteAllPerson();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deletePersonById(@PathVariable String id){
        personService.deletePersonById(id);
    }
}
