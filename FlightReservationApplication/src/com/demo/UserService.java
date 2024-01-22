package com.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
    private ArrayList<User> listOfUsers = new ArrayList<>();
    private User currentUser;
    private Scanner sc = new Scanner(System.in);
    

    public void verifyUser(String userName, String passWord) {
        // Create and add some user entities to the ArrayList
        User user1 = new User("Ana", "Ana@123", "9982156342", "ana@gmail.com");
        User user2 = new User("Adam", "Adam@456", "9876543210", "adam@gmail.com");

        listOfUsers.add(user1);
        listOfUsers.add(user2);

        boolean found = false;

        for (User user : listOfUsers) {
            if (user.getUserName().equals(userName)) {
            	currentUser=user;
                found = true;

                if (user.getPassWord().equals(passWord)) {
                    System.out.println("Login successful!"+ currentUser.getUserName());
                    //frs.run();
                } else {
                    System.out.println("Incorrect password/username..");
                }
                break;
            }
        }

        if (!found) {
            addUser();
        }
       // getListOfUsers();
        
    }

    private void addUser() {
        System.out.println("User doesn't exist. Need to register.");
        System.out.println("Enter UserName:");
        String userName = sc.next();
        System.out.println("Enter Password:");
        String passWord = sc.next();
        System.out.println("Enter Mobile No:");
        String mobileNo = sc.next();
        System.out.println("Enter Email ID:");
        String emailId = sc.next();

        User newUser = new User(userName, passWord, mobileNo, emailId);
        listOfUsers.add(newUser);

        System.out.println("User added successfully!");
       verifyUser(userName, passWord);
    }

}
