package com.demo;

import java.util.Scanner;

public class PassengersDetails {
	Scanner sc = new Scanner(System.in);
	String pName;
	int pAge;
	String gender;
	long mobileNo;
	String dob;
    Ticket ticket;
	
	public Ticket passengersInfo(String seatNo, int flightID, String flightName, String source, String destination,
			String departure, String arraival, String date) {
		
		System.out.println("Enter Passenger Name:");
		pName = sc.next();
		System.out.println("Enter Age:");
		pAge = sc.nextInt();
		System.out.println("Enter Genger:");
		gender = sc.next();
		System.out.println("Enter MoblileNo:");
		mobileNo = sc.nextLong();
		System.out.println("Enter Date of Birth:");
		dob = sc.next();

		Passengers passengers = new Passengers(pName, pAge, gender, mobileNo, dob);
		ticket =new Ticket(flightID, flightName, source, destination, departure, arraival, seatNo, passengers, date);
		MyBookings.bookingHistory(ticket);
        return ticket;
		
		/*
		 * passengers.setName(pName); passengers.setAge(pAge);
		 * passengers.setGender(gender); passengers.setMobileNo(mobileNo);
		 * passengers.setDateOfBirth(dob); System.out.
		 * println("**************************Booking Details*******************************"
		 * ); System.out.println("Name: " + passengers.getName() + "        Age:" +
		 * passengers.getAge() + "\n" + "Gender:" + passengers.gender +
		 * "          MobileNo:" + passengers.getMobileNo() + "\n" + "Date Of Birth:" +
		 * passengers.getDateOfBirth() + "   SeatNo:" + seatNo + "\n" + "Flight ID:" +
		 * flightID + "               Flight Name:" + flightName + "\n" + "Source:" +
		 * source + "                     Destination:" + destination + "\n" +
		 * "Departure:" + departure + "               Arraival:" + arraival);
		 */

	}
}
