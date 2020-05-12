package cn.rk6216.client_login8098.service.Impl;

import cn.rk6216.client_login8098.dao.AddJiFenMapper;
import cn.rk6216.client_login8098.dao.LoginMapper;
import cn.rk6216.client_login8098.pojo.UserInfo;
import cn.rk6216.client_login8098.service.IfindOne;
import cn.rk6216.client_login8098.utils.PasswordCode;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindOneImpl extends ServiceImpl<LoginMapper,UserInfo> implements IfindOne {

    @Autowired
    private LoginMapper loginMapper;
    @Autowired
    private AddJiFenMapper addJiFenMapper;

    /**
    * @Description
    * @Author  YML
    * @Date   2020/4/14 21:52
    * @Param  通过账户密码登录，密码先解密然后md5才会和数据库一致
    * @Return
    * @Exception
    *
    */
    @Override
    public UserInfo findOneById(UserInfo logininfo) {
        PasswordCode pw=new PasswordCode();
        String password=pw.getPassword(logininfo.getUserPassword());
        String passwordmd5=pw.md5(password);
        logininfo.setUserPassword(passwordmd5);
        UserInfo userInfo=loginMapper.findOneById(logininfo);
        System.out.println(userInfo);
        if (userInfo == null) {
            // do nothing
        } else {
            if(userInfo.getIsLoginToday()){
                addJiFenMapper.addJiFen(logininfo);
                userInfo=loginMapper.findOneByEmail(logininfo);
            }
        }
        return userInfo;
    }

    /**
    * @Description
    * @Author  YML
    * @Date   2020/4/14 21:53
    * @Param  通过邮箱密码登录，密码先解密然后md5才会和数据库一致
    * @Return
    * @Exception
    *
    */
    @Override
    public UserInfo findOneByEmail(UserInfo logininfo) {
        PasswordCode pw=new PasswordCode();
        String password=pw.getPassword(logininfo.getUserPassword());
        String passwordmd5=pw.md5(password);
        logininfo.setUserPassword(passwordmd5);
        UserInfo userInfo=loginMapper.findOneByEmail(logininfo);
        System.out.println(userInfo);
        if (userInfo == null) {

        } else {
            if(userInfo.getIsLoginToday()){
                addJiFenMapper.addJiFen(logininfo);
                userInfo=loginMapper.findOneByEmail(logininfo);
            }
        }
        return userInfo;
    }
}
