package com.my.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {
	
	@ResponseBody
	@RequestMapping(value="/")
	public String welcome(){
		return "Hello, I am up and running.";
	}
	
    @ResponseBody
    @ExceptionHandler(Throwable.class)
    public String handleErrorPage(){
    	return "Oops, something bad happened.";
    }
}
