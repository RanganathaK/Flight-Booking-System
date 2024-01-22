package com.demo;
import java.util.Scanner;

public class PassengersDetails {
	   Passengers passengers=new Passengers();
	public void passengersInfo(int seatNo,int flightID,String flightName,String source,String destination,String departure, String arraival) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Passenger Name:");
		String pName=sc.nextLine();
		System.out.println("Enter Age:");
		int pAge=sc.nextInt();
		System.out.println("Enter Genger:");
		String gender=sc.next();
		System.out.println("Enter MoblileNo:");
		String mobileNo=sc.next();
		System.out.println("Enter Date of Birth:");
		String dob=sc.next();
		
		passengers.setName(pName);
		passengers.setAge(pAge);
		passengers.setGender(gender);
		passengers.setMobileNo(mobileNo);
		passengers.setDateOfBirth(dob);
		System.out.println("**************************Booking Details*******************************");
		System.out.println("Name: "+passengers.getName()+"   Age:"+passengers.getAge()+"\n"
		                  +"Gender:"+passengers.gender+"     MobileNo:"+passengers.getMobileNo()+"\n"
				          +"Date Of Birth:"+passengers.getDateOfBirth()+"   SeatNo:"+seatNo+"\n"
				          +"Flight ID:"+ flightID+"          Flight Name:"+flightName+"\n"
				          +"Source:"+source+"                Destination:"+destination+"\n"
				          +"Departure:"+departure+"          Arraival:"+arraival);
		
	}
}
