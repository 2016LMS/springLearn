package org.mslin.springLearning.javaBase.Sorts.insert;

public class DirectInsertSort {

    static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }

    static void insertSort(int a[], int n) {
        int j = 0;
        int x = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] < a[i - 1]) {               //若第i个元素大于i-1元素，直接插入。小于的话，移动有序表后插入
                j = i - 1;
                x = a[i];         //复制为哨兵，即存储待排序元素
                a[i] = a[i - 1];           //先后移一个元素
                while (x < a[j]) {     //查找在有序表的插入位置
                    a[j + 1] = a[j];
                    j--;         //元素后移
                }
                a[j + 1] = x;         //插入到正确位置
            }
        }
    }

    static void insert2(int[] a) {
        int anchor = 0;
        int j = 0;
        for (int i = 1; i < a.length; i++) {
            j = i;
            anchor = a[i];
            if (a[j - 1] < a[j]) continue; //不动直接下次循环
            while( j > 0 && a[j - 1] > anchor) {
                    a[j] = a[j-1];
                    j--;
            }
            a[j] = anchor;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{2,6,10,3,10,5};
        insert2(a);
        for (int h : a) {
            System.out.println(h);
        }
    }
}
