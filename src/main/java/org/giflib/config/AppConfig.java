package org.giflib.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableAutoConfiguration
@ComponentScan(basePackages = "org.giflib")
public class AppConfig {

//  @Bean
//  public ViewResolver viewResolver(){
//    InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
//    viewResolver.setPrefix("/resources/templates/");
//    viewResolver.setSuffix(".jsp");
//    viewResolver.setViewClass(JstlView.class);
//    return viewResolver;
//  }
}
