package cn.rk6216.entityandtools.pojo.mapper;

import cn.rk6216.entityandtools.pojo.VideoInformation;

public interface VideoInformationMapper {
    int deleteByPrimaryKey(String videoId);

    int insert(VideoInformation record);

    int insertSelective(VideoInformation record);

    VideoInformation selectByPrimaryKey(String videoId);

    int updateByPrimaryKeySelective(VideoInformation record);

    int updateByPrimaryKey(VideoInformation record);
}