package com.example.demo.demo1.service;

import com.example.demo.demo1.entity.Person;

import java.util.List;

public interface PersonService {

    public Person addPerson(Person person);

    public List<Person> FetchAll();
}
