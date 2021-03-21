package org.mslin.springLearning.javaBase.OBject;

/**
 * 类型转换
 */
public class TypeConversion {
    void print(int a) {
        System.out.println("方法1");
    }
    void print(String s) {
        System.out.println("方法2");
    }

    public static void main(String[] args) {
        char a = 'a';
        new B().print(a);
    }
}

class B extends TypeConversion {

}


