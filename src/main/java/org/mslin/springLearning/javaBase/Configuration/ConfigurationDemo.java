package org.mslin.springLearning.javaBase.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: @Configuration会被ConfigClassPostProcessor进行CGLIB动态代理
 */
@Configuration
public class ConfigurationDemo {

    @Bean
    public Country country(){
        return new Country();
    }

    @Bean
    public UserInfo userInfo(){ //多次调用该方法，返回同一个country实例
        return new UserInfo(country());
    }

}
