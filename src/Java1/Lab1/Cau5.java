package Java1.Lab1;
/* Viết chương trình tính trung bình của 3 số nguyên (ép kiểu)
 * -- Chau Nhat Duy
 * -- PS44284
 * -- 9/1/2025 */
import java.util.Scanner;

public class Cau5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập 3 số nguyên từ bàn phím
        System.out.print("Nhập vào giá trị cho a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập vào giá trị cho b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập vào giá trị cho c: ");
        int c = scanner.nextInt();

        // Tính trung bình cộng và ép kiểu thành số thực
        double trungBinh = (double) (a + b + c) / 3;

        // In kết quả ra màn hình
        System.out.printf("Trung bình cộng của 3 số a, b, c: %.2f\n", trungBinh);
        // Đóng đối tượng Scanner để giải phóng tài nguyên
        scanner.close();
    }
}
