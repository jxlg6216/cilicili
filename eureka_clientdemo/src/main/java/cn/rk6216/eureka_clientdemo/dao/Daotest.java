package cn.rk6216.eureka_clientdemo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface Daotest extends BaseMapper<String> {
    String findString();
}
