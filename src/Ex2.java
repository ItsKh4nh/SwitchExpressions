public class Ex2 {
    public enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Day(DayOfWeek.MONDAY);
    }

    public static void Day(DayOfWeek day) {
        switch (day) {
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
                int numLetters = 6;
                break;
            case TUESDAY:
                //int numLetters = 7;
                break;
            case THURSDAY:
            case SATURDAY:
                //int numLetters = 8;
                break;
            case WEDNESDAY:
                //int numLetters = 9;
                break;
        }
    }
}