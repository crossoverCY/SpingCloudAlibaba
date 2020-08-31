package com.ccy.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ccy
 */
@RestController
@Api(tags = {"common"})
@RefreshScope
public class CommonController {

    @Value("${config.secret.key}")
    private String secretKey;

    @ApiOperation(value = "欢迎入口", httpMethod = "GET")
    @GetMapping("/hello")
    public String hello() {
        return "Hello, greetings from microservice-alibaba-nacos-config";
    }

    @ApiOperation(value = "测试配置中心", httpMethod = "GET")
    @GetMapping("/getSecretKey")
    public String getSecretKey() {
        return this.secretKey;
    }

}
