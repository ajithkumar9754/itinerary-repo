package com.company.itinerary.management.model;

import java.io.Serializable;

import com.company.itinerary.management.entities.TravelInformation;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class TravelInfoBaseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String sourceCity;
	private String destinationCity;
	private String arrivalTime;
	private String departureTime;
	private int numberOfConnections;
	@JsonIgnore
	private double duration;

	public TravelInfoBaseDTO() {
	}

	public TravelInfoBaseDTO(Long travelId, String sourceCity, String destinationCity, String arrivalTime,
			String departureTime, int numberOfConnections, double duration) {
		super();
		this.sourceCity = sourceCity;
		this.destinationCity = destinationCity;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.numberOfConnections = numberOfConnections;
		this.duration = duration;
	}

	public TravelInfoBaseDTO(TravelInformation travelInfo) {
		this.sourceCity = travelInfo.getSourceCity();
		this.destinationCity = travelInfo.getDestinationCity();
		this.arrivalTime = travelInfo.getArrivalTime().toString();
		this.departureTime = travelInfo.getDepartureTime().toString();
		this.numberOfConnections = travelInfo.getNumberOfConnections();
		this.duration = travelInfo.getDuration();

	}

	public String getSourceCity() {
		return sourceCity;
	}

	public void setSourceCity(String sourceCity) {
		this.sourceCity = sourceCity;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public int getNumberOfConnections() {
		return numberOfConnections;
	}

	public void setNumberOfConnections(int numberOfConnections) {
		this.numberOfConnections = numberOfConnections;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	
	
}
