package ReverseInteger;

class Solution {
    public static int reverse(int x) {
        String x_str = Integer.toString(x);
        int length = x_str.length();
        String[] reversed_chars = new String[length];

        for (int i = length - 1; i >= 0; i--) {
            reversed_chars[length - i - 1] = Character.toString(x_str.charAt(i));
        }

        String reversed_x = String.join("", reversed_chars);

        return Integer.parseInt(reversed_x);
    }

    public static int reverse2(int x) {
        int reversed = 0;

        while (x > 0) {
            reversed = reversed * 10 + x % 10;
            if (reversed < Integer.MIN_VALUE / 10 || reversed > Integer.MAX_VALUE / 10) return 0;
            x /= 10;
        }

        return reversed;
    }

    public static void main(String[] args) {
        int result0 = reverse2(2234674);
        System.out.println(result0);
        int result1 = reverse2(-2234674);
        System.out.println(result1);
        int result2 = reverse2(2147483647);
        System.out.println(result2);
        int result3 = reverse2(-2147483648);
        System.out.println(result3);
        int result4 = reverse2(2147483641);
        System.out.println(result4);
        int result5 = reverse2(1463847412);
        System.out.println(result5);
    }
}
