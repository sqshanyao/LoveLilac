package com.love.controller.agree;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/love/lilac")
@Controller
public class AgreeController {

    public void agree(@RequestBody String json) {
        System.out.println(json);
    }

}
