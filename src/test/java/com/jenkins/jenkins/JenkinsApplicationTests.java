package com.jenkins.jenkins;

import static org.junit.Assert.assertEquals;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JenkinsApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(JenkinsApplicationTests.class);
	
	@Test
	public void contextLoads() {
		logger.info("Test case executing....");
		logger.info("Test case executing second log statement....");
		assertEquals(true, true);
	}


}
