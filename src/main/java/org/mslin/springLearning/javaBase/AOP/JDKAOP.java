package org.mslin.springLearning.javaBase.AOP;

import lombok.Data;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKAOP {
    static class ProxyBean implements InvocationHandler {

        private Object targetObject;

        public Object createProxy(Object targetObject) {
            this.targetObject = targetObject;
            return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
                    targetObject.getClass().getInterfaces(), this);
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            Object obj = null;
            try {
                beforeLog();
                //obj： 目标对象--->代理对象的返回值--->返回给调用者的信息
                //this.invoke("目标对象","代理对象给目标对象传递参数");
                //调用目标对象中方法
                obj = method.invoke(targetObject, args);
                afterLog();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return obj;
        }
        //日志管理方法
        private void beforeLog(){
            System.out.println("开始执行");
        }

        private void afterLog(){
            System.out.println("执行完毕");
        }
    }



    public static void main(String[] args) {
        ProxyBean proxyBean = new ProxyBean();
        UserService userService = (UserService) proxyBean.createProxy(new UserServiceImpl());
        userService.write();
    }
}
