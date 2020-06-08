package com.snowsea;

import java.util.Arrays;
import java.util.Random;

/**
 * @ClassName: DataChecker
 * @Auther: Jerry
 * @Date: 2020/6/6 10:10
 * @Desctiption: 对数器
 * @Version: 1.0
 */
public class DataChecker {

    public static int[] generateArray(){
        Random random = new Random();
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i ++) {
            arr[i] = random.nextInt(10000);
        }
        return arr;
    }

    public static void check(){
        int[] arr = generateArray();
        int[] arr2 = new int[arr.length];
        System.arraycopy(arr, 0, arr2, 0, arr.length);

        long start = System.currentTimeMillis();
        Arrays.sort(arr);
        CommonMethod.print(arr);
        System.out.println("");

        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start) + "ms");

//        SelectorSort.sort(arr2);
//        BubbleSort.sort(arr2);
//        InsertionSort.sort(arr2);
        ShellSort.sort(arr2);

        boolean same = true;
        for (int i = 0; i < arr2.length; i++) {
            if (arr[i] != arr2[i])
                same = false;
        }
        System.out.println("");
        System.out.println(same == true ? "right" : "wrong");
    }

    public static void main(String[] args) {
		check();
	}
    
}
