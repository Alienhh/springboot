package com.wlqq.winter.controller;

import com.wlqq.winter.common.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ResultController {

    /**
     * 以json格式输出
     * @return
     */
    @RequestMapping("/result")
    public Result result() {
        /**
         * 日志输出
         */
        log.info("aaaa");
        return Result.builder().code(10).data("1").status("OK").build();
    }
}
