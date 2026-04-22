package Leetcode.PrefixSum;

import java.util.Arrays;

public class PrefixSum {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        for (int a = 1; a < arr.length; a++) {
            arr[a] = arr[a - 1] + arr[a];
        }
        System.out.println(Arrays.toString(arr));
        
    }
}
