package cn.rk6216.entityandtools.pojo.mapper;

import cn.rk6216.entityandtools.pojo.News;

public interface NewsMapper {
    int insert(News record);

    int insertSelective(News record);
}