package com.newland.serviceedu.service;

import com.newland.serviceedu.entity.Chapter;
import com.baomidou.mybatisplus.extension.service.IService;
import com.newland.serviceedu.entity.vo.ChapterVo;

import java.util.List;

/**
 * <p>
 * 课程 服务类
 * </p>
 *
 * @author leellun
 * @since 2022-08-25
 */
public interface IChapterService extends IService<Chapter> {
    boolean removeChapterById(String id);

    List<ChapterVo> nestedList(String courseId);
}
