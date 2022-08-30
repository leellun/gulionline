package com.newland.ucenter.controller.api;


import com.google.gson.Gson;
import com.newland.common.ordervo.R;
import com.newland.common.ordervo.ResultCodeEnum;
import com.newland.common.utils.ExceptionUtils;
import com.newland.common.utils.HttpClientUtils;
import com.newland.common.utils.JwtInfo;
import com.newland.common.utils.JwtUtils;
import com.newland.servicebase.dto.MemberDto;
import com.newland.servicebase.exception.GuliException;
import com.newland.ucenter.entity.Member;
import com.newland.ucenter.entity.vo.LoginVo;
import com.newland.ucenter.entity.vo.RegisterVo;
import com.newland.ucenter.service.IMemberService;
import com.newland.ucenter.util.UcenterProperties;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * <p>
 * 会员表 前端控制器
 * </p>
 *
 * @author leellun
 * @since 2022-08-25
 */
@Api(description = "会员管理")
//@CrossOrigin
@RestController
@RequestMapping("/api/ucenter/member")
@Slf4j
public class ApiMemberController {

    @Autowired
    private IMemberService memberService;

    @ApiOperation(value = "会员注册")
    @PostMapping("register")
    public R register(@RequestBody RegisterVo registerVo){

        memberService.register(registerVo);
        return R.ok().message("注册成功");
    }

    @ApiOperation(value = "会员登录")
    @PostMapping("login")
    public R login(@RequestBody LoginVo loginVo){
        String token = memberService.login(loginVo);
        return R.ok().data("token", token).message("登录成功");
    }

    @ApiOperation(value = "根据token获取登录信息")
    @GetMapping("get-login-info")
    public R getLoginInfo(HttpServletRequest request){

        try {
            JwtInfo jwtInfo = JwtUtils.getMemberIdByJwtToken(request);
            return R.ok().data("userInfo", jwtInfo);
        } catch (Exception e) {
            log.error("解析用户信息失败：" + e.getMessage());
            throw new GuliException(ResultCodeEnum.FETCH_USERINFO_ERROR);
        }
    }

    @ApiOperation("根据会员id查询会员信息")
    @GetMapping("inner/get-member-dto/{memberId}")
    public MemberDto getMemberDtoByMemberId(
            @ApiParam(value = "会员ID", required = true)
            @PathVariable String memberId){
        MemberDto memberDto = memberService.getMemberDtoByMemberId(memberId);
        return memberDto;
    }
}

