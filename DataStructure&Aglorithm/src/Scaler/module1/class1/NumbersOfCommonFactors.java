package Scaler.module1.class1;

public class NumbersOfCommonFactors {

    public static void main(String[] args) {
        int a = 12, b = 6;
        NumbersOfCommonFactors numbersOfCommonFactors = new NumbersOfCommonFactors();
        // int response = numbersOfCommonFactors.commonFactors(a, b);
        System.out.println(numbersOfCommonFactors.gcd(a, b));

    }

    public int commonFactors(int a, int b) {
        int count = 0;
        int gcd = gcd(a, b);
        for (long i = 1; i * i <= gcd; i++) {
            if (gcd % i == 0) {
                count += gcd == (i * i) ? 1 : 2;
            }
        }
        return count;
    }

    int gcd(int a, int b) {
        while (b != 0) {
            a %= b;
            int temp = a;
            a = b;
            b = temp;
        }
        return a;
    }
}
