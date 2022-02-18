package com.xlg.cms.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xlg.cms.api.model.Result;
import com.xlg.cms.api.service.RedisService;

/**
 * @author wangqingwei
 * Created on 2022-02-18
 */
@Controller
public class RedisController {

    @Autowired
    private RedisService redisService;

    /**
     * 任务状态枚举
     */
    @RequestMapping("/redis")
    @ResponseBody
    public Result status() {
        String key = "key1";
        String value = "2";
        boolean isSuccess = redisService.setDistributeRedisKey(key, value);
        return Result.ok(isSuccess);
    }
}
