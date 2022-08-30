package com.newland.serviceedu.service;

import com.newland.serviceedu.entity.Subject;
import com.baomidou.mybatisplus.extension.service.IService;
import com.newland.serviceedu.entity.vo.SubjectVo;

import java.io.InputStream;
import java.util.List;

/**
 * <p>
 * 课程科目 服务类
 * </p>
 *
 * @author leellun
 * @since 2022-08-25
 */
public interface ISubjectService extends IService<Subject> {
    void batchImport(InputStream inputStream);

    List<SubjectVo> nestedList();
}
