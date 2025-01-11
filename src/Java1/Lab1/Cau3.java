package Java1.Lab1;

/* Viết chương trình nhập từ bàn phím cạnh của một khối lập phương. Tính và xuất
thể tích của khối lập phương
-- Chau Nhat Duy
-- PS44284
-- 9/1/2025
 */
// THƯ VIỆN:
import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {
        // Tạo một đối tượng Scanner để đọc dữ liệu nhập vào từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều dài, chiều rộng và chiều cao của khối chữ nhật
        System.out.print("Nhập chiều dài của khối chữ nhật: ");
        double chieuDai = scanner.nextDouble(); // Đọc giá trị chiều dài từ bàn phím

        System.out.print("Nhập chiều rộng của khối chữ nhật: ");
        double chieuRong = scanner.nextDouble(); // Đọc giá trị chiều rộng từ bàn phím

        System.out.print("Nhập chiều cao của khối chữ nhật: ");
        double chieuCao = scanner.nextDouble(); // Đọc giá trị chiều cao từ bàn phím

        // Tính thể tích của khối chữ nhật bằng cách nhân 3 kích thước
        double theTich = chieuDai * chieuRong * chieuCao;

        // In kết quả ra màn hình, làm tròn đến 2 chữ số thập phân
        System.out.printf("Thể tích của khối chữ nhật là: %.2f đơn vị khối lượng\n", theTich);

        // Đóng đối tượng Scanner để giải phóng tài nguyên
        scanner.close();
    }
}