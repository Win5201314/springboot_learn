package com.zsl.springboot.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zhangshengli
 */
@RestController
@Slf4j
public class TestController {

    /**
     * http:localhost:8081/index
     *
     * @return 字符串
     */
    @GetMapping("/index")
    public String index() {
        // Todo: 张胜利 2020-2-28 2020-2-29
        // Fixme: 张胜利 2020-2-28 2020-2-29
        log.info("------hkhk--------hu--j----");
        //
        return "hello,world!";
    }
    //1.报错日志，图片等放置到一个位置
    //2.遇到解决办法后，进行对应的总结
    //3.上传到CSDN上面

    public static void main(String[] args) {
        log.info("-----------------------------");
        log.debug("----------------------------");
        log.warn("------------------------------");
    }
}
