package com.love.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/love/lilac")
public class LoginController {

    @PostMapping("/login")
    @ResponseBody
    public boolean login(@RequestParam(value = "password",required = true) String password) {
        return "aa".equals(password);
    }
    @PostMapping("/login_test")
    @ResponseBody
    public void login_test(@RequestParam(value = "password",required = true) String password) {
        System.out.println(password);
    }

}