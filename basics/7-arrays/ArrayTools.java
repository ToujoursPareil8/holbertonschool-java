public class ArrayTools {
    public static int max(int[] t) {
        int maximum = t[0];
        for (int i = 1; i < t.length; i++) {
            if (t[i] > maximum) {
                maximum = t[i];
            }
        }
        return maximum;
    }

    public static int min(int[] t) {
        int minimum = t[0];
        for (int i = 1; i < t.length; i++) {
            if (t[i] < minimum) {
                minimum = t[i];
            }
        }
        return minimum;
    }

    public static double average(int[] t) {
        if (t.length == 0) {
            return 0.0;
        }
        long sum = 0;
        for (int value : t) {
            sum += value;
        }
        return (double) sum / t.length;
    }

    public static void reverseInPlace(int[] t) {
        int left = 0;
        int right = t.length - 1;
        while (left < right) {
            int temp = t[left];
            t[left] = t[right];
            t[right] = temp;
            left++;
            right--;
        }
    }

    public static int indexOf(int[] t, int value) {
        for (int i = 0; i < t.length; i++) {
            if (t[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int[][] identity(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            matrix[i][i] = 1;
        }
        return matrix;
    }

    public static String format(int[][] m) {
        if (m.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m.length; i++) {
            if (i > 0) {
                sb.append("\n");
            }
            for (int j = 0; j < m[i].length; j++) {
                if (j > 0) {
                    sb.append(" ");
                }
                sb.append(m[i][j]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4};

        System.out.println(tab);
        System.out.println(java.util.Arrays.toString(tab));
    }
}