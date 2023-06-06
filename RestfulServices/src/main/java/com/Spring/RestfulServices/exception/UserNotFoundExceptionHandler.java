package com.Spring.RestfulServices.exception;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@ControllerAdvice
public class UserNotFoundExceptionHandler {

	@ExceptionHandler(UserNotFoundException.class)
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	
	public @ResponseBody ExceptionResponse HandleUserNotFound(UserNotFoundException ex,HttpServletRequest request) {
		
		ExceptionResponse ee = new ExceptionResponse();
		ee.setErrMsg(ex.getMessage());
		ee.setErrUrl( request.getRequestURI());
		
		return ee;
	}
	
}
