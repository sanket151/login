package com.wilp.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/home")
    public String home(){
        return "This is home pages !!";
    }
    @GetMapping("/admin")
    public String admin(){
        return "this is admins page";
    }
    
}
