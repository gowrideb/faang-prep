package Scaler.module1.class1;

public class CountOfFactors {

    public static void main(String[] args) {
        int num = 10;
        CountOfFactors countOfFactors = new CountOfFactors();
        System.out.println(countOfFactors.getFactorsCount(num));

    }

    public int getFactorsCount(int n) {
        if (n <= 0)
            return 0;
        if (n <= 1)
            return 1;
        int count = 0;
        for (long a = 1; a * a <= n; a++) {
            if (n % a == 0) {
                count += n == a * a ? 1 : 2;
            }
        }
        return count;
    }

}
