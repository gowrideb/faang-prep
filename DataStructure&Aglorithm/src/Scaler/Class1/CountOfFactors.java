public class CountOfFactors {
    public static void main(String[] args) {
        CountOfFactors countOfFactors = new CountOfFactors();
        int A = 100000000;
        int result = countOfFactors.solve(A);
        System.out.println("Number of factors of " + A + " is: " + result);
    }

    public int solve(int num) {
        if (num <= 0)
            return 0;
        if (num <= 1)
            return 1;

        int count = 0;
        int sqrt = (int) Math.sqrt(num);

        for (int a = 1; a <= sqrt; a++) {
            if (num % a == 0) {
                count += (a == num / a) ? 1 : 2;
            }
        }   
        return count;
    }
}
