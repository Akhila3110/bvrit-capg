package com.capg.pbms.accountmanagement.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND,reason = "Customer Not Found", value = HttpStatus.NOT_FOUND)
public class AccountNotFoundException extends RuntimeException{
	
	public AccountNotFoundException(String message) 
	{
		
		super(message);
	}


}
