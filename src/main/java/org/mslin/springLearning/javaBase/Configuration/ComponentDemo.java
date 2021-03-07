package org.mslin.springLearning.javaBase.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ComponentDemo {
    @Autowired
    private Country country;

    @Bean
    public Country country(){
        return new Country();
    }

    @Bean
    public UserInfo userInfo(){
        return new UserInfo(country); //这种方式多次调用userInfo()方法返回的同一个country实例
    }
}

//@Component
//public class ComponentDemo {
//
//
//    @Bean
//    public Country country(){
//        return new Country();
//    }
//
//    @Bean
//    public UserInfo userInfo(){
//        return new UserInfo(country()); //这种方式多次调用userInfo()方法返回的不是同一个country实例
//    }
//}
