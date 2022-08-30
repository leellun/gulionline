package com.newland.msm.service;

import com.aliyuncs.exceptions.ClientException;

import java.util.Map;

public interface MsmService {
    //发送短信的方法
    public void send(String mobile, String checkCode) throws ClientException;
}
