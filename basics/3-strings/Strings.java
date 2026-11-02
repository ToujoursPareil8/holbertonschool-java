public class Strings {
    public static String capitalize(String s) {
        if (s.isEmpty()) {
            return "";
        }
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
        }

    public static int countWords(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        String trimmed = s.trim();
        if (trimmed.isEmpty()) {
            return 0;
        }
        String[] words = trimmed.split("\\s+");
        return words.length;
    }

    public static String initials(String s) {
        if (s.isEmpty()) {
            return "";
        }
        String[] words = s.trim().split("\\s+");
        StringBuilder initials = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                initials.append(Character.toUpperCase(word.charAt(0)));
            }
        }
        return initials.toString();
    }

    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        String cleaned = s.replace(" ", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public static String extractDomain(String email) {
    for (int i = 0; i < email.length(); i++) {
        if (email.charAt(i) == '@') {
            return email.substring(i + 1);
        }
    }
    return "";
    }
}