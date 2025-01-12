package Java1.Lab2;

/*
Viết chương trình nhập vào số điện sử dụng của tháng và tính tiền điện theo
phương pháp lũy tiến
Name : Chau Nhat Duy
MSSV: PS44284
Date: 12/1/2025
*/

import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Tạo đối tượng Scanner

        try {
            // Nhập số điện sử dụng
            System.out.print("Nhập số điện tháng này của bạn: ");
            double dien = scanner.nextDouble();

            // Kiểm tra nếu số điện âm
            if (dien < 0) {
                System.out.println("Số điện không thể là số âm. Vui lòng nhập lại!");
            } else {
                // Tính tiền điện theo phương pháp lũy tiến
                double tienDien;
                if (dien <= 50) {
                    tienDien = dien * 1000; // Giá 1.000 đồng/kWh cho 50 kWh đầu tiên
                } else {
                    tienDien = 50 * 1000 + (dien - 50) * 1200; // Giá 1.200 đồng/kWh cho kWh vượt mức 50
                }

                // In ra tiền điện
                System.out.printf("Giá tiền điện tháng này của bạn là: %.0f đồng\n", tienDien);
            }
        } catch (Exception e) {
            System.out.println("Lỗi: Nhập giá trị không hợp lệ! Vui lòng nhập số.");
        } finally {
            scanner.close(); // Đóng Scanner
        }
    }
}
