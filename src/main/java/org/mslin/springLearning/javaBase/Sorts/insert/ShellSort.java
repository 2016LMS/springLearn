package org.mslin.springLearning.javaBase.Sorts.insert;


/**
 * @Description: 希尔排序就是将直接插入排序的递增量变为序列长度的1/2
 */
public class ShellSort {
    static void shell(int[] a) {
        int j = 0;
        int anchor = 0;
        for (int d = a.length/2; d > 0; d--) {
            for (int i = d; i < a.length; i++) {
                j = i;
                anchor = a[i];
                if (j > d && a[j - d] < a[j]) continue; //直接跳过
                while (j > d && a[j - d] > anchor) {
                    a[j] = a[j - d];
                    j -= d;
                }
                a[j] = anchor;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{2,6,10,3,10,5};
        shell(a);
        for (int h : a) {
            System.out.println(h);
        }
    }
}
