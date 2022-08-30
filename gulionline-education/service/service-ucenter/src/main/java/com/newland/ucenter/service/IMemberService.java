package com.newland.ucenter.service;

import com.newland.servicebase.dto.MemberDto;
import com.newland.ucenter.entity.Member;
import com.baomidou.mybatisplus.extension.service.IService;
import com.newland.ucenter.entity.vo.LoginVo;
import com.newland.ucenter.entity.vo.RegisterVo;

/**
 * <p>
 * 会员表 服务类
 * </p>
 *
 * @author leellun
 * @since 2022-08-25
 */
public interface IMemberService extends IService<Member> {
    void register(RegisterVo registerVo);

    String login(LoginVo loginVo);

    Member getByOpenid(String openid);

    MemberDto getMemberDtoByMemberId(String memberId);

    Integer countRegisterNum(String day);
}
