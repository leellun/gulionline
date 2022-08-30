package com.newland.serviceacl.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.newland.serviceacl.entity.Ad;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.newland.serviceacl.entity.vo.AdVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 广告推荐 Mapper 接口
 * </p>
 *
 * @author leellun
 * @since 2022-08-25
 */
public interface AdMapper extends BaseMapper<Ad> {
    List<AdVo> selectPageByQueryWrapper(
            Page<AdVo> pageParam,
            @Param(Constants.WRAPPER) QueryWrapper<AdVo> queryWrapper);
}
