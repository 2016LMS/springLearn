package org.mslin.springLearning.javaBase.OBject;

public class Test {
    public static void main(String[] args) {
//        Animal a = new Animal();
        System.out.println(Animal.i);
        String s = "abc";
        System.out.println(System.currentTimeMillis() >> 40);
        IdGenerator generator = new IdGenerator();
        System.out.println(generator.generate());

    }
}
