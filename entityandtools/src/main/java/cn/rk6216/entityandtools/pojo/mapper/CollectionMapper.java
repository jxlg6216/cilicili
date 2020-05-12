package cn.rk6216.entityandtools.pojo.mapper;

import cn.rk6216.entityandtools.pojo.Collection;

public interface CollectionMapper {
    int insert(Collection record);

    int insertSelective(Collection record);
}