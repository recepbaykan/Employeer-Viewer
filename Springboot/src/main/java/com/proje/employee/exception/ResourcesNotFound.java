package com.proje.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourcesNotFound extends RuntimeException{
	
	public ResourcesNotFound(String message) {
		super(message);
	}

}
