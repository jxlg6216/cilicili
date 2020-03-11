package cn.rk6216.eureka_client_comment.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 解决跨域问题
 */
@WebFilter(filterName = "accessControlAllowOriginFilter",urlPatterns = "/*")
public class AccessControlAllowOriginFilter implements Filter {
 
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) res;
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        chain.doFilter(req, response);
   } 
 
   public void init(FilterConfig filterConfig) {
 
   }

    public void destroy() {
 
   } 
 
}