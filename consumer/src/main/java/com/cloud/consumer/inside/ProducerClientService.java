package com.cloud.consumer.inside;

import org.springframework.stereotype.Component;

/**
 * @author xjy
 * @Date 2020/4/21 14:59
 */
@Component
public class ProducerClientService implements ProducerClient {

    @Override
    public String getInfo() {
        return "网络异常读取数据失败";
    }
}
