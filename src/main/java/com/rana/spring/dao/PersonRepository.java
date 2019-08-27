package com.rana.spring.dao;

import com.rana.spring.models.Person;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface PersonRepository extends PersonGenericRepository<Person> {
    public Person getPersonByPersonId(final String id);
}
