package org.mslin.springLearning.javaBase.Leetcode;

import java.util.Arrays;

/**
 * 有一个xyz的立方体，要在这个立方体上砍k刀，每一刀可以看作是用一个平行于立方体某一面的平面切割立方体，
 * 且必须在坐标为整数的位置切割，如在x=0.5处用平面切割是非法的。
 * 问在切割k刀之后，最多可以把立方体切割成多少块。切割立方体
 */
public class CutCube {
    static void cut(int x, int y, int z, int k) {
        int arr[] = new int[]{x, y, z};
        Arrays.sort(arr); //排序，从边长最长的一头开始
        System.out.println(arr[0]);
        int x1 = 1, y1 = 1, z1 = 1;
        for (int i = 0; i < k;) {
            if (x1 < arr[0]) {
                x1++;
                i++;
            }
            if (y1 < arr[1] && i < k) {
                y1++;
                i++;
            }
            if (z1 < arr[2] && i < k) {
                z1++;
                i++;
            }
            if (x1 == arr[0] && y1 == arr[1] && z1 == arr[2]) break;

        }
        System.out.println(x1 * y1 * z1);

    }

    public static void main(String[] args) {
        cut(3,3,3, 111);
    }
}
