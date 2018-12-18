package com.love.controller.agree;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/love/lilac")
@Controller
public class AgreeController {

    @ResponseBody
    public boolean agree(@RequestParam(value = "agree", required = true) String agree) {
        System.out.println(agree);
        return true;
    }

}
