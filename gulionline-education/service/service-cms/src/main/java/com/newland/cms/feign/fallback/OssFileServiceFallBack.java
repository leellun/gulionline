package com.newland.cms.feign.fallback;

import com.newland.cms.feign.OssFileService;
import com.newland.common.ordervo.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OssFileServiceFallBack implements OssFileService {

    @Override
    public R removeFile(String url) {
        log.info("熔断保护");
        return R.error().message("调用超时");
    }
}