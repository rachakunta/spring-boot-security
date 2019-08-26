package com.rana.spring.repository;

import com.rana.spring.models.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface PersonGenericRepository<T extends Person> extends MongoRepository<T, String> {
}
