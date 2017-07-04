package com.algorithm.demo.sort;

import java.util.Arrays;

/**
 * @author chengyu.hcy
 * @since 2017/6/22
 */
public class QuickSort {

    /**
     * 快速排序
     * 平均时间 : O(n log(n))
     * 最坏情况 : O(n²)
     */
    public static void main(String[] args) {
        int[] paramList = {3, 2, 4, 1, 5, 4, 3, 7, 0};
        int paramSize = paramList.length;
        quickSort(paramList, 0, paramSize - 1);
        Arrays.stream(paramList).forEach(System.out::print);
    }

    private static void quickSort(int[] paramList, int start, int end) {
        if (start < end) {
            // 取中间位置数值,并且位移左小右大的数值
            int middle = getMiddle(paramList, start, end);
            // 两侧分别递归
            quickSort(paramList, start, middle - 1);
            quickSort(paramList, middle + 1, end);
        }
    }

    private static int getMiddle(int[] paramList, int start, int end) {
        //数组的第一个作为中轴
        int temp = paramList[start];
        while (start < end) {
            // 判断中轴右侧的要大就不动,小的话就交换
            while (start < end && paramList[end] >= temp) {
                end--;
            }
            // 比中轴小的记录移到低端
            paramList[start] = paramList[end];
            while (start < end && paramList[start] <= temp) {
                start++;
            }
            // 比中轴大的记录移到高端
            paramList[end] = paramList[start];
        }
        // 中间内存值放回剩余start坐标位置
        paramList[start] = temp;
        // 返回位置
        return start;
    }
}
