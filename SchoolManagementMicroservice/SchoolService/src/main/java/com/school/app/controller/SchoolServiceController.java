package com.school.app.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/schooldetail")
public class SchoolServiceController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping(value = "/{schoolname}")
	public String getStudents(@PathVariable("schoolname") String schoolname) {
		System.out.println("Getting school details" + schoolname);
		String requestURL = "http://localhost:9091/getStudentDetailsForSchool/"+schoolname;
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String> httpEntity = new HttpEntity<String>(headers);
		
		ResponseEntity<String> responseEntity = restTemplate.exchange(requestURL, HttpMethod.GET, httpEntity, String.class);
		String student = responseEntity.getBody();
		
		System.out.println("Response recieved as" +student );
		
		return "School Name:" + schoolname + "\n Student Details: " + student;
		
	}
}
