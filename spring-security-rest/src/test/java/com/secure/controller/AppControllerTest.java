package com.secure.controller;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest({AppController.class})
@ActiveProfiles(value = "true")
public class AppControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Value("${employee.get.url}")
	String geturl;
	
	@Value("${employee.post.url}")
	String posturl;
	
	@Value("${employee.put.url}")
	String puturl;
	
	@Value("${employee.delete.url}")
	String deleteurl;
	
	@Value("${user.user1.username}")
	String username1;
	
	@Value("${user.user1.password}")
	String password;
	
	@Value("${user.user1.username}")
	String admin_name1;
	
	@Value("${user.user1.password}")
	String admin_password;
	
	
	
	
	
}
