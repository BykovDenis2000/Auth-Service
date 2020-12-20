package com.titles.authservice;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public List<Customer> findByLogin(String login);
    public List<Customer> findByPassword(String password);
    public List<Customer> findByLoginAndPassword(String login, String password);
}
