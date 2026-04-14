package Leetcode.PrefixSum;

import java.util.Arrays;

public class PrefixSumWithNewArr {
    private static int[] prefixArr;

    public PrefixSumWithNewArr(int[] arr) {
        prefixArr = new int[arr.length];
        prefixArr[0] = arr[0];
        for (int a = 1; a < arr.length; a++) {
            prefixArr[a] = prefixArr[a - 1] + arr[a];
        }
        System.out.println(Arrays.toString(prefixArr));

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        new PrefixSumWithNewArr(arr);

    }

}
