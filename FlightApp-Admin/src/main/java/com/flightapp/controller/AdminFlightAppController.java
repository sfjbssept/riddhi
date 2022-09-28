package com.flightapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.entity.FlightDetails;
import com.flightapp.service.IadminFlightService;


@RestController
public class AdminFlightAppController {
	
	@Autowired
	IadminFlightService adminFlightService;
	
	@PostMapping("/api/v1.0/flight/airline/inventory/add")
	String scheduleFlight(@RequestBody FlightDetails flightDetails) {
		String flightNumber = adminFlightService.scheduleFlight(flightDetails);
		System.out.println(flightNumber);
		return flightNumber;
	}
}
