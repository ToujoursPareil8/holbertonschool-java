public class StringTraps {
    public static boolean sameContent(String a, String b) {
        if (a == b) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        return a.equals(b);
    }

    public static boolean sameObject(String a, String b) {
        return a == b;
    }

    public static String repeat(String s, int times, String separator) {
        if (times <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(s);
            if (i < times - 1) {
                sb.append(separator);
            }
        }
        return sb.toString();
    }

    public static String reverse(String s) {
        if (s == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static String buildSlow(int n) {
    String result = "";
    for (int i = 0; i < n; i++) {
        result += (char) ('a' + i % 26);
    }
    return result;
    }

    public static String buildFast(int n) {
    StringBuilder sb = new StringBuilder(n);
    for (int i = 0; i < n; i++) {
        sb.append((char) ('a' + i % 26));
    }
    return sb.toString();
    }
}
