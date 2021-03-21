package org.mslin.springLearning.javaBase.Thread;

public class InterruptedDemo implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("子线程");
            if (Thread.interrupted()) break;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread a = new Thread(new InterruptedDemo());
        a.start();
        Thread.sleep(10);
        a.interrupt();
    }
}
