package com.snowsea;

/**
 * @ClassName: ShellSort
 * @Auther: Jerry
 * @Date: 2020/6/6 11:56
 * @Desctiption: 希尔排序
 * @Version: 1.0
 */
public class ShellSort {

    public static void sort(int[] arr) {
        long start = 0, end = 0;
        for (int h = arr.length / 2; h > 0 ; h /= 2) {
            for (int i = h; i < arr.length; i++) {
                start = System.currentTimeMillis();
                for (int j = i; j > h - 1; j -= h) {
                    int temp = 0;
                    if (arr[j] < arr[j-h]) {
                        temp = arr[j-h];
                        arr[j-h] = arr[j];
                        arr[j] = temp;
                    }
                }
                end = System.currentTimeMillis();
            }
        }
//        int h = 4;

        System.out.println("耗时：" + (end - start) + "ms");
        CommonMethod.print(arr);
    }

    public static void main(String[] args) {
        int[] arr = {9, 6, 11, 3, 5, 12, 8, 7, 10, 15, 14, 4, 1, 13, 2};
        sort(arr);
    }
}
