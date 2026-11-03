public class Loops {
    public static int sumTo(int n) {
        if (n < 1) {
            return 0;
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static long factorial(int n) {
        if (n < 0 || n > 20) {
            return -1L;
        }
        long result = 1L;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static String triangle(int height) {
        if (height < 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= height; i++) {
            if (i > 1) {
                sb.append("\n");
            }
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
        }
        return sb.toString();
    }

    public static int countDigits(int n) {
        long num = Math.abs((long) n);
        int count = 0;
        do {
            count++;
            num /= 10;
        } while (num > 0);
        return count;
    }

    public static int collatzSteps(long n) {
        if (n <= 0) {
            return -1;
        }
        int steps = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            steps++;
        }
        return steps;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}