package org.mslin.springLearning.javaBase.OBject;

public class Animal
{
    static int i;

    static
    {
       int i = 1; //静态代码块里的变量都是局部变量，只在块内有效,此i 非上面的i
        System.out.println("This is Animal Static area Code... ");
    }

    {
        System.out.println("This is Animal General area Code...");
    }
    //static String constant;

    public Animal()
    {
        System.out.println("This is Animal Construct Method...");
    }

    public void running()
    {
        System.out.println("I'm  Running");
    }

}
