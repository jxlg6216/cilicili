package cn.rk6216.client_pay8096.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
public class TestALiPayController {

    @RequestMapping("/success")
    public void paySuccess(HttpServletResponse response) throws Exception{
        //支付成功后修改数据库信息，这里还没写
        //将用户的VIP信息写入到数据库中，并重定向到特定的页面
        //....
        response.sendRedirect("http://localhost:8180/#/");
    }
}
