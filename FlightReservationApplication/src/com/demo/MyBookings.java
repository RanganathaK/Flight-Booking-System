package com.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyBookings {

	static List<Ticket> bookingsList = new ArrayList<>();

	public static void bookingHistory(Ticket ticket) {
		bookingsList.add(ticket);
		for (Ticket t : bookingsList) {
			System.out.println(t);
		}
		System.out.println("Ticket booked Succefully..");
	}

	public static List<Ticket> getAllBookedTickets() {
		return bookingsList;
	}

	public static void cancelTicket(int ticketId) {
       
		Iterator<Ticket> iterator = bookingsList.iterator();
	    while (iterator.hasNext()) {
	        Ticket ticket = iterator.next();
	        if (ticket.getTicketId() == ticketId) {
	            iterator.remove();
	            System.out.println("Ticket canceled successfully.");
	            return;
	        }else {
	        	System.out.println("Invalid TicketID...");
	        }
	    }
	    

	}

}
