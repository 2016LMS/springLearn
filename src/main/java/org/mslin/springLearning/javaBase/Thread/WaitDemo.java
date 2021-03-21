package org.mslin.springLearning.javaBase.Thread;

public class WaitDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("子綫程中");
        synchronized (this) {
            notify();
        }
    }

    public static void main(String[] args) {
        Thread a = new Thread(new WaitDemo());
        a.start();
        int count = 2;
        if (count > 0) {
            count--;
            System.out.println("位置1");
            try {
                synchronized (a) {
                    a.wait();
                    if (Thread.interrupted()) {
                        System.out.println("中断了");
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("位置2");
        }
    }
}
