package com.zgj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  
@RequestMapping("/user")  
public class TestController {
	 @RequestMapping("/showUser")  
	    public String toIndex(){ 
		 return "contact";
	    }  
}
