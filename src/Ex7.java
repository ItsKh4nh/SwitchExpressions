public class Ex7 {

    enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }

    static String getSeasonMessage(Season season) {
        return switch (season) {
            case WINTER -> "Cold and snowy";
            case SPRING -> "Flowers bloom";
            case SUMMER -> "Hot and sunny";
            case AUTUMN -> "Leaves fall";
            // default -> "";
            // Không cần mệnh đề default vì tất cả các hằng số đã được bao quát
        };
    }

    public static void main(String[] args) {
        System.out.println(getSeasonMessage(Season.WINTER));
        System.out.println(getSeasonMessage(Season.SUMMER));
    }
}
