package com.leadows.rest_with_jpa;

import org.springframework.data.mongodb.repository.MongoRepository;
 
public interface BooksRepository extends MongoRepository<Books, String> {

}