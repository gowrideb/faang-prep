package Leetcode.PrefixSum;

import java.util.Arrays;

public class RangeSumQuery {
    private int[] prefixArr;

    public RangeSumQuery(int[] arr) {
        for (int a = 1; a < arr.length; a++) {
            arr[a] += arr[a - 1];
        }
        this.prefixArr = arr;
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return prefixArr[right];
        }
        return prefixArr[right + 1] - prefixArr[left];
    }

    public static void main(String[] args) {
        int[] arr = { -2, 0, 3, -5, 2, -1 };
        RangeSumQuery rangeSumQuery = new RangeSumQuery(arr);
        System.out.println(rangeSumQuery.sumRange(1, 2));
        System.out.println(Arrays.toString(rangeSumQuery.prefixArr));

    }
}
