package org.apache.struts.crud;

import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    FilterRegistrationBean<StrutsPrepareAndExecuteFilter> filter (){
        FilterRegistrationBean<StrutsPrepareAndExecuteFilter> filterBean = new FilterRegistrationBean<>();
        filterBean.setFilter(new StrutsPrepareAndExecuteFilter());
        filterBean.addUrlPatterns("/");
        filterBean.addUrlPatterns("/index.action");
        filterBean.addUrlPatterns("/inputPerson.action");
        filterBean.addUrlPatterns("/deletePerson.action");
        filterBean.addUrlPatterns("/savePerson.action");
        filterBean.setOrder(0);
        return filterBean;
    }
}
