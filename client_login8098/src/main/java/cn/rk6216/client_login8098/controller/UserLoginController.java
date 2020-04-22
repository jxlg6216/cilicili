package cn.rk6216.client_login8098.controller;

import cn.rk6216.client_login8098.pojo.UserInfo;
import cn.rk6216.client_login8098.service.IfindOne;
import cn.rk6216.client_login8098.utils.PasswordCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  @author: YML
 *  @Date: 2020/4/11 11:37
 *  @Description: 用户登录controller接口
 */
@RestController
@CrossOrigin
public class UserLoginController {

    @Autowired
    private IfindOne ifindOne;

    //账户密码登录
    @RequestMapping("/login")
    public UserInfo login(UserInfo userInfo){
        System.out.println("------------$$$$$$$$------------>>>>>>>>>.<<<<<<<<<<");
        System.out.println("账户："+userInfo.getUserId()+",密码："+userInfo.getUserPassword());
//        PasswordCode pw=new PasswordCode();
//        String password= pw.getPassword(userInfo.getUserPassword());
//        String md5=pw.md5(password);
        UserInfo userInfo1=new UserInfo();
        //这里如果账户密码正确则返回对象，否则返回null
        userInfo1=ifindOne.findOneById(userInfo);
        return userInfo1;
    }

    //邮箱密码等路
    @RequestMapping("/loginE")
    public UserInfo loginByEmail(UserInfo info){
        System.out.println("账户："+info.getUserEmail()+",密码："+info.getUserPassword());
        UserInfo info1=ifindOne.findOneByEmail(info);
        return info1;
    }
}
