package org.mslin.springLearning.javaBase.OBject;

public class ObjectDemo {
    public static void main(String[] args) {
        String dayOfWeek = "2020-2021-1,5,7";
        String sterm = dayOfWeek.substring(0, dayOfWeek.indexOf(","));
        int day = Integer.parseInt(dayOfWeek.substring(dayOfWeek.indexOf(",") + 1, dayOfWeek.lastIndexOf(",")));
        int grade = Integer.parseInt(dayOfWeek.substring(dayOfWeek.lastIndexOf(",") + 1 ));
        System.out.println(sterm +" " + day + " "  + grade);
        System.out.println(5 / 2);
    }
}
