package Java1.Lab2;
/* Viết chương trình cho phép giải phương trình bậc nhất trong đó các hệ số a và b
nhập từ bàn phím */

import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhap vao so nguyen (0-9): ");
            int so = scanner.nextInt(); // Người dùng nhập số nguyên

            // Kiểm tra số có nằm trong khoảng 0-9 hay không
            if (so < 0 || so > 9) {
                System.out.println("So nhap khong hop le! Vui long nhap so tu 0 den 9.");
            } else {
                // Đọc số
                String tenSo;
                switch (so) {
                    case 0: tenSo = "Không"; break;
                    case 1: tenSo = "Một"; break;
                    case 2: tenSo = "Hai"; break;
                    case 3: tenSo = "Ba"; break;
                    case 4: tenSo = "Bốn"; break;
                    case 5: tenSo = "Năm"; break;
                    case 6: tenSo = "Sáu"; break;
                    case 7: tenSo = "Bảy"; break;
                    case 8: tenSo = "Tám"; break;
                    case 9: tenSo = "Chín"; break;
                    default: tenSo = ""; // Trường hợp này không bao giờ xảy ra
                }
                System.out.printf("So %d duoc doc la: %s\n", so, tenSo);
            }
        } catch (Exception e) {
            // Bắt lỗi nếu người dùng nhập không phải số nguyên
            System.out.println("Du lieu nhap khong hop le! Vui long nhap so nguyen tu 0 den 9.");
        } finally {
            // Đóng scanner để giải phóng tài nguyên
            scanner.close();
        }
    }
}