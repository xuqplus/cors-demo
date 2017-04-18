package cn.xuqplus;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017-04-18.
 */
@Component
@WebFilter(value = "filter", urlPatterns = "/**")
public class AFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //((HttpServletResponse)response).addHeader("Access-Control-Allow-Origin", "xuqunqun-8th:8080");
        ((HttpServletResponse)response).addHeader("Access-Control-Allow-Origin", "*");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
