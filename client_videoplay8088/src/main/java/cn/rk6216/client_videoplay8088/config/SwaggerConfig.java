package cn.rk6216.client_videoplay8088.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *  @author: YML
 *  @Date: 2020/2/3 11:07
 *  @Description: swagger配置类，用来开启restful风格访问测试工具
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .select()
                //这里是全局扫描有@Api注解的类，还可以扫描任意位置，指定包及针对方法上的指定注解
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("视频播放块client_videoplay8088")
                .description("描述")
                .termsOfServiceUrl("")
                .contact(new Contact("","",""))
                .license("")
                .licenseUrl("")
                .version("1.0")
                .build();
    }
}
