package cn.rk6216.entityandtools.pojo.mapper;

import cn.rk6216.entityandtools.pojo.VideoComment;

public interface VideoCommentMapper {
    int deleteByPrimaryKey(String commentId);

    int insert(VideoComment record);

    int insertSelective(VideoComment record);

    VideoComment selectByPrimaryKey(String commentId);

    int updateByPrimaryKeySelective(VideoComment record);

    int updateByPrimaryKey(VideoComment record);
}