package org.mslin.springLearning.javaBase.Sorts.insert;

public class InsertSort {

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

    public static void main(String[] args) {
        int[] a = new int[]{2,6,10,3,10,5};
        insertSort(a, a.length);
        for (int h : a) {
            System.out.println(h);
        }
    }
}
