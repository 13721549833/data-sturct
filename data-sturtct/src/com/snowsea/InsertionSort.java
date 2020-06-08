package com.snowsea;

/**
 * @ClassName: InsertionSort
 * @Auther: Jerry
 * @Date: 2020/6/6 11:17
 * @Desctiption: 插入排序
 * @Version: 1.0
 */
public class InsertionSort {

    public static void sort(int[] arr) {
        long start = 0, end = 0;
        for (int i = 1; i < arr.length; i++) {
            start = System.currentTimeMillis();
            for (int j = i; j > 0 && arr[j] < arr[j-1]; j--) {
                int temp = 0;
//                if () {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
//                }
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
