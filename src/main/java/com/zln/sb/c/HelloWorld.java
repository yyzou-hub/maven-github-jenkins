package com.zln.sb.c;

	import org.slf4j.Logger;
	import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.jsonschema.JsonSchema;

	/**
	 * Created by sherry on 17/2/20.
	 */
	@RestController
	public class HelloWorld {

	    /**
	     * 日志
	     */
	    private Logger logger = LoggerFactory.getLogger(HelloWorld.class);

	    @RequestMapping("/login")
	    public String helloworld(){
	        return "Hello World ";
	    }
	   
	
}