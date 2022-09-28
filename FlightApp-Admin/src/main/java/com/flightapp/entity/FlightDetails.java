package com.flightapp.entity;

import javax.persistence.Entity;

@Entity
public class FlightDetails {

	private String flightNumber;
	private String airlineName;
	private String fromPlace;
	private String toPlace;
	private String startDateTime;
	private String endDateTime;
	private String scheduledDays;
	private String aircraft;
	private Integer businessClassSeats;
	private Integer economicalClassSeats;
	private Integer ticketCost;
	private Integer seatRows;
	private String meal;

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getFromPlace() {
		return fromPlace;
	}

	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}

	public String getToPlace() {
		return toPlace;
	}

	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}

	public String getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(String startDateTime) {
		this.startDateTime = startDateTime;
	}

	public String getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(String endDateTime) {
		this.endDateTime = endDateTime;
	}

	public String getScheduledDays() {
		return scheduledDays;
	}

	public void setScheduledDays(String scheduledDays) {
		this.scheduledDays = scheduledDays;
	}

	public String getAircraft() {
		return aircraft;
	}

	public void setAircraft(String aircraft) {
		this.aircraft = aircraft;
	}

	public Integer getBusinessClassSeats() {
		return businessClassSeats;
	}

	public void setBusinessClassSeats(Integer businessClassSeats) {
		this.businessClassSeats = businessClassSeats;
	}

	public Integer getEconomicalClassSeats() {
		return economicalClassSeats;
	}

	public void setEconomicalClassSeats(Integer economicalClassSeats) {
		this.economicalClassSeats = economicalClassSeats;
	}

	public Integer getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(Integer ticketCost) {
		this.ticketCost = ticketCost;
	}

	public Integer getSeatRows() {
		return seatRows;
	}

	public void setSeatRows(Integer seatRows) {
		this.seatRows = seatRows;
	}

	public String getMeal() {
		return meal;
	}

	public void setMeal(String meal) {
		this.meal = meal;
	}

	public FlightDetails(String flightNumber, String airlineName, String fromPlace, String toPlace,
			String startDateTime, String endDateTime, String scheduledDays, String aircraft, Integer businessClassSeats,
			Integer economicalClassSeats, Integer ticketCost, Integer seatRows, String meal) {
		super();
		this.flightNumber = flightNumber;
		this.airlineName = airlineName;
		this.fromPlace = fromPlace;
		this.toPlace = toPlace;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
		this.scheduledDays = scheduledDays;
		this.aircraft = aircraft;
		this.businessClassSeats = businessClassSeats;
		this.economicalClassSeats = economicalClassSeats;
		this.ticketCost = ticketCost;
		this.seatRows = seatRows;
		this.meal = meal;
	}

	public FlightDetails() {
		super();
	}

}
