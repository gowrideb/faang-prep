package Scaler.module1.class1;

public class PrimeNumber {
    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        int num = 25;
        boolean isPrimeStatus = primeNumber.isPrime(num);
        System.out.println("Prime Status: " + isPrimeStatus);
        primeNumber.getPrimeList();

    }

    public boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int a = 5; a * a <= n; a += 6) {
            if (n % a == 0 || n % (a + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    void getPrimeList() {
        for (int i = 0; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + ", ");
            }
        }
    }
}
