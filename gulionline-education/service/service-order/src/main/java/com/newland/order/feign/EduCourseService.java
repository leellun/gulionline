package com.newland.order.feign;

import com.newland.common.ordervo.R;
import com.newland.order.feign.fallback.EduCourseServiceFallback;
import com.newland.servicebase.dto.CourseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 */
@Service
@FeignClient(value = "service-edu", fallback = EduCourseServiceFallback.class)
public interface EduCourseService {

    @GetMapping("/api/edu/course/inner/get-course-dto/{courseId}")
    CourseDto getCourseDtoById(@PathVariable(value = "courseId") String courseId);

    @GetMapping("/api/edu/course/inner/update-buy-count/{id}")
    R updateBuyCountById(@PathVariable("id") String id);
}
