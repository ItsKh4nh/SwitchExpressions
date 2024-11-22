public class Ex9 {
    public static void main(String[] args) {
        int x = 2;

        // Sử dụng vòng lặp for để thử câu lệnh continue
        for (int i = 0; i < 5; i++) {
            System.out.println("Vòng lặp " + i);

            // continue;

            // Biểu thức switch nằm sau continue (lỗi biên dịch)
            switch (x) {
                case 1:
                    System.out.println("X = 1");
                    break;
                case 2:
                    System.out.println("X = 2");
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
    }
}
