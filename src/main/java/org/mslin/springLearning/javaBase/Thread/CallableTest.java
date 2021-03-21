package org.mslin.springLearning.javaBase.Thread;

import java.util.concurrent.Callable;

/**
 * @Description: 对于有返回值的线程来说，如果不调用Future的get方法，假如子线程没有处理异常，那么这个异常会被"吞掉"，很难定位问题
 */
public class CallableTest implements Callable<String> {
    @Override
    public String call() {
        throw new RuntimeException("123");
//        System.out.println("子线程callable");
    }
}
