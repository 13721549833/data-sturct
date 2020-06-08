package com.snowsea;

/**
 * @ClassName: BubbleSort
 * @Auther: Jerry
 * @Date: 2020/6/6 10:34
 * @Desctiption: 冒泡排序
 * @Version: 1.0
 */
public class BubbleSort {

    public static void sort(int[] arr) {
        long start = 0, end = 0;
        for (int i = arr.length - 1; i > 0 ; i --) {
            start = System.currentTimeMillis();
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1])
                    CommonMethod.swap(arr, j, j+1);
            }
            end = System.currentTimeMillis();
        }
        System.out.println("耗时：" + (end - start) + "ms");
        CommonMethod.print(arr);
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 2, 9, 8, 6, 7, 1};
        sort(arr);
    }
}
