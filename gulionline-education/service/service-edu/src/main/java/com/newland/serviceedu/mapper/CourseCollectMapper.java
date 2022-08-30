package com.newland.serviceedu.mapper;

import com.newland.serviceedu.entity.CourseCollect;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.newland.serviceedu.entity.vo.CourseCollectVo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 课程收藏 Mapper 接口
 * </p>
 *
 * @author leellun
 * @since 2022-08-25
 */
@Repository
public interface CourseCollectMapper extends BaseMapper<CourseCollect> {
    List<CourseCollectVo> selectPageByMemberId(Long memberId);
}
