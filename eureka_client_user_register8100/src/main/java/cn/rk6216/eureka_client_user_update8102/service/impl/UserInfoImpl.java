package cn.rk6216.eureka_client_user_update8102.service.impl;

import cn.rk6216.eureka_client_user_update8102.dao.UserInfoMapper;
import cn.rk6216.eureka_client_user_update8102.pojo.UserInfo;
import cn.rk6216.eureka_client_user_update8102.service.IUserInfo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 *  用户注册的具体实现类
 *  @author: Lizq
 *  @Date: 2020/4/15 17:08
 */
@Transactional
@Service
public class UserInfoImpl implements IUserInfo {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public String registerUserInfo(UserInfo userInfo) {
        return userInfoMapper.insert(userInfo) == 1 ? "success" : "failed";
    }

}
