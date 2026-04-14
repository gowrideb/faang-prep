package Leetcode.PrefixSum;

import java.util.HashMap;

public class SubArraySumEqualsk {

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 6, -1 };
        int k = 5;
        SubArraySumEqualsk subArraySumEqualsk = new SubArraySumEqualsk();
        System.out.println(subArraySumEqualsk.subarraySum(arr, k));
    }
    public int subarraySum(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0;
        int prefixSum = 0;
        for (int num : arr) {
            prefixSum += num;
            count += map.getOrDefault(prefixSum - k, 0);
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
}