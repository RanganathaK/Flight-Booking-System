package com.demo;

public class Flight {
	private int flightId;

	private String flightName;

	private String source;

	private String destination;

	private String timeToDeparture;
	
	private String timeToReach;
    
	
	public Flight(int flightId, String flightName, String source, String destination, String timeToDeparture, String timeToReach) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
		this.timeToDeparture = timeToDeparture;
		this.timeToReach=timeToReach;
	}

	public String getTimeToDeparture() {
		return timeToDeparture;
	}

	public void setTimeToDeparture(String timeToDeparture) {
		this.timeToDeparture = timeToDeparture;
	}

	public String getTimeToReach() {
		return timeToReach;
	}

	public void setTimeToReach(String timeToReach) {
		this.timeToReach = timeToReach;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}


}
