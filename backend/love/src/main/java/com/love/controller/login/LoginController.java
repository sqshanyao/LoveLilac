package com.love.controller.login;

import com.love.domain.CommonConfig;
import com.love.service.AgreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/love/lilac")
public class LoginController {

    @Autowired
    AgreeService agreeService;
    @PostMapping("/login")
    @ResponseBody
    public String login(@RequestParam(value = "password",required = true) String password) {
        if ("19931130".equals(password)) {
            CommonConfig commonConfig = agreeService.getByType(1);
            if (commonConfig == null) {
                return "true";
            }
            String returnString = "";
            if ("yes".equals(commonConfig.getValue())) {
                returnString += "yes";
            } else {
                returnString += "no";
            }
            return returnString;
        } else {
            return "false";
        }
    }
    @PostMapping("/login_test")
    @ResponseBody
    public void login_test(@RequestParam(value = "password",required = true) String password) {
        System.out.println(password);
    }

}