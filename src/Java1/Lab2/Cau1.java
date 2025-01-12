package Java1.Lab2;
/*
Viết chương trình cho phép giải phương trình bậc nhất trong đó các hệ số a và b
nhập từ bàn phím
Name: Chau Nhat Duy
MSSV: PS44284
Date: 12/1/2025
*/

import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Nhập hệ số a
            System.out.print("Nhập giá trị của a: ");
            double a = scanner.nextDouble();

            // Nhập hệ số b
            System.out.print("Nhập giá trị của b: ");
            double b = scanner.nextDouble();

            // Kiểm tra các trường hợp của phương trình bậc nhất
            if (a == 0) {
                if (b == 0) {
                    System.out.println("Phương trình có vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                double x = -b / a; // Tính nghiệm x
                System.out.printf("Nghiệm của phương trình là: %.1f\n", x);
            }
        } catch (Exception e) {
            // Xử lý lỗi khi người dùng nhập sai kiểu dữ liệu
            System.out.println("Lỗi: Vui lòng nhập đúng định dạng số.");
        } finally {
            scanner.close(); // Đóng Scanner để giải phóng tài nguyên
        }
    }
}
