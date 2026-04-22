package Scaler.module1.class2;

import java.util.Arrays;

public class ReverseArrKTimesLeftToRight {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int arrLenght = arr.length - 1;
        int k = 11;
        k = k % arrLenght;
        System.out.println(k);
        reverse(arr, 0, arrLenght);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arrLenght);
        System.out.println(Arrays.toString(arr));

    }

    static int[] reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
