package com.wilp.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome";
    }
    @PostMapping("/loginDetails")
    public String loginDetails(@RequestParam("username") String username,@RequestParam("password") String password,ModelMap modelMap) {
        User user = userRepository.findByUsername(username);
        if(user.getUsername().equals(username) && user.getPassword().equals(password)){
            modelMap.put("username", "Welcome to the application : "+username);
                return "login";
        }else{
            modelMap.put("username", "Username and password is not available");
            return "login";
        }

    }

    
}
