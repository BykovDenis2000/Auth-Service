package com.titles.authservice;

import java.util.List;

public interface DataBase {
    public List<Customer> findByLogin(String login);
    public List<Customer> findByPassword(String password);
    public List<Customer> findByLoginAndPassword(String login, String password);
    public List<Customer> findAll();
    public void save(Customer customer);
    public void deleteById(String id);
}
