package cn.rk6216.feign.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 *
 *  @author: Lizq
 *  @Date: 2019/12/24 9:04
 */
@FeignClient(value = "euraka-client-comment")
public interface IEurekaClientCommentService {


}
