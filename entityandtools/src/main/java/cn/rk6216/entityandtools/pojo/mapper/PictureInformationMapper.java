package cn.rk6216.entityandtools.pojo.mapper;

import cn.rk6216.entityandtools.pojo.PictureInformation;

public interface PictureInformationMapper {
    int insert(PictureInformation record);

    int insertSelective(PictureInformation record);
}