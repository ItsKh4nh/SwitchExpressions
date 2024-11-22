public class Ex5 {
    public enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        int numLetters = Day(DayOfWeek.FRIDAY);
        System.out.println(numLetters);
    }

    public static int Day(DayOfWeek day) {
        return switch (day) {
            case TUESDAY    -> 7;
            case WEDNESDAY  -> 9;
            default      -> {
                int k = day.toString().length();
                yield f(k);
            }
        };
    }

    public static int f(int k) {
        return k;
    }
}
