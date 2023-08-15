package PalindromeNumber;

public class Solution {
    public static boolean isPalindrome(int x) {
        String numbers = Integer.toString(x);
        int length = numbers.length();

        for (int i = 0; i < length/2; i++) {
            if (numbers.charAt(i) != numbers.charAt(length - i - 1)) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        boolean isPalindrome = isPalindrome(122656221);
        System.out.println(isPalindrome);
    }
}