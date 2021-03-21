package org.mslin.springLearning.javaBase.StringDemo;

import java.util.Arrays;

/**
 * @Description: 字符串翻转
 */
public class RevertString {
    static String  revert(String s) {
        if (s == null || s.trim().equals("")) {
            return null;
        }
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            swap(chars, left, right);
            left++;
            right--;
        }
        return new String(chars);
    }

    static void swap(char[] c, int a, int b) { //注意值传递和引用传递
        char temp = c[a];
        c[a] = c[b];
        c[b] = temp;
    }

    public static void main(String[] args) {
        String a = "abcdefgh";
        System.out.println(revert(a));
        int ab = 3;
        System.out.println(ab  | 1);
    }
}
