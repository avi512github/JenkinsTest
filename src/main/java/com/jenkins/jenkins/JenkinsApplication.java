package com.jenkins.jenkins;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsApplication {

public static Logger logger = (Logger) LoggerFactory.getLogger(JenkinsApplication.class);
	
	public void init() {
		logger.info("application started.....");
	}

	public static void main(String[] args) {
		logger.info("application initialized.....");
		logger.info("application running.....");
		SpringApplication.run(JenkinsApplication.class, args);
	}

}
