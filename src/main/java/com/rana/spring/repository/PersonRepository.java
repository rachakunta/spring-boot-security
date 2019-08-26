package com.rana.spring.repository;

import com.rana.spring.models.Employee;
import com.rana.spring.models.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface PersonRepository extends PersonGenericRepository<Person> {
    public Person getPersonByPersonId(final String id);
}
