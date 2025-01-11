package Java1.Lab1;
// Thư viện Scanner
import java.util.Scanner;

/* Viết chương trình cho phép nhập họ và tên sinh viên, điểm trung bình từ bàn
phím sau đó xuất ra màn hình với định dạng: <<họ và tên>> <<điểm>> điểm.
Chau Nhat Duy
Date : 6/1/2025
*/
public class Cau1 {
    public static void main(String[] args) {
        // Khai báo scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten cua ban:\n");
        // Khai báo String để lưu name
        String ten = scanner.nextLine();
        System.out.print("Nhap tuoi cua ban:\n");
        // Khai báo int để lưu tuổi
        int age = scanner.nextInt();
        // In ra tên và tuổi
        System.out.print("Ten cua sinh vien:\n" + ten);
        System.out.print("\nTuoi cua sinh vien:" + age);
    }
}
