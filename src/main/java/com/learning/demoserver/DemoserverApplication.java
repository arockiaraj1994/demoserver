package com.learning.demoserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoserverApplication {
    
    Logger log = LoggerFactory.getLogger(DemoserverApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoserverApplication.class, args);
	}
	
	@GetMapping(path = "/demoserver/ping")
	public String ping() {
	    log.info("Ping called");
	    return "Ok";
	}
}
