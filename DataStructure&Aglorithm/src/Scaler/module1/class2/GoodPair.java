package Scaler.module1.class2;

import java.util.HashSet;

public class GoodPair {
    public static void main(String[] args) {
        int[] arr = { 1, 2 };
        int x = 4;
        GoodPair goodPair = new GoodPair();
        int res = goodPair.solve(arr, x);
        System.out.println("res: " + res);

    }

    public int solve(int[] A, int B) {
        if (A == null || A.length <= 0)
            return 0;

        HashSet<Long> hSet = new HashSet<>();

        for (long num : A) {
            long value = (long) B - num;
            if (hSet.contains(value)) {
                return 1;
            }
            hSet.add(num);
        }
        return 0;
    }

}
