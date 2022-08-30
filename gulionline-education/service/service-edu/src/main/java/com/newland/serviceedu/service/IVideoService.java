package com.newland.serviceedu.service;

import com.newland.serviceedu.entity.Video;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 课程视频 服务类
 * </p>
 *
 * @author leellun
 * @since 2022-08-25
 */
public interface IVideoService extends IService<Video> {
    void removeMediaVideoById(String id);

    void removeMediaVideoByChapterId(String chapterId);

    void removeMediaVideoByCourseId(String chapterId);
}
