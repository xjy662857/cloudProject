package com.cloud.consumer.controller;

import com.cloud.consumer.inside.ProducerClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author xjy
 * @Date 2020/1/9 17:13
 */
@Slf4j
@RestController
@RequestMapping("consumer")
public class UserInfoController {


    @Autowired
    private ProducerClient producerClient;


    @RequestMapping("/getInfo")
    public String info(){
        log.info("consumer:{}",producerClient.getInfo());
        return producerClient.getInfo();
    }


}
