package com.cloud.producer.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author xjy
 * @Date 2020/1/9 16:28
 */
@Service
public class UserInfoService {

    @Value("${str}")
    private String str;

    public String getInfo(){
        return str;
    }
}
