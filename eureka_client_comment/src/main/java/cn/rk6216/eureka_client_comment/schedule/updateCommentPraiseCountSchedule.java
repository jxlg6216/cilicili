package cn.rk6216.eureka_client_comment.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

/**
 * 定时从 redis 更新数据的定时任务
 *  @author: Lizq
 *  @Date: 2019/12/27 10:38
 */
@Slf4j
@Component
@EnableScheduling
public class updateCommentPraiseCountSchedule {

}
