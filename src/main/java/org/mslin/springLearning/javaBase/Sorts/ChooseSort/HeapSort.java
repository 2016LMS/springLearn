package org.mslin.springLearning.javaBase.Sorts.ChooseSort;

/**
 * @Description: 堆排序就是在for循环中构建大顶堆
 */
public class HeapSort {
    static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }

    static void heap(int a[]) {
        if (a.length <= 1) return;
        int root = 0; //根节点的序号
        for (int i = a.length / 2; i >= 0; i--) {//每个循环就是构建一个大顶堆
                   if (i * 2 + 2 < a.length && a[i * 2 + 2] > a[i]) { //根节点的右子树存在,且大于根节点
                       swap(a[i], a[i * 2 + 2]);
                   }
                   if (i * 2 + 1 < a.length && a[i * 2 + 1] > a[i]) { //根节点的左子树存在,且大于根节点
                       swap(a[i], a[i * 2 + 1]);
                   }
//              //将大定堆的root和最后一个节点交换
//                swap(a[0], a[i]);
//               //将交换打乱的大顶堆重新排序好
//                for (int j = root; j >= 0; j--) { //每个循环就是把一个最小二叉树（根，左，右节点）排序
//                    if (j * 2 + 2 < a.length && a[j * 2 + 2] > a[j]) { //根节点的右子树存在,且大于根节点
//                        swap(a[j], a[j * 2 + 2]);
//                    }
//                    if (j * 2 + 1 < a.length && a[j * 2 + 1] > a[j]) { //根节点的左子树存在,且大于根节点
//                        swap(a[j], a[j * 2 + 1]);
//                    }
//                }
            }
    }

    public static void main(String[] args) {
        int[] a = new int[] {20,10,12,5,6,33,15,11,19,3};
        heapSort(a);
        for (int h : a) {
            System.out.println(h);
        }
    }

    public static void HeapAdjust(int[] array, int parent, int length) {
        int temp = array[parent]; // temp保存当前父节点
        int child = 2 * parent + 1; // 先获得左孩子

        while (child < length) {
            // 如果有右孩子结点，并且右孩子结点的值大于左孩子结点，则选取右孩子结点
            if (child + 1 < length && array[child] < array[child + 1]) {
                child++;
            }

            // 如果父结点的值已经大于孩子结点的值，则直接结束
            if (temp >= array[child])
                break;

            // 把孩子结点的值赋给父结点
            array[parent] = array[child];

            // 选取孩子结点的左孩子结点,继续向下筛选
            parent = child;
            child = 2 * child + 1;
        }

        array[parent] = temp;
    }

    public static void heapSort(int[] list) {
        // 循环建立初始堆
        for (int i = list.length / 2; i >= 0; i--) {
            HeapAdjust(list, i, list.length);
        }

        // 进行n-1次循环，完成排序
        for (int i = list.length - 1; i > 0; i--) {
            // 最后一个元素和第一元素进行交换
            int temp = list[i];
            list[i] = list[0];
            list[0] = temp;

            // 筛选 R[0] 结点，得到i-1个结点的堆
            HeapAdjust(list, 0, i);
        }
    }
}
