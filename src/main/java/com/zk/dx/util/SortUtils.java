package com.zk.dx.util;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Zhangka in 2018/07/17
 */
public class SortUtils {
    private SortUtils() {
        throw new AssertionError("No com.zk.dx.util.SortUtils instances for you!");
    }

    /**
     * 冒泡排序.
     *
     * @param arr
     */
    public static void bubble(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; ++i) {
            for (int j = 0; j < len - i - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    /**
     * 快速排序.
     * @param arr
     * @param left
     * @param right
     */
    public static void quick(int[] arr, int left, int right) {
        if (left >= right)
            return;

        int k = arr[left];
        int i = left;
        int j = right;

        while (i < j) {
            while (i < j && arr[j] >= k) {
                --j;
            }
            arr[i] = arr[j];

            while (i < j && arr[i] <= k) {
                ++i;
            }
            arr[j] = arr[i];
        }

        arr[i] = k;
        quick(arr, left, i - 1);
        quick(arr, i + 1, right);
    }

    public static void main(String[] args) {
        int[] arr = new int[100];
        ThreadLocalRandom random = ThreadLocalRandom.current();
        for (int i = 0; i < 100; ++i) {
            arr[i] = random.nextInt(100);
        }
        quick(arr, 0, arr.length - 1);

        System.out.println("=====================================");
        for (int e : arr) {
            System.out.print(e);
            System.out.print(",");
        }
    }
}
