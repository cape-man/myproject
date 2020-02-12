package com.mindtree.mystayapplication.exception;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {
	@org.springframework.web.bind.annotation.ExceptionHandler
	public String exceptionHandler(ControllerException s, Model model)
	{
		Map<String, Object> error = new HashMap<String, Object>();
		error.put("timestamp", new Date());
		error.put("message", s.getMessage());
		error.put("httpstatus", HttpStatus.BAD_REQUEST.value());
		model.addAttribute("error", error);
		//System.out.println("sdfghj");
		return "Error";
		
	}

}
