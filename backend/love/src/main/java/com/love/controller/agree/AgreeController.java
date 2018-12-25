package com.love.controller.agree;

import com.love.bean.LoveConstant;
import com.love.domain.CommonConfig;
import com.love.service.AgreeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
        Logger logger = LoggerFactory.getLogger(this.getClass());
        String result;
        CommonConfig commonConfig = agreeService.getByType(1);
        if (commonConfig == null) {
            result  = LoveConstant.no_answer;
        }else if (LoveConstant.agree.equals(commonConfig.getValue())) {
            result = LoveConstant.agree;
        } else {
            result = LoveConstant.refuse;
        }
        logger.info("request love/lilac/agree. return string is:" + result);
        return result;
    }

}
