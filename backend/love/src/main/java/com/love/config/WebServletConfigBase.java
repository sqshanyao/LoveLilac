package com.love.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebServletConfigBase {

    public DispatcherServlet getDispatcherServlet() {
        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        AnnotationConfigWebApplicationContext webContext = new AnnotationConfigWebApplicationContext();
        webContext.register(new Class[]{WebServletConfigBase.class});
        dispatcherServlet.setApplicationContext(webContext);
        return dispatcherServlet;
    }

    public ServletRegistrationBean getDispatcherServletRegistration(DispatcherServlet dispatcherServlet, String[] urlMappings, String servletName) {
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(dispatcherServlet, new String[0]);
        registrationBean.addUrlMappings(urlMappings);
        registrationBean.setName(servletName);
        return registrationBean;
    }

}
