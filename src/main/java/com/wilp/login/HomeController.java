package com.wilp.login;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/home")
    public String home(){
        return "This is home page";
    }
    @GetMapping("/admin")
    public String admin(){
        return "this is admins page";
    }

    @GetMapping("/welcome")
	public String showWelcomePage(ModelMap model) {
		//model.put("name", getLoggedinUserName());
		return "welcome";
	}
    
}
