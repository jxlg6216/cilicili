package cn.rk6216.entityandtools.pojo.mapper;

import cn.rk6216.entityandtools.pojo.Comment;

public interface CommentMapper {
    int insert(Comment record);

    int insertSelective(Comment record);
}