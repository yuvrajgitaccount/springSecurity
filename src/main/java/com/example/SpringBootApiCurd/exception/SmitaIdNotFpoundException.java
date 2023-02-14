package com.example.SpringBootApiCurd.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class SmitaIdNotFpoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public SmitaIdNotFpoundException()
	{
		
	}
	
	
	
	
	
	public SmitaIdNotFpoundException(String msg)//parameterized
	{
		super(msg);
	}

}
