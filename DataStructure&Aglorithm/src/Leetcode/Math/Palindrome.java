package Leetcode.Math;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        int num = 1234421;
        boolean isPalindromeStatus = palindrome.isPalindrome(num);
        System.err.println("Palindrome Status: " + isPalindromeStatus);

    }

    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reverseHalf = 0;
        while (x > reverseHalf) {
            reverseHalf = (reverseHalf * 10) + (x % 10);
            x /= 10;
        }
        return x == reverseHalf || x == reverseHalf / 10;
    }
}
