package com.kider.demo.controller.copy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller{
	
@RequestMapping("/v1")
public String meth1(){
	return "hi";
}
	

}
