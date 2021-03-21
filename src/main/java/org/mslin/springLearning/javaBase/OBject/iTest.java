package org.mslin.springLearning.javaBase.OBject;

public class iTest {
    static void add(int i) {
        i = 5;
    }
    static void add2(int[] a) {
        a[0] = 5;
    }

    public static void main(String[] args) {
        int i = 0;
        add(i); //对于基本数据类型是值传递
        int[] array = new int[]{1,2,3};
        add2(array);
        System.out.println(array[0]); //对于对象，数组（new出来的对象）是引用传递
        i = i++;
        i = (i++);
        i = ++i;
        System.out.println(i);
    }
}
