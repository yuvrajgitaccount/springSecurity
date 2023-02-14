package com.example.SpringBootApiCurd.exception;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalException  extends ResponseEntityExceptionHandler{
	
	
	
	
	
	@ExceptionHandler(value = SmitaIdNotFpoundException.class)
	public ResponseEntity<Object>smitaNoTfound(SmitaIdNotFpoundException exception)
	
	{
		List<String>list=new ArrayList<String>();
		
		list.add(exception.getMessage());
		
		
		ApiError apiError=new ApiError(LocalDateTime.now(),HttpStatus.BAD_REQUEST,"resorece not found",list);
		
		
		
		return  ResponseBlider.entity(apiError);
	}

}
