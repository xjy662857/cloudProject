package com.cloud.producer.controller;

import com.cloud.producer.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xjy
 * @Date 2020/1/9 16:33
 */
@Slf4j
@RequestMapping("/getInfo")
@RestController
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/info")
    public String getInfo(){
        log.info("producer:{}",userInfoService.getInfo());
        return userInfoService.getInfo();
    }
}
