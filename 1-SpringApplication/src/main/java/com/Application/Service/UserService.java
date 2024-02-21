package com.Application.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.Application.Entity.User;
import com.Application.Repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public String verifyUser(String userName, String passWord) {
		List<User> userList = userRepository.findByUserName(userName);
		boolean found=false;

		if (!userList.isEmpty()) {
			for (User user : userList) {

				if (user.getPassword().equals(passWord)) {
					found=true;
					return "Login successful! Welcome, " + user.getUserName();
				}
			}
			return "Incorrect password/username..";

		} else {
			return "User not found... need to Register";
		}
	}

	public String addUser(String userName, String passWord, long mobileNo, String emailId) {
		User newUser = new User();
		newUser.setUserName(userName);
		newUser.setPassword(passWord);
		newUser.setMobileNo(mobileNo);
		newUser.setEmailId(emailId);

		userRepository.save(newUser);

		return "User added successfully!";
	}
}
