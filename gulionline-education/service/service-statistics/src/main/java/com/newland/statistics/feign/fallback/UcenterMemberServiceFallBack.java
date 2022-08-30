package com.newland.statistics.feign.fallback;

import com.newland.common.ordervo.R;
import com.newland.statistics.feign.UcenterMemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UcenterMemberServiceFallBack implements UcenterMemberService {

    @Override
    public R countRegisterNum(String day) {
        log.error("熔断被执行");
        return R.ok().data("registerNum", 0);
    }
}
