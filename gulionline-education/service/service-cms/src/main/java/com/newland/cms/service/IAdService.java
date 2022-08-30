package com.newland.cms.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.newland.cms.entity.Ad;
import com.baomidou.mybatisplus.extension.service.IService;
import com.newland.cms.entity.vo.AdVo;

import java.util.List;

/**
 * <p>
 * 广告推荐 服务类
 * </p>
 *
 * @author leellun
 * @since 2022-08-25
 */
public interface IAdService extends IService<Ad> {
    IPage<AdVo> selectPage(Long page, Long limit);

    boolean removeAdImageById(String id);

    List<Ad> selectByAdTypeId(String adTypeId);
}
