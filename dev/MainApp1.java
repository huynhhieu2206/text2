package basic.dev;

import java.util.Scanner;

public class MainApp1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Nhập giá trị n từ người dùng
        System.out.print("Nhap gia tri n: ");
        int n = scanner.nextInt();

        // Tính tổng S
        double tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += 1.0 / (i * i);
        }

        // Hiển thị kết quả
        System.out.println("Tong S la: " + tong);

        // Đóng Scanner
        scanner.close();
    }
}