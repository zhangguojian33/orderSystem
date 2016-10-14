package com.zgj.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  
@RequestMapping("/user")  
public class TestController {
	 @RequestMapping("/showUser")  
	 public String toIndex(){ 
		 return "contact";
	    } 
	 

	 @RequestMapping("/json")
	 @ResponseBody
	 public Object testJson() {
		 Map<String, String> map =new HashMap<String, String>();  
		map.put("id", "id");
		map.put("2", "id");
		return map;
	 } 

}
