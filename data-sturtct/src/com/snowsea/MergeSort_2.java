package com.snowsea;

/**
 * @ClassName: MergeSort
 * @Auther: Jerry
 * @Date: 2020/6/8 9:16
 * @Desctiption: 归并排序
 * @Version: 1.0
 */
public class MergeSort_2 {

    public static void sort(int[] arr, int left, int right) {
        if (left == right) return;
        int mid = left + (right - left)/2;
        // 左边排序
        sort(arr, left, mid);
        // 右边排序
        sort(arr, mid + 1, right);
        // 归并排序
        merge(arr, left, mid + 1, right);
    }

    public static void merge(int[] arr, int left, int right, int bround) {
        int[] temp = new int[bround - left + 1];
        int mid = right - 1;
        int i = left;
        int j = right;
        int k = 0;

        while (i <= mid && j <= bround){
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {temp[k++] = arr[i++];}
        while (j <= bround) {temp[k++] = arr[j++];}
        for (int m = 0; m < temp.length; m++) {
            arr[left + m] = temp[m];
        }
//        CommonMethod.print(temp);

    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 9, 6, 8, 12};
        sort(arr, 0, arr.length - 1);
        CommonMethod.print(arr);
    }
}
