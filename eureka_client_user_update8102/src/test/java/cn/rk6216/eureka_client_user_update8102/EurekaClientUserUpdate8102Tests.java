package cn.rk6216.eureka_client_user_update8102;

import cn.rk6216.eureka_client_user_update8102.dao.UserInfoMapper;
import cn.rk6216.eureka_client_user_update8102.pojo.UserInfo;
import cn.rk6216.eureka_client_user_update8102.service.IMailService;
import cn.rk6216.eureka_client_user_update8102.service.IUserInfoService;

import cn.rk6216.eureka_client_user_update8102.utils.RandomId;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
@RunWith(SpringRunner.class)
class EurekaClientUserUpdate8102Tests {

    @Autowired
    private IUserInfoService iUserInfoService;

    @Autowired
    private IMailService iMailService;

    @Resource
    private UserInfoMapper userInfoMapper;

    @Test
    void testUpdate() {
        Map<String,String> map = new HashMap();
        map.put("aaa", "123");
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("{NSSX-QGJP-05WK-X0YP0}");
        userInfo.setUserName("钉钉");
        userInfo.setUserEmail("1dd@qq.com");
        userInfo.setUserPassword("666ss");
        userInfo.setUserBirthday(map.get("userBirthday"));
        System.out.println(iUserInfoService.updateUserInfo(userInfo));
    }

    @Test
    void testMail() {
        iMailService.sendSimpleMail("1437217811@qq.com", "clicli验证码", RandomId.getRandom20Id());
    }

    @Test
    void testCheckStore() {
        userInfoMapper.updateCheck(RandomId.getRandom16Id(),"{NSSX-QGJP-05WK-X0YP0}");
    }
}
