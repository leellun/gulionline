package com.newland.serviceedu.mapper;

import com.newland.serviceedu.entity.Subject;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.newland.serviceedu.entity.vo.SubjectVo;

import java.util.List;

/**
 * <p>
 * 课程科目 Mapper 接口
 * </p>
 *
 * @author leellun
 * @since 2022-08-25
 */
public interface SubjectMapper extends BaseMapper<Subject> {
    List<SubjectVo> selectNestedListByParentId(String parentId);
}
