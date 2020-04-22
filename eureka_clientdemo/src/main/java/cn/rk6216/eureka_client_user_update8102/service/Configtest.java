package cn.rk6216.eureka_client_user_update8102.service;

import cn.rk6216.eureka_client_user_update8102.dao.Daotest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class Configtest {

    @Resource
    private Daotest daotest;

    public String findsname() {
        return daotest.findString();
    }
}
