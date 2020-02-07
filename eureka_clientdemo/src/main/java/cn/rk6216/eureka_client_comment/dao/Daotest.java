package cn.rk6216.eureka_client_comment.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface Daotest extends BaseMapper<String> {
    String findString();
}
