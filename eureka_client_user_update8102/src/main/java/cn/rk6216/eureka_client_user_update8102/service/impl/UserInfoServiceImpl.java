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
    public String updateSendCheckByUserId(String userId) {
        QueryWrapper<UserInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id", userId);
        UserInfo userInfo = userInfoMapper.selectOne(queryWrapper);
        if(userInfo == null) {
            return "账号不存在";
        } else {
            String userEmail = userInfo.getUserEmail();
            String check = RandomId.getRandom16IdNoK();
            iMailService.sendSimpleMail(userEmail, "clicli 找回密码 验证码", "验证码：" + check + "，如果不是本人操作请无视。");
            userInfoMapper.updateCheck(check,userId);
            return "请进行验证码的校验";
        }
    }

    @Override
    public String updateSendCheckByUserEmail(String userEmail) {
        QueryWrapper<UserInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_email", userEmail);
        UserInfo userInfo = userInfoMapper.selectOne(queryWrapper);
        if(userInfo == null) {
            return "该邮箱未绑定账号";
        } else {
            String userId = userInfo.getUserId();
            String check = RandomId.getRandom16IdNoK();
            iMailService.sendSimpleMail(userEmail, "clicli 找回密码 验证码", "验证码：" + check + "，如果不是本人操作请无视。");
            userInfoMapper.updateCheck(check,userId);
            return "请进行验证码的校验";
        }
    }

    @Override
    public String updatePassword(Map<String,String> map) {
        String userCheckInput = map.get("userCheck");
        if (map.get("userId") == null) {
            String userEmail = map.get("userEmail");
            if(isChecked(userCheckInput, userInfoMapper.getCheckByEmail(userEmail))) {
                String password = Md5.md5(Md5.yh(map.get("userPassword")));
                System.out.println("------>" + password);
                userInfoMapper.updatePasswordByEmail(userEmail, password );
                // 验证成功后，将验证码重置
                userInfoMapper.updateCheckByEmail(RandomId.getRandom16Id(), userEmail);
                return "密码重置成功";
            } else {
                return "验证码错误";
            }
        } else {
            String userId = map.get("userId");
            // 验证码是否正确
            if (isChecked(userCheckInput, userInfoMapper.getCheck(userId))) {
                String password = Md5.md5(Md5.yh(map.get("userPassword")));
                userInfoMapper.updatePassword(userId, password);
                // 验证成功后，将验证码重置
                userInfoMapper.updateCheck(RandomId.getRandom16Id(), userId);
                return "密码重置成功";
            } else {
                return "验证码错误";
            }
        }
    }

    public Boolean isChecked(String userCheckInput, String userCheck) {
        if (userCheckInput.equals(userCheck)) {
            return true;
        } else {
            return false;
        }
    }

}
