public class Conditions {
    public static  String fizzBuzz (int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(n);
        }
    }

    public static String dayType(int day) {
        String result;
        result = switch (day) {
            case 1, 2, 3, 4, 5 -> "weekday";
            case 6, 7 -> "weekend";
            default -> "invalid";
        };
        return result;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int daysInMonth(int month, int year) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> -1;
        };
    }

    public static String grade(int score) {
        String result;
        if (score < 0 || score > 100) {
            return "invalid";
        }
        if (score >= 90 && score <= 100) {
            result = "A";
        } else if (score >= 80 && score <= 89) {
            result = "B";
        } else if (score >= 70 && score <= 79) {
            result = "C";
        } else if (score >= 60 && score <= 69) {
            result = "D";
        } else {
            result = "F";
        }
        return result;
    }


}
