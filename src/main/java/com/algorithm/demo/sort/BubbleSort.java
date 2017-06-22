package com.algorithm.demo.sort;

import java.util.Arrays;

/**
 * @author chengyu.hcy
 * @since 2017/6/21
 */
public class BubbleSort {

    /**
     * 冒泡排序
     * 时间复杂度O(n²)
     */
    public static void main(String[] args) {

        int[] traditionList = {3, 2, 4, 1, 5, 4, 3, 7, 0};
        int[] optimizeList = {3, 2, 4, 1, 5, 4, 3, 7, 0};

        // 传统冒泡排序
        traditionBubbleSort(traditionList);
        Arrays.stream(traditionList).forEach(System.out::print);

        // 优化冒泡排序
        optimizeBubbleSort(optimizeList);
    }

    /**
     * 设置一个flag减少无效循环
     */
    private static void optimizeBubbleSort(int[] optimizeList) {
        int temp;
        boolean isSorted = false;
        // 两遍遍历
        for (int i = 0; i < optimizeList.length - 1; i++) {
            //外层每循环一次，内层循环依次减 1
            isSorted = true;
            for (int j = 0; j < optimizeList.length - i - 1; j++) {
                if (optimizeList[j + 1] < optimizeList[j]) {
                    temp = optimizeList[j];
                    optimizeList[j] = optimizeList[j + 1];
                    optimizeList[j + 1] = temp;
                    isSorted = false;
                }
                if (isSorted) {
                    break;
                }
            }
        }
    }

    private static void traditionBubbleSort(int[] traditionList) {
        int temp;
        // 两遍遍历
        for (int i = 0; i < traditionList.length - 1; i++) {
            //外层每循环一次，内层循环依次减 1
            for (int j = 0; j < traditionList.length - i - 1; j++) {
                if (traditionList[j + 1] < traditionList[j]) {
                    temp = traditionList[j];
                    traditionList[j] = traditionList[j + 1];
                    traditionList[j + 1] = temp;
                }
            }
        }
    }
}
