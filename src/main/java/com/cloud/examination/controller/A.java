package com.cloud.examination.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import brave.sampler.Sampler;




@RestController
@CrossOrigin()
public class A {
	Logger logger = LoggerFactory.getLogger(A.class);
   @Autowired
   RestTemplate restTemplate;
 
   @Bean
   public RestTemplate getRestTemplate() {
       return new RestTemplate();
   }

   @Bean
   public Sampler alwaysSampler() {
       return Sampler.ALWAYS_SAMPLE;
   }

	
	@RequestMapping({ "/a" })
	public String hello() {
		logger.info("Inside zipkinService 1..");
        
        String response = (String) restTemplate.exchange("http://localhost:8082/b", 
                                                           HttpMethod.GET, 
                                                           null, 
                                                           new ParameterizedTypeReference<String>() {})
                                               .getBody();
       return "Hi...";
		//return "Hello World Hello world..!!!!";
	}

}
