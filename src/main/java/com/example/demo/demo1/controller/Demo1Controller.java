package com.example.demo.demo1.controller;

import com.example.demo.demo1.entity.Person;
import com.example.demo.demo1.exception.ErrorResponse;
import com.example.demo.demo1.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.util.List;

@RestController
@RequestMapping("demo1/") // Simplified the base URL
public class Demo1Controller {

    @Autowired
    private PersonService personService;


    @GetMapping("test1")
    public String hi()
    {
        return  "hi";
    }


    // Endpoint to fetch all persons
    @PostMapping("fetchperson")
    public ResponseEntity<ErrorResponse> fetchPerson() throws JsonProcessingException {
        List<Person> personList = personService.FetchAll();

        // Convert list of persons to JSON string
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        String json = objectMapper.writeValueAsString(personList);

        // Return the response with the JSON body
        return ResponseEntity.status(HttpStatus.OK)
                .body(new ErrorResponse(200, json));
    }

    // Endpoint to add a new person
    @PostMapping("addNew")
    public ResponseEntity<ErrorResponse> addNewPerson(@RequestBody Person person) {
        System.out.println(person.toString());

        // Add person to the database
        Person addedPerson = personService.addPerson(person);

        // Return success response
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ErrorResponse(201, "Person added"));
    }
    
    
    public void getoffers(@RequestBody Person person,
    		@RequestHeader(name="clientid", required = false) String clinetid,
    		@RequestHeader(name="channelid", required = false) String channelid,
    		@RequestHeader(name="timstp", required = false) String timstp,
    		@RequestHeader(name="corelationid", required = false) String corelationid,
    		@RequestHeader(name="token", required = false) String authtoken
    		)
    {
    	System.out.println("welcome");
    	
    }
    
    
}
