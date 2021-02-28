package org.mslin.springLearning.javaBase.Thread;

import java.util.Arrays;

public class ThreadDemo  {
    public static void main(String[] args) {
        class Thread1  implements Runnable {

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getContextClassLoader());
                System.out.println(Thread.currentThread().getName() + ",  " + Thread.currentThread().getId());
                System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
            }
        }

        class Thread2 extends Thread {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }

        new Thread2().start();

        new Thread(new Thread1()).start();
        System.out.println(Thread.currentThread().getName() + "....");

        new Thread(() -> {
            System.out.println(Thread.currentThread().getContextClassLoader());
            System.out.println(Thread.currentThread().getThreadGroup());
        }).start();
    }
}
