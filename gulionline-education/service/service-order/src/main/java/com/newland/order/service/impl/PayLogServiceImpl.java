package com.newland.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.newland.order.entity.PayLog;
import com.newland.order.mapper.PayLogMapper;
import com.newland.order.service.IPayLogService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 支付日志表 服务实现类
 * </p>
 *
 * @author leellun
 * @since 2022-08-24
 */
@Service
public class PayLogServiceImpl extends ServiceImpl<PayLogMapper, PayLog> implements IPayLogService {

}
