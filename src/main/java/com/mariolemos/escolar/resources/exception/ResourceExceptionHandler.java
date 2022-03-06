package com.mariolemos.escolar.resources.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.mariolemos.escolar.service.exceptions.AuthorizationException;

import reactor.netty.http.server.HttpServerRequest;

public class ResourceExceptionHandler {

	@ExceptionHandler(AuthorizationException.class)
	public ResponseEntity<StandardError> authorization(AuthorizationException e, HttpServerRequest request){
	
		StandardError err = new StandardError(HttpStatus.FORBIDDEN.value(), e.getMessage(), System.currentTimeMillis());
	
	return ResponseEntity.status(HttpStatus.FORBIDDEN).body(err);
	}

}
