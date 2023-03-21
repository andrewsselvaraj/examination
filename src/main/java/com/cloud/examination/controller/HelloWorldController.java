package com.cloud.examination.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
@CrossOrigin()
public class HelloWorldController {
	

	
	@RequestMapping({ "/hello" })
	public String hello() {
		 
		return "Hello World Hello world..!!!!";
	}

}
