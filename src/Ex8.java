public class Ex8 {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Day day = Day.MONDAY;

        // Biểu thức switch lỗi
        try {
            int result1 = switch (day) {
                case MONDAY -> {
                    System.out.println("Monday");
                     // yield 0;
                }
                default -> 1;
            };
            System.out.println("Result 1: " + result1);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Biểu thức switch chính xác
        int result2 = switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY -> 0;
            default -> {
                System.out.println("Second half of the week");
                yield 1;
            }
        };
        System.out.println("Kết quả 2: " + result2);
    }
}
