package Java1.Lab1;

/* Viết chương trình nhập các hệ số của phương trình bậc 2. Tính delta và xuất căn
delta ra màn hình.
-- Chau Nhat Duy
-- PS44284
-- 9/1/2025
*/

import java.util.Scanner;

public class Cau4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hệ số a, b, c
        System.out.print("Nhap gia tri cho a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhap gia tri cho b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhap gia tri cho c: ");
        double c = scanner.nextDouble();

        // Tính Delta
        double delta = Math.pow(b, 2) - 4 * a * c;

        // Kiểm tra Delta có âm không trước khi tính căn
        if (delta < 0) {
            System.out.println("Delta âm, không thể tính căn Delta.");
        } else {
            double candelta = Math.sqrt(delta);

            // Xuất kết quả
            System.out.printf("Delta: %.3f \nCan Delta: %.3f\n", delta, candelta);
        }

        // Đóng Scanner
        scanner.close();
    }
}
