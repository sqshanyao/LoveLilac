package com.love.controller.agree;

import com.love.bean.LoveConstant;
import com.love.domain.CommonConfig;
import com.love.service.AgreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/love/lilac")
@Controller
public class AgreeController {
    @Autowired
    AgreeService agreeService;

    @ResponseBody
    @PostMapping(value = "/agree")
    public String agree() {
        CommonConfig commonConfig = agreeService.getByType(1);
        if (commonConfig == null) {
            return  LoveConstant.no_answer;
        }else if (LoveConstant.agree.equals(commonConfig.getValue())) {
            return LoveConstant.agree;
        } else {
            return LoveConstant.refuse;
        }
    }

}
