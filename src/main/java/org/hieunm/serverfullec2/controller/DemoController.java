package org.hieunm.serverfullec2.controller;

import org.hieunm.serverfullec2.constants.response.ResultData;
import org.hieunm.serverfullec2.constants.response.ResultUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class DemoController {

    @GetMapping
    public ResultData<String> ping() {
        return ResultUtil.success("pong pong");
    }

}
