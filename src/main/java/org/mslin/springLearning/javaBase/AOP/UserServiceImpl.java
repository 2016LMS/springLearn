package org.mslin.springLearning.javaBase.AOP;

import lombok.Data;

@Data
public class UserServiceImpl implements UserService{
    @Override
    public void write() {
        System.out.println("写作");
    }
}
