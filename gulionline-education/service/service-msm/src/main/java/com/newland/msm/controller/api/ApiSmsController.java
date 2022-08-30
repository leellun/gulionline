package com.newland.msm.controller.api;

import com.aliyuncs.exceptions.ClientException;
import com.newland.common.ordervo.R;
import com.newland.common.ordervo.ResultCodeEnum;
import com.newland.common.utils.FormUtils;
import com.newland.common.utils.RandomUtils;
import com.newland.msm.service.MsmService;
import com.newland.servicebase.exception.GuliException;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 *
 */
@RestController
@RequestMapping("/api/sms")
@Api(description = "短信管理")
//@CrossOrigin //跨域
@Slf4j
public class ApiSmsController {

    @Autowired
    private MsmService smsService;

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("send/{mobile}")
    public R getCode(@PathVariable String mobile) throws ClientException {

        //校验手机号是否合法
        if (StringUtils.isEmpty(mobile) || !FormUtils.isMobile(mobile)) {
            log.error("手机号不正确");
            return R.error().message("手机号不正确").code(28001);
        }

        //生成验证码
        String checkCode = RandomUtils.getFourBitRandom();

        //发送验证码
        //smsService.send(mobile, checkCode);
        System.out.println("=========" + checkCode);
        //存储验证码到redis
        redisTemplate.opsForValue().set(mobile, checkCode, 5, TimeUnit.MINUTES);

        return R.ok().message("短信发送成功");
    }

}
