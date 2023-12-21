package basic.dev;

import java.util.Scanner;

public class MainApp2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Nhập giá trị n từ người dùng
        System.out.print("Nhập giá trị n: ");
        int n = scanner.nextInt();

        // Tính tổng S
        double tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += Math.sqrt(i);
        }

        // Hiển thị kết quả
        System.out.println("Tổng S là: " + tong);

        // Đóng Scanner
        scanner.close();
    }
}