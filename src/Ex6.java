public class Ex6 {
    public static void main(String[] args) {
        String input = "PC";

        int result = switch (input) {
            case "PC":
                yield 1;
            case "Laptop":
                yield 2;
            default:
                System.out.println("Neither PC nor Laptop, hmmm...");
                yield 0;
        };
        System.out.println("Result: " + result);
    }
}
