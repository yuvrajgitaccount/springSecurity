package com.example.SpringBootApiCurd.exception;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;

public class ApiError {
	
	
	//Erncsalustiion
	
	
	@JsonFormat(shape =JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy hh:mm:ss")
	private LocalDateTime localDateTime;
	
	
	private HttpStatus httpStatus;
	
	
	private String errormsgString;
	
	
	private List<String>list;


	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}


	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}


	public HttpStatus getHttpStatus() {
		return httpStatus;
	}


	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}


	public String getErrormsgString() {
		return errormsgString;
	}


	public void setErrormsgString(String errormsgString) {
		this.errormsgString = errormsgString;
	}


	public List<String> getList() {
		return list;
	}


	public void setList(List<String> list) {
		this.list = list;
	}


	public ApiError(LocalDateTime localDateTime, HttpStatus httpStatus, String errormsgString, List<String> list) {
		super();
		this.localDateTime = localDateTime;
		this.httpStatus = httpStatus;
		this.errormsgString = errormsgString;
		this.list = list;
	}


	public ApiError() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "ApiError [localDateTime=" + localDateTime + ", httpStatus=" + httpStatus + ", errormsgString="
				+ errormsgString + ", list=" + list + "]";
	}
	
	
	

}
