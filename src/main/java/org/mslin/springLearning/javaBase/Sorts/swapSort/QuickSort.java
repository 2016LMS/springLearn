package org.mslin.springLearning.javaBase.Sorts.swapSort;


public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[]{7,11,3,5,23,10};
        quickSort(array, 0, array.length - 1);
        for (int h : array) {
            System.out.println(h);
        }
    }

    //快排优化，只对长度大于8的子序列进行快速排序递归， 当子序列长度小于8时退出循环， 对整个序列进行直接插入排序（当序列基本有序时使用直接插入排序效率很高）
    public static void quickSort(int[] array, int l, int r) {
        if (l < r) {
            int anchor = adjustArray(array, l, array.length-1);
            quickSort(array, l, anchor - 1);
            quickSort(array, anchor + 1, r);
        }

    }

    public static int adjustArray(int s[], int l, int r) { //返回调整后基准数的位置
        int i = l, j = r;
        int x = s[l]; //s[l]即s[i]就是第一个坑
        while (i < j)
        {
            // 从右向左找小于x的数来填s[i]
            while(i < j && s[j] >= x)
                j--;
            if(i < j)
            {
                s[i] = s[j]; //将s[j]填到s[i]中，s[j]就形成了一个新的坑
                i++;
            }

            // 从左向右找大于或等于x的数来填s[j]
            while(i < j && s[i] < x)
                i++;
            if(i < j)
            {
                s[j] = s[i]; //将s[i]填到s[j]中，s[i]就形成了一个新的坑
                j--;
            }
        }
        //退出时，i等于j。将x填到这个坑中。
        s[i] = x;
        return i;
    }

    static void quick_sort(int s[], int l, int r)
    {
        if (l < r)
        {
            //Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1
            int i = l, j = r, x = s[l];
            while (i < j)
            {
                while(i < j && s[j] >= x) // 从右向左找第一个小于x的数
                    j--;
                if(i < j)
                    s[i++] = s[j];

                while(i < j && s[i] < x) // 从左向右找第一个大于等于x的数
                    i++;
                if(i < j)
                    s[j--] = s[i];
            }
            s[i] = x;
            quick_sort(s, l, i - 1); // 递归调用
            quick_sort(s, i + 1, r);
        }
    }
}
