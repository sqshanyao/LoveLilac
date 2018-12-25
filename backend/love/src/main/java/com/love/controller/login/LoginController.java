package com.love.controller.login;

import com.love.bean.LoveConstant;
import com.love.domain.CommonConfig;
import com.love.service.AgreeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/love/lilac")
public class LoginController {
    Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    AgreeService agreeService;
    @PostMapping("/login")
    @ResponseBody
    public String login(@RequestParam(value = "password",required = true) String password) {

        String returnString = "";
        if (LoveConstant.password.equals(password)) {
            CommonConfig commonConfig = agreeService.getByType(1);
            if (commonConfig == null) {
                return LoveConstant.string_true;
            }
            if (LoveConstant.agree.equals(commonConfig.getValue())) {
                returnString = "yes";
            } else {
                returnString = "no";
            }
        } else {
            returnString =  "false";
        }
        logger.info("request love/lilac/login. return string is:" + returnString);
        return returnString;
    }
    @PostMapping("/login_test")
    @ResponseBody
    public void login_test(@RequestParam(value = "password",required = true) String password) {
        logger.info("test");
        System.out.println(password);
    }

}