package com.snowsea;

/**
 * @ClassName: MergeSort
 * @Auther: Jerry
 * @Date: 2020/6/8 9:16
 * @Desctiption: 归并排序
 * @Version: 1.0
 */
public class MergeSort_1 {

    public static void sort(int[] arr) {
        int i = 0, k = 0;
        int mid = arr.length / 2;
        int j = mid + 1;
        int[] temp = new int[arr.length];
        while (i <= mid && j < arr.length){
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {temp[k++] = arr[i++];}
        while (j < arr.length) {temp[k++] = arr[j++];}
        CommonMethod.print(temp);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 9, 6, 8, 12};
        sort(arr);
//        CommonMethod.print(arr);
    }
}
