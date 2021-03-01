package org.mslin.springLearning.javaBase.Sorts.swapSort;

public class BubbleSort {
    public static int[] sort(int[] array) {
        if (array == null || array.length == 0) return null;
        int tmp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[i]) {
                    tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int [] array = new int[]{6, 5, 11 ,9, 5, 20};
        sort(array);
        for (int j : array) {
            System.out.println(j);
        }
    }
}
