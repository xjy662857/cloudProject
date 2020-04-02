package com.cloud.consumer.inside;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author xjy
 * @Date 2020/1/9 17:04
 */
@FeignClient(name = "producer")
public interface ProducerClient {

    @PostMapping("getInfo/info")
    String getInfo();
}
