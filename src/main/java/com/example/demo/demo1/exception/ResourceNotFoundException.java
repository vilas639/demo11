package com.example.demo.demo1.exception;

public class ResourceNotFoundException extends RuntimeException {
	
	public ResourceNotFoundException(String message) {
        super(message);
    }

}
