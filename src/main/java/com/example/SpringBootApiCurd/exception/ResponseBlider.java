package com.example.SpringBootApiCurd.exception;

import org.springframework.http.ResponseEntity;

public class ResponseBlider {

	
	public static ResponseEntity<Object>entity(ApiError error)
	{
		return new ResponseEntity<>(error,error.getHttpStatus());
	}
}
