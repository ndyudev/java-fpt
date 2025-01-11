package Java1.Lab1;

import java.util.Scanner;

/*
 * Viết chương trình nhập các hệ số của phương trình bậc 2. Tính delta và xuất căn delta ra màn hình.
 * -- Chau Nhat Duy
 * -- PS44284
 * -- 9/1/2025
 */

public class Cau4 {
    public static void main(String[] args) {
        // Tạo một đối tượng Scanner để đọc dữ liệu nhập vào từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập các hệ số a, b, c của phương trình bậc hai
        System.out.print("Nhập giá trị cho a: ");
        double a = scanner.nextDouble(); // Nhập hệ số a

        System.out.print("Nhập giá trị cho b: ");
        double b = scanner.nextDouble(); // Nhập hệ số b

        System.out.print("Nhập giá trị cho c: ");
        double c = scanner.nextDouble(); // Nhập hệ số c

        // Tính delta theo công thức: Δ = b^2 - 4ac
        double delta = Math.pow(b, 2) - 4 * a * c;

        // Kiểm tra xem delta có âm hay không
        if (delta < 0) {
            // Nếu delta âm thì phương trình vô nghiệm
            System.out.println("Delta âm, phương trình vô nghiệm.");
        } else {
            // Nếu delta không âm, tính căn bậc hai của delta
            double canDelta = Math.sqrt(delta);

            // In kết quả ra màn hình, làm tròn đến 3 chữ số thập phân
            System.out.printf("Delta: %.3f\n", delta);
            System.out.printf("Căn bậc hai của delta: %.3f\n", canDelta);
        }

        // Đóng đối tượng Scanner để giải phóng tài nguyên
        scanner.close();
    }
}