package com.vzw.dvs.customerinfo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/customer_info")
public class CustomerInfoController {


	@Value("${message}")
	private String message;

	    @GetMapping(value = "/getmessage")
	    public String Hiii()
	    {
	    	return message;
	    }
	    
	    
	    
	
}
