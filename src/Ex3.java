public class Ex3 {
    static void howMany(int k) {
        switch (k) {
            case 1  -> System.out.println("one");
            case 2  -> System.out.println("two");
            default -> System.out.println("many");
        }
    }

//    static void howMany(int k) {
//        System.out.println(
//                switch (k) {
//                    case  1 -> "one";
//                    case  2 -> "two";
//                    default -> "many";
//                }
//        );
//    }

    public static void main(String[] args) {
        howMany(1);
        howMany(2);
        howMany(3);
    }
}
