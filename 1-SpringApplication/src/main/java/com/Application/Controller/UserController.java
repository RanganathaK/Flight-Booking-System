package com.Application.Controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import com.Application.Entity.User;
import com.Application.Service.UserService;

@RestController
@RequestMapping("/")
public class UserController {
     
    @Autowired
    private UserService userService;
    
//    @GetMapping("/login")
//    public String userLogin() {
//    	return "Login/login";
//    }
    
    @GetMapping("/login")
    public String login(@RequestParam String user_name, @RequestParam String passWord) {
    	
        return userService.verifyUser(user_name, passWord);
    }

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        return userService.addUser(user.getUserName(), user.getPassword(), user.getMobileNo(), user.getEmailId());
    }
}

