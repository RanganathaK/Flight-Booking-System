package com.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class FlightDetails {
	
	private ArrayList<Flight> flights=new ArrayList<>();
	        Seat seat=new Seat();
	        PassengersDetails ps=new PassengersDetails();
	
	public void displayFlights(String source, String destination) {

		flights.add(new Flight(2356, "AIR INDIA", "Bangalore", "Chennai", "12:00", "14:30"));
		flights.add(new Flight(3001, "AIR ASIA", "Bangalore", "Chennai", "14:20", "17:10"));
		flights.add(new Flight(3015, "AIR ASIA", "Bangalore", "Chennai", "09:30", "12:00"));
		flights.add(new Flight(4036, "INDIGO", "Chennai", "Bangalore", "10:30", "13:00"));
		flights.add(new Flight(3015, "AIR ASIA", "Chennai", "Bangalore", "14:30", "17:00"));
		flights.add(new Flight(2023, "AIR INDIA", "Chennai", "Bangalore", "05:30", "08:00"));

		System.out.println("Available Flights:");
		System.out.println("*****************************************************************");

		
		
		for (Flight flight : flights) {
			if (flight.getSource().equalsIgnoreCase(source) && flight.getDestination().equalsIgnoreCase(destination)) {
				System.out.println("Flight Name |" + " Flight ID   | " + "Arraival Time   | " + "Departure Time   | ");
				System.out.println(flight.getFlightName() + "            " + flight.getFlightId() + "        "
						+ flight.getTimeToDeparture() + "             " + flight.getTimeToReach());

				System.out.println("--------------------------------------------------------------------");
			}
			
		}
		System.out.println("1.Book Seats");
		System.out.println("2.Exist");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("Enter Flight Id:");
			int flightID = sc.nextInt();
			for (Flight flight : flights) {
				if (flight.getFlightId() == flightID) {
					System.out.println(flight.getTimeToDeparture() + "--------->" + flight.getTimeToReach());
					reserveSeat(flight.getFlightId(), flight.getFlightName(),flight.getSource(),flight.getDestination(),flight.getTimeToDeparture(),flight.getTimeToReach());
				}
			}

		}
	}
	 
	 

	public void reserveSeat(int flightID,String flightName,String source,String destination,String departure, String arraival) {

	      boolean[] BusinessClassseats=new boolean[80];
	      boolean[] EconomicClassseats=new boolean[80];
	      int availableBCseats=BusinessClassseats.length;  //BC-BusinessClass
	      int availableECseats=EconomicClassseats.length;  //EC-EconomicClass
	      
	     
			Scanner sc=new Scanner(System.in);
			while(true) {
			System.out.println("*****SELECT YOUR SEATS*****");
			System.out.println("1.Business class seats");
			System.out.println("2.Economic class seats");
			System.out.println("3.Exit");
			int seatNo;
			int choice=sc.nextInt();
			if(choice==1) {
				System.out.println("Available BusinessClass seats: "+availableBCseats);
		    	 // Scanner sc1=new Scanner(System.in);
		    	  System.out.println("Select seat Number:");
		    	  seatNo=sc.nextInt();
		    	  seat.setSeatNo(seatNo);
		    	  if(BusinessClassseats[seatNo-1]==false) {
		    		  BusinessClassseats[seatNo-1]=true;
		    		  availableBCseats--;
		    		  System.out.println("Seat no "+ seat.getSeatNo()+" is reserved for BusinessClass");
		    		  ps.passengersInfo(seatNo, flightID, flightName, source, destination, departure, arraival);
		    	  }else {
		    		  System.out.println("seat already booked....choose another ");
		    	  }
			}else if(choice==2) {
				System.out.println("Available EconomicClass seats: "+availableECseats);
		    	  System.out.println("Select seat Number:");
		    	  seatNo=sc.nextInt();
		    	  seat.setSeatNo(seatNo);
		    	  if(EconomicClassseats[seatNo-1]==false) {
		    		  EconomicClassseats[seatNo-1]=true;
		    		  availableECseats--;
		    		  System.out.println("Seat no "+ seat.getSeatNo()+" is reserved EconomicClass");
		    		  ps.passengersInfo(seatNo, flightID, flightName, source, destination, departure, arraival);
		    	  }else {
		    		  System.out.println("seat already booked....choose another ");
		    	  }
			}else if(choice==3) {
				System.exit(0);
			}
			else {
				System.out.println("Invalid choice..");
			}
			
			}
		}
	 
}
