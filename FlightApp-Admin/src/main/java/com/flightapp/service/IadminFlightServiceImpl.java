package com.flightapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightapp.entity.FlightDetails;
import com.flightapp.repo.IadminFlightRepository;

@Service
public class IadminFlightServiceImpl implements IadminFlightService {

	@Autowired
	IadminFlightRepository adminFlightRepository;
	
	@Override
	public String scheduleFlight(FlightDetails flightDetails) {
		FlightDetails scheduleFlight = adminFlightRepository.save(flightDetails);
		return scheduleFlight.getFlightNumber();
	}
	
}
