package Java1.Lab2;
/*
Viết chương trình cho phép giải phương trình bậc hai trong đó các hệ số a, b và c
nhập từ bàn phím
Name: Chau Nhat Duy
MSSV: PS44284
Date: 12/1/2025
*/

import java.util.Scanner;

public class Cau2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Tạo Scanner

        try {
            // Nhập hệ số a, b, c
            System.out.print("Nhập giá trị của a: ");
            double a = scanner.nextDouble();

            System.out.print("Nhập giá trị của b: ");
            double b = scanner.nextDouble();

            System.out.print("Nhập giá trị của c: ");
            double c = scanner.nextDouble();

            // Kiểm tra trường hợp a == 0 (Phương trình bậc nhất)
            if (a == 0) {
                if (b == 0) {
                    if (c == 0) {
                        System.out.println("Phương trình có vô số nghiệm.");
                    } else {
                        System.out.println("Phương trình vô nghiệm.");
                    }
                } else {
                    double x = -c / b; // Tính nghiệm x
                    System.out.printf("Phương trình bậc nhất, nghiệm là: x = %.2f\n", x);
                }
            } else {
                // Phương trình bậc 2: ax^2 + bx + c = 0
                double delta = Math.pow(b, 2) - 4 * a * c; // Tính delta

                if (delta < 0) {
                    System.out.println("Phương trình vô nghiệm.");
                } else if (delta == 0) {
                    double x = -b / (2 * a); // Nghiệm kép
                    System.out.printf("Phương trình có nghiệm kép: x = %.2f\n", x);
                } else {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a); // Nghiệm x1
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a); // Nghiệm x2
                    System.out.printf("Phương trình có hai nghiệm phân biệt:\n");
                    System.out.printf("x1 = %.2f\n", x1);
                    System.out.printf("x2 = %.2f\n", x2);
                }
            }
        } catch (Exception e) {
            System.out.println("Lỗi: Vui lòng nhập đúng định dạng số.");
        } finally {
            scanner.close(); // Đóng Scanner để giải phóng tài nguyên
        }
    }
}
