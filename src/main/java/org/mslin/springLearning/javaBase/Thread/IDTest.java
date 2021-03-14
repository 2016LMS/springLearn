package org.mslin.springLearning.javaBase.Thread;

public class IDTest {
    int id = 0;
    public synchronized int increase() {
        return ++id;
    }
}
