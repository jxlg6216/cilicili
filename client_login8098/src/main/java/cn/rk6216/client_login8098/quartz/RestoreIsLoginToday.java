package cn.rk6216.client_login8098.quartz;

import cn.rk6216.client_login8098.dao.RestoreIsLoginTodayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class RestoreIsLoginToday {

    @Autowired
    private RestoreIsLoginTodayMapper restoreIsLoginTodayMapper;

    //设置定时每天凌晨12点执行任务，将用户的登录状态全部改为0
    @Scheduled(cron = "0 0 0 */1 * ?")
    public void setIsLoginTodayFalse(){
        restoreIsLoginTodayMapper.restoreLoginStatus();
    }
}
