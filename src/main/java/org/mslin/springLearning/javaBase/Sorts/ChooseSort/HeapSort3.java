package org.mslin.springLearning.javaBase.Sorts.ChooseSort;

public class HeapSort3 {
    static void sort(int[] a) {
        int len = a.length;
        buildMaxHeap(a, len);
        for (int j = a.length - 1; j > 0; j--) {
            swap(a, 0, j);
            heapify(a, 0, j);
        }
    }

    static void heapify(int[] a, int i, int len) {
        int left = 2*i + 1;
        int right = 2*i +2;
        int largest = i;
        if (left < len) {
            if (a[left] > a[largest]) {
                largest = left;
            }
        }
        if (right < len) {
            if (a[right] > a[largest]) {
                largest = right;
            }
        }

        if (largest != i) {
            swap(a, i, largest);
            heapify(a, largest, len);
        }
    }


    static void buildMaxHeap(int[] a, int len) {
        for (int i = (a.length - 1)/2; i >= 0; i--) {
            heapify(a, i, len);
        }
    }

    static void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

    public static void main(String[] args) {
        int[] a = new int[] {20,10,12,5,6,33,15,11,19,3};
        sort(a);
        for (int h : a) {
            System.out.println(h);
        }
    }
}
