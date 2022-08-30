package com.newland.ucenter.mapper;

import com.newland.ucenter.entity.Member;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 会员表 Mapper 接口
 * </p>
 *
 * @author leellun
 * @since 2022-08-25
 */
public interface MemberMapper extends BaseMapper<Member> {
    Integer selectRegisterNumByDay(String day);
}
