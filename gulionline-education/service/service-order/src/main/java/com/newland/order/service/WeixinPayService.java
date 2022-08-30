package com.newland.order.service;

import java.util.Map;

public interface WeixinPayService {

    Map<String, Object> createNative(String orderNo, String remoteAddr);
}
