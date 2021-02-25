package org.mslin.springLearning.javaBase.Thread;

/**
 * @Description: t.join()的作用是让调用此线程的父线程阻塞等待此线程执行完才执行
 */
public class ThreadJoinDemo {
    public static void main(String[] args) {
        class Thread1 implements Runnable {

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        Thread t = null;
        for (int i = 0; i < 10; i++) {
            t = new Thread(new Thread1());
            t.start();
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
