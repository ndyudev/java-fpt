package Java1.Lab1;

/* Viết chương trình nhập từ bàn phím cạnh của một khối lập phương. Tính và xuất
thể tích của khối chữ nhật
-- Chau Nhat Duy
-- PS44284
-- 9/1/2025
 */
// THƯ VIỆN:
import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập cạnh của khối lập phương
        System.out.print("Nhập cạnh của khối lập phương: ");
        double edge = scanner.nextDouble();

        // Tính thể tích của khối lập phương
        double volume = Math.pow(edge, 3);

        // Xuất kết quả
        System.out.printf("Thể tích của khối lập phương là: %.2f\n", volume);

        // Đóng Scanner
        scanner.close();
    }
}
