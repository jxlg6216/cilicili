package cn.rk6216.eureka_client_user_update8102.service.impl;

import cn.rk6216.eureka_client_user_update8102.dao.UserInfoMapper;
import cn.rk6216.eureka_client_user_update8102.pojo.UserInfo;
import cn.rk6216.eureka_client_user_update8102.service.IMailService;
import cn.rk6216.eureka_client_user_update8102.service.IUserInfoService;
import cn.rk6216.eureka_client_user_update8102.utils.Md5;
import cn.rk6216.eureka_client_user_update8102.utils.RandomId;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Map;

/**
 *  用户注册的具体实现类
 *  @author: Lizq
 *  @Date: 2020/4/15 17:08
 */
@Transactional
@Service
public class UserInfoServiceImpl implements IUserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Autowired
    private IMailService iMailService;

    @Override
    public String updateUserInfo(UserInfo userInfo) {
        QueryWrapper<UserInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id", userInfo.getUserId());
        return userInfoMapper.update(userInfo, queryWrapper) == 1 ? "success" : "failed";
    }

    @Override
    public void updateSendCheck(String userEmail, String userId) {
        String check = RandomId.getRandom16Id();
        iMailService.sendSimpleMail(userEmail, "clicli 找回密码 验证码", "验证码：" + check + "，如果不是本人操作请无视。");
        userInfoMapper.updateCheck(check,userId);
    }

    @Override
    public String updatePassword(Map<String,String> map) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(map.get("userId"));
        // 验证码是否正确
        if ( map.get("userCheck").equals(userInfoMapper.getCheck(userInfo.getUserId()))) {
            userInfo.setUserPassword(Md5.md5(Md5.yh(map.get("userPassword"))));
            LambdaQueryWrapper<UserInfo> lambdaQueryWrapper = Wrappers.lambdaQuery();
            lambdaQueryWrapper.eq(UserInfo::getUserId, userInfo.getUserId());
            userInfoMapper.update(userInfo, lambdaQueryWrapper);
            // 验证成功后，将验证码重置
            userInfoMapper.updateCheck(RandomId.getRandom16Id(), userInfo.getUserId());
            return "密码重置成功";
        } else {
            return "验证码错误";
        }
    }

}
