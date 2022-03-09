package com.kider.demo.controller.copy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller{
	
@Value("${name}")
public String name;
	
@RequestMapping("/v1")
public String meth1(){
	String i = name;
	return i;
}
	

}
