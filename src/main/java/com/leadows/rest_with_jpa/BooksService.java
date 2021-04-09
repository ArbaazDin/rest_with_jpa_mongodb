package com.leadows.rest_with_jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  // ---@Service means this class implements some sort of business logic + is Spring boot @Component
public class BooksService {
    
    @Autowired
    private BooksRepository repository;
     
    public List<Books> listAll() {
        return repository.findAll();
    }
     
    public void save(Books book) {
        repository.save(book);
    }
     
    public Books get(String id) {
        return repository.findById(id).get();
    }
     
    public void delete(String id) {
        repository.deleteById(id);
    }
}
