package com.rana.spring.repository;

import com.rana.spring.models.Employee;
import com.rana.spring.models.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends /*CrudRepository*/MongoRepository<Person, String> {
    public Person getPersonByPersonId(final String id);
}
