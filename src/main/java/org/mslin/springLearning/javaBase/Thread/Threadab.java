package org.mslin.springLearning.javaBase.Thread;

import lombok.extern.slf4j.Slf4j;


public class Threadab implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            throw new RuntimeException("aaa");
        } catch (RuntimeException | InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("子线程");
    }
}