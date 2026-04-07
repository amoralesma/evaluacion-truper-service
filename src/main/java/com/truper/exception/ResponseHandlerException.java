package com.truper.exception;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ResponseHandlerException {
	
	@ExceptionHandler(ValidationException.class)
	public ResponseEntity<Object> handlerValidationException(ValidationException ex){
		var response=Map.of("message",ex.getMessage());
		return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
	}

	
}
