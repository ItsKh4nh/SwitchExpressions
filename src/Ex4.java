public class Ex4 {
    static void mixedTypesSwitch(int k) {
        System.out.println(
            switch (k) {
                case 1 -> "One";       // String
                case 2 -> 2;           // Integer
                case 3 -> 3.0;         // Double
                default -> true;       // Boolean
            }
        );
    }

    public static void main(String[] args) {
        mixedTypesSwitch(1);
        mixedTypesSwitch(2);
        mixedTypesSwitch(3);
        mixedTypesSwitch(4);
    }
}
