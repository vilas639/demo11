package com.example.demo.demo1.serviceImp;

import com.example.demo.demo1.entity.Person;
import com.example.demo.demo1.repository.PersonRepository;
import com.example.demo.demo1.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl  implements PersonService {

   @Autowired
   private PersonRepository personRepository;

    public Person addPerson(Person person) {

        Person p=  personRepository.save(person);
        return p;
    }

    public List<Person> FetchAll() {

        List<Person>  p1=    personRepository.findAll();
        return p1;
    }
}
