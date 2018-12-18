package com.love.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebFilterConfig {
    @Bean
    public FilterRegistrationBean setHeaderFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setName("setHeaderFilter");
        SetHeaderFilter setHeaderFilter = new SetHeaderFilter();
        registrationBean.setFilter(setHeaderFilter);
        registrationBean.addUrlPatterns("/*");
//        registrationBean.setOrder(49);
        return registrationBean;
    }
}
