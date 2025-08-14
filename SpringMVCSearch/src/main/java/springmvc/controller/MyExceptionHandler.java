package springmvc.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler {

	@ExceptionHandler(value=NullPointerException.class)
	public String nullexception() {
		return "null";
	}
	
	
	
	

	@ExceptionHandler(value=NumberFormatException.class)
	public String numberexception() {
		return "number";
	}
	
	
	
	
}
