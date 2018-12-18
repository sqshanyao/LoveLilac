package com.love.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@Component
//@javax.servlet.annotation.WebFilter(urlPatterns = "*/*")
public class SetHeaderFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String hm = ((HttpServletRequest)servletRequest).getMethod();

        HttpServletResponse response = (HttpServletResponse) servletResponse;

        response.setHeader("Access-Control-Allow-Origin", "*");

      /*  response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTI ONS, DELETE");

        response.setHeader("Access-Control-Max-Age", "3600");

        response.addHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");*/

        filterChain.doFilter(servletRequest, servletResponse);

    }
}
