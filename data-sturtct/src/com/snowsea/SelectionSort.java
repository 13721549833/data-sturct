package com.snowsea;

/**
 * @ClassName: SelectorSort
 * @Auther: Jerry
 * @Date: 2020/6/6 9:07
 * @Desctiption: 选择排序
 * @Version: 1.0
 */
public class SelectionSort {

    public static void sort(int[] arr){
        long start = 0, end = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            start = System.currentTimeMillis();

            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPos = arr[j] < arr[minPos] ? j : minPos;
            }
            CommonMethod.swap(arr, i, minPos);

            end = System.currentTimeMillis();

//            System.out.println("minPots:" + minPos);
        }
        System.out.println("耗时：" + (end - start) + "ms");
        CommonMethod.print(arr);
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 2, 9, 8, 6, 7, 1};
        sort(arr);
    }


}
