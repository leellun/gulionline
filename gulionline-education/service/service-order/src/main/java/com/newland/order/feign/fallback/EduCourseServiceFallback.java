package com.newland.order.feign.fallback;

import com.newland.common.ordervo.R;
import com.newland.order.feign.EduCourseService;
import com.newland.servicebase.dto.CourseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 */
@Service
@Slf4j
public class EduCourseServiceFallback implements EduCourseService {

    @Override
    public CourseDto getCourseDtoById(String courseId) {
        log.info("熔断保护");
        return null;
    }

    @Override
    public R updateBuyCountById(String id) {
        log.info("熔断保护");
        return R.error();
    }
}
