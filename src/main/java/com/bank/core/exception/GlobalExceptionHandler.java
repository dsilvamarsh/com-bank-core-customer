package com.bank.core.exception;

import java.util.NoSuchElementException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler  extends ResponseEntityExceptionHandler{

	
	
	@ExceptionHandler( NoSuchElementException.class)
	protected ResponseEntity<ExceptionHandledResponse> NoSuchElementException(NoSuchElementException ex){
		
		return ResponseEntity.badRequest().body(ExceptionHandledResponse.builder()
				.build());
		
		
	}
	
	
	@ExceptionHandler( Exception.class)
	protected ResponseEntity<ExceptionHandledResponse> handlerException(Exception ex){
		
		return ResponseEntity.badRequest().body(ExceptionHandledResponse.builder()
				.build());
		
		
	}
 	
	
	
}
