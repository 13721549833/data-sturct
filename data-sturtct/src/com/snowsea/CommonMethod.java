package com.snowsea;

/**
 * @ClassName: CommonMethod
 * @Auther: Jerry
 * @Date: 2020/6/6 9:29
 * @Desctiption: TODO
 * @Version: 1.0
 */
public class CommonMethod {

    /**
     * 两个数交换
     * @param arr 数组
     * @param i i
     * @param j j
     */
    public static void swap(int[] arr ,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 打印
     * @param arr 数组
     */
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
