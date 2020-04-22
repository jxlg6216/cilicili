package cn.rk6216.client_login8098.dao;

import cn.rk6216.client_login8098.pojo.UserInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LoginMapper extends BaseMapper<UserInfo> {
    //根据账户密码查找该名用户
    UserInfo findOneById(@Param("info") UserInfo info);
    //根据邮箱密码查找
    UserInfo findOneByEmail(@Param("info1")UserInfo info);
}
