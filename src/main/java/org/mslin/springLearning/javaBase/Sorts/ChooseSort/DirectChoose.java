package org.mslin.springLearning.javaBase.Sorts.ChooseSort;

public class DirectChoose {
    static void sort(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            max = i;
            for (int j = i; j < a.length - 1; j++) {
                if(a[j] > a[max]) {
                    max = j;
                }
            }
            if (max != i) {
                swap(a, i, max);
            }
        }

    }

    static void swap(int[] a, int b, int c){
        int tmp = a[b];
        a[b] = a[c];
        a[c] = tmp;
    }

    public static void main(String[] args) {
        int[] a = new int[] {20,10,12,5,6,33,15,11,19,3};
        sort(a);
        for (int h : a) {
            System.out.println(h);
        }
    }
}
