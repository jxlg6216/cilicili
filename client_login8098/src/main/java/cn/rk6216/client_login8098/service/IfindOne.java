package cn.rk6216.client_login8098.service;

import cn.rk6216.client_login8098.pojo.UserInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 *  @author: YML
 *  @Date: 2020/4/14 15:55
 *  @Description: 用户登录接口
 */
public interface IfindOne extends IService<UserInfo> {
    //用id和密码找人
    public UserInfo findOneById(UserInfo logininfo);
    //用邮箱和密码找
    public UserInfo findOneByEmail(UserInfo logininfo);
}
