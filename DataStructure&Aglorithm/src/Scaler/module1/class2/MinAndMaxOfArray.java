package Scaler.module1.class2;

public class MinAndMaxOfArray {
    public static void main(String[] args) {

        int []arr={1,2,3,4,5,6,};
        MinAndMaxOfArray minAndMaxOfArray = new MinAndMaxOfArray();
        System.out.println(minAndMaxOfArray.solve(arr));
        
    }

    public int solve(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            min = num > min ? min : num;
            max = num > max ? num : max;
        }
        return min + max;
    }
}
