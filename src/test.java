public class test {
    public static void main(String[] args) {
        // Ví dụ 1: Kiểu đích đã được xác định
        String result1 = switch (2) {
            case 1 -> "Một";
            case 2 -> "Hai";
            case 3 -> "Ba";
            default -> "Không xác định";
        };
        System.out.println("Kết quả 1: " + result1); // Kết quả 1: Hai

        // Ví dụ 2: Kiểu đích chưa được xác định
        var number = 2; // Kiểu của biến number là int
        var result2 = switch (number) {
            case 1 -> 1; // Trả về int
            case 2 -> 2.0; // Trả về double
            case 3 -> "Ba"; // Trả về String
            default -> "Không xác định";
        };
        System.out.println("Kết quả 2: " + result2); // Kết quả 2: 2.0

        // Kiểu của result2 sẽ là Object, vì đây là kiểu chung của các giá trị trả về
    }
}