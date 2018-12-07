package com.love.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.love.controller"})
public class WebServletloveConfig extends WebServletConfigBase {
    @Bean(name = "lilacDispatcherServlet")
    public DispatcherServlet getLolacLilac() {
        return super.getDispatcherServlet();
    }

    @Bean
    public ServletRegistrationBean apiDispatcherServletRegistration(
            @Qualifier("lilacDispatcherServlet") DispatcherServlet apiDispatcherServlet) {
        return super.getDispatcherServletRegistration(apiDispatcherServlet,
                new String[]{"/love/lolac/*"}, "api_servlet");
    }

}
