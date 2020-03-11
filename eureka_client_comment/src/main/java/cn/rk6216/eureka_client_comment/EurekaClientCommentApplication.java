package cn.rk6216.eureka_client_comment;

import cn.rk6216.eureka_client_comment.filter.AccessControlAllowOriginFilter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("cn.rk6216.eureka_client_comment.dao")
public class EurekaClientCommentApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientCommentApplication.class, args);
    }

    /**
     * 配置跨域访问的过滤器
     * @return
     */
    @Bean
    public FilterRegistrationBean registerFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.addUrlPatterns("/*");
        bean.setFilter(new AccessControlAllowOriginFilter());
        return bean;
    }

}
