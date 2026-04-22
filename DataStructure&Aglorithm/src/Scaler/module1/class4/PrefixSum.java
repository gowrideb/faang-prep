package Scaler.module1.class4;

import java.util.Arrays;

public class PrefixSum {
    private int[] prefixArr;

    public static void main(String[] args) {
        PrefixSum prefixSum = new PrefixSum();
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int[][] arr2d = { { 3, 5 } };
        int[][] evenIndex = { { 1, 5 } };

        System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(prefixSum.getPrefixSum(arr)));
        // System.out.println(Arrays.toString(prefixSum.getprefixSumSameArr(arr)));
        // System.out.println(prefixSum.getRageSum(3, 5));
        // System.out.println(prefixSum.getquerySum(arr, arr2d));
        System.out.println(prefixSum.getquerySum(arr, arr2d));

    }

    int[] getPrefixSum(int[] arr) {
        prefixArr = new int[arr.length];
        prefixArr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixArr[i] = prefixArr[i - 1] + arr[i];
        }
        return prefixArr;
    }

    int[] getPrefixSumEvenIndex(int[] arr) {
        prefixArr = new int[arr.length];
        prefixArr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 0) {
                prefixArr[i] = prefixArr[i - 1] + arr[i];
            } else {
                prefixArr[i] = prefixArr[i - 1];
            }
        }
        return prefixArr;
    }

    int getRageSum(int range1, int range2) {
        if (range1 == 0)
            return prefixArr[range2];
        return prefixArr[range2] - prefixArr[range1 - 1];
    }

    int[] getprefixSumSameArr(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }

    int getquerySum(int[] arr, int[][] query) {
        // int[] prefixArr = getPrefixSum(arr);
        int[] prefixArr = getPrefixSumEvenIndex(arr);
        int qRowLenght = query.length;
        int qColLenght = query[0].length;
        int sum = 0;
        for (int i = 0; i < qRowLenght; i++) {
            int left = query[i][0];
            int right = query[i][1];
            if (left == 0) {
                sum = prefixArr[right];
            } else {
                sum = prefixArr[right] - prefixArr[left - 1];
            }
        }
        return sum;
    }

}
