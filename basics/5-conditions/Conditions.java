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
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                result = "weekday";
                break;
            case 6:
            case 7:
                result = "weekend";
                break;
            default:
                result = "invalid";
                break;
        }
        return result;
    }
}
