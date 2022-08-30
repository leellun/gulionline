package com.newland.serviceedu.service.impl;

import com.newland.serviceedu.entity.Comment;
import com.newland.serviceedu.mapper.CommentMapper;
import com.newland.serviceedu.service.ICommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 评论 服务实现类
 * </p>
 *
 * @author leellun
 * @since 2022-08-25
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
