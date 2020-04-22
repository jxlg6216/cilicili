package cn.rk6216.client_login8098.dao;

import cn.rk6216.client_login8098.pojo.UserInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AddJiFenMapper extends BaseMapper<UserInfo> {
    //用户当天第一次登录加积分
    public void addJiFen(@Param("info3") UserInfo userInfo);
}
