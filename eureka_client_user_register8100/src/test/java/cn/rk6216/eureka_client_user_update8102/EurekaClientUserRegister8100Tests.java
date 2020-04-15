package cn.rk6216.eureka_client_user_update8102;

import cn.rk6216.eureka_client_user_update8102.pojo.UserInfo;
import cn.rk6216.eureka_client_user_update8102.service.IUserInfo;
import cn.rk6216.eureka_client_user_update8102.utils.RandomId;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class EurekaClientUserRegister8100Tests {

    @Autowired
    private IUserInfo iUserInfo;

    @Test
    void testRegister() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(RandomId.getRandom20Id());
        userInfo.setUserName("lowboy");
        userInfo.setUserEmail("1111@qq.com");
        userInfo.setUserPassword("666");
        System.out.println(iUserInfo.registerUserInfo(userInfo));
    }

}
