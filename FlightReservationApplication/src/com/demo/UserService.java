package com.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
    private ArrayList<User> listOfUsers = new ArrayList<>();
    private User currentUser;
    private Scanner sc = new Scanner(System.in);
    

    public void verifyUser() {
        // Create and add some user entities to the ArrayList
        User user1 = new User("Ana", "Ana@123", "9982156342", "ana@gmail.com");
        User user2 = new User("Adam", "Adam@456", "9876543210", "adam@gmail.com");

        listOfUsers.add(user1);
        listOfUsers.add(user2);

        boolean found = false;
        System.out.println("********************LOGIN*********************");
        System.out.print("Enter UserName: ");
		String userName = sc.next();
		System.out.print("Enter PassWord: ");
		String passWord = sc.next();

        for (User user : listOfUsers) {
            if (user.getUserName().equals(userName)) {
            	currentUser=user;
                found = true;

                if (user.getPassWord().equals(passWord)) {
                    System.out.println("Login successful!"+ currentUser.getUserName());

                } else {
                    System.out.println("Incorrect password/username..");
                    System.exit(0);
                }
               
            }
        }
        //if user is not found in the listofuser 
		if (!found) {
			System.out.println("User not found. Do you want to register? (yes/no)");
			String registerChoice = sc.next();
			if (registerChoice.equalsIgnoreCase("yes")) {
				addUser();
			} else {
				System.out.println("Login failed.. User not registered.");
			}

		}
        
    }

    private void addUser() {
        System.out.print("Enter UserName:");
        String userName = sc.next();
        System.out.print("Enter Password:");
        String passWord = sc.next();
        System.out.print("Enter Mobile No:");
        String mobileNo = sc.next();
        System.out.print("Enter Email ID:");
        String emailId = sc.next();

        User newUser = new User(userName, passWord, mobileNo, emailId);
        listOfUsers.add(newUser);

        System.out.println("User added successfully!");
       verifyUser();
    }

}
