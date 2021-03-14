package org.mslin.springLearning.javaBase.Sorts.mergeSort;

public class MergeSort {
    static void sort(int a[]) {
        int[] temp = new int[a.length];
        doSort(a, 0, a.length - 1, temp);
    }

    static void doSort(int[] a, int start, int end, int[] temp) {
        if (start >= end) return;
        int mid = (start + end) / 2;
        doSort(a, start, mid, temp);
        doSort(a, mid + 1, end, temp);
        merge(a, start, mid, end, temp);
    }

    static void merge(int[] a, int start, int mid, int end, int[] temp) {
        int i = start, j = mid + 1, t = 0;

        while(i <= mid && j <= end) {
            if (a[i] < a[j]) {
                temp[t++] = a[i++];
            }
            if (a[j] < a[i]) {
                temp[t++] = a[j++];
            }
        }
        while(i <= mid){//将左边剩余元素填充进temp中
            temp[t++] = a[i++];
        }
        while(j <= end){//将右序列剩余元素填充进temp中
            temp[t++] = a[j++];
        }
        t = 0;
        while (start <= end) {
            a[start++] = temp[t++];
        }
    }

    public static void main(String[] args) {
        int[] a = new int[] {20,10,12,5,6,33,15,11,19,3};
        sort(a);
        for (int h : a) {
            System.out.println(h);
        }
    }

}
