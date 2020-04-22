package cn.rk6216.client_login8098.dao;

import cn.rk6216.client_login8098.pojo.UserInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RestoreIsLoginTodayMapper extends BaseMapper<UserInfo> {
    //重置登录状态
    public void restoreLoginStatus();
}
