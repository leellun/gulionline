package com.newland.serviceedu.service;

import com.newland.serviceedu.entity.CourseCollect;
import com.baomidou.mybatisplus.extension.service.IService;
import com.newland.serviceedu.entity.vo.CourseCollectVo;

import java.util.List;

/**
 * <p>
 * 课程收藏 服务类
 * </p>
 *
 * @author leellun
 * @since 2022-08-25
 */
public interface ICourseCollectService extends IService<CourseCollect> {
    boolean isCollect(String courseId, String memberId);

    void saveCourseCollect(String courseId, String memberId);

    List<CourseCollectVo> selectListByMemberId(String memberId);

    boolean removeCourseCollect(String courseId, String memberId);
}
