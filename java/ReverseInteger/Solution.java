package ReverseInteger;

class Solution {
    public static int reverse(int x) {
        String x_str = Integer.toString(Math.abs(x));
        int length = x_str.length();
        String[] reversed_chars = new String[length];

        for (int i = length - 1; i >= 0; i--) {
            reversed_chars[length - i - 1] = Character.toString(x_str.charAt(i));
        }

        String reversed_x = String.join("", reversed_chars);

        try {
            if (x >= 0) return Integer.parseInt(reversed_x);
            else return -Integer.parseInt(reversed_x);
        } catch (NumberFormatException error) {
            return 0;
        }
    }

    public static int reverse2(int x) {
        int reversed = 0;
        boolean negative = false;

        if (x < 0) {
            x = -x;
            negative = true;
        };

        while (x > 0) {
            if (reversed > ((Integer.MAX_VALUE - (x % 10)) / 10)) return 0;

            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return negative ? -reversed : reversed;
    }

    public static void main(String[] args) {
        int result = reverse2(2234674);
        System.out.println(result == 4764322);
    }
}
