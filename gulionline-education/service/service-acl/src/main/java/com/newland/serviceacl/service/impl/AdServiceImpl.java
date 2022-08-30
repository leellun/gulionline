package com.newland.serviceacl.service.impl;

import com.newland.serviceacl.entity.Ad;
import com.newland.serviceacl.mapper.AdMapper;
import com.newland.serviceacl.service.IAdService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 广告推荐 服务实现类
 * </p>
 *
 * @author leellun
 * @since 2022-08-25
 */
@Service
public class AdServiceImpl extends ServiceImpl<AdMapper, Ad> implements IAdService {

}
