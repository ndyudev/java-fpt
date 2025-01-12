package Java1.Lab2;

/*
Viết chương trình tổ chức 1 menu gồm 3 chức năng để gọi 3 bài trên và một chức
năng để thoát khỏi ứng dụng.
Name : Chau Nhat Duy
MSSV: PS44284
Date: 12/1/2025
*/

import java.util.Scanner;

public class MenuLab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n+------      MENU LAB 2      ------+");
            System.out.println("| 1. Giải phương trình bậc nhất    |");
            System.out.println("| 2. Giải phương trình bậc hai     |");
            System.out.println("| 3. Tính tiền điện                |");
            System.out.println("| 4. Kết thúc chương trình         |");
            System.out.println("+----------------------------------+");
            System.out.print("Nhập lựa chọn của bạn (1 - 4): ");

            int choice;
            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Lỗi: Vui lòng nhập số từ 1 đến 4.");
                scanner.nextLine(); // Clear buffer
                continue;
            }

            switch (choice) {
                case 1:
                    PTBacNhat(scanner);
                    break;
                case 2:
                    PTBacHai(scanner);
                    break;
                case 3:
                    tienDien(scanner);
                    break;
                case 4:
                    System.out.println("Chương trình kết thúc. Cảm ơn bạn đã sử dụng!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lỗi: Lựa chọn không hợp lệ. Vui lòng nhập số từ 1 đến 4.");
            }
        }
    }

    // Chức năng 1: Giải phương trình bậc nhất
    public static void PTBacNhat(Scanner scanner) {
        System.out.println("\n--- Giải phương trình bậc nhất ax + b = 0 ---");
        try {
            System.out.print("Nhập hệ số a: ");
            double a = scanner.nextDouble();
            System.out.print("Nhập hệ số b: ");
            double b = scanner.nextDouble();

            if (a == 0) {
                if (b == 0) {
                    System.out.println("Phương trình có vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                double x = -b / a;
                System.out.printf("Nghiệm của phương trình là: x = %.2f\n", x);
            }
        } catch (Exception e) {
            System.out.println("Lỗi: Nhập không hợp lệ. Vui lòng thử lại.");
            scanner.nextLine(); // Clear buffer
        }
    }

    // Chức năng 2: Giải phương trình bậc hai
    public static void PTBacHai(Scanner scanner) {
        System.out.println("\n--- Giải phương trình bậc hai ax^2 + bx + c = 0 ---");
        try {
            System.out.print("Nhập hệ số a: ");
            double a = scanner.nextDouble();
            System.out.print("Nhập hệ số b: ");
            double b = scanner.nextDouble();
            System.out.print("Nhập hệ số c: ");
            double c = scanner.nextDouble();

            if (a == 0) {
                System.out.println("Đây là phương trình bậc nhất.");
                PTBacNhat(scanner);
            } else {
                double delta = b * b - 4 * a * c;
                if (delta < 0) {
                    System.out.println("Phương trình vô nghiệm.");
                } else if (delta == 0) {
                    double x = -b / (2 * a);
                    System.out.printf("Phương trình có nghiệm kép: x = %.2f\n", x);
                } else {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.printf("Phương trình có hai nghiệm phân biệt: x1 = %.2f, x2 = %.2f\n", x1, x2);
                }
            }
        } catch (Exception e) {
            System.out.println("Lỗi: Nhập không hợp lệ. Vui lòng thử lại.");
            scanner.nextLine(); // Clear buffer
        }
    }

    // Chức năng 3: Tính tiền điện
    public static void tienDien(Scanner scanner) {
        System.out.println("\n--- Tính tiền điện ---");
        try {
            System.out.print("Nhập số điện tiêu thụ trong tháng: ");
            double dien = scanner.nextDouble();

            if (dien < 0) {
                System.out.println("Lỗi: Số điện không thể âm. Vui lòng thử lại.");
            } else {
                double tienDien;
                if (dien <= 50) {
                    tienDien = dien * 1000;
                } else {
                    tienDien = 50 * 1000 + (dien - 50) * 1200;
                }
                System.out.printf("Tiền điện tháng này là: %.0f đồng\n", tienDien);
            }
        } catch (Exception e) {
            System.out.println("Lỗi: Nhập không hợp lệ. Vui lòng thử lại.");
            scanner.nextLine(); // Clear buffer
        }
    }
}
