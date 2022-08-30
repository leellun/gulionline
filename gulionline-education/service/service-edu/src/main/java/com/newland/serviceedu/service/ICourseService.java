package com.newland.serviceedu.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.newland.servicebase.dto.CourseDto;
import com.newland.serviceedu.entity.Course;
import com.baomidou.mybatisplus.extension.service.IService;
import com.newland.serviceedu.entity.form.CourseInfoForm;
import com.newland.serviceedu.entity.vo.*;

import java.util.List;

/**
 * <p>
 * 课程 服务类
 * </p>
 *
 * @author leellun
 * @since 2022-08-25
 */
public interface ICourseService extends IService<Course> {
    String saveCourseInfo(CourseInfoForm courseInfoForm);

    CourseInfoForm getCourseInfoById(String id);

    void updateCourseInfoByIf(CourseInfoForm courseInfoForm);

    IPage<CourseVo> selectPage(Long page, Long limit, CourseQueryVo courseQueryVo);

    boolean removeCoverById(String id);

    boolean removeCourseById(String id);

    CoursePublishVo getCoursePublishVoById(String id);

    boolean publishCourseById(String id);

    List<Course> webSelectList(WebCourseQueryVo webCourseQueryVo);

    /**
     * 获取课程信息并更新浏览量
     * @param id
     * @return
     */
    WebCourseVo selectWebCourseVoById(String id);

    List<Course> selectHotCourse();

    CourseDto getCourseDtoById(String courseId);

    void updateBuyCountById(String id);
}
