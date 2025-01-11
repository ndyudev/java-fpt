package Java1.Lab1;

/*1.
2.
3.
4.
5.
Viết chương trình nhập xuất ra màn hình thông tin của mỗi sinh viên theo mẫu sau:
Ho ten:
Ma so sinh vien:
Lop:
So dien thoai:
Gioi tinh:
*/

import java.util.Scanner;

public class Cau1LamThem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin
        System.out.print("Nhap vao ho ten sinh vien: ");
        String name = scanner.nextLine();

        System.out.print("Nhap vao nam sinh: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ ký tự xuống dòng còn sót

        System.out.print("Nhap vao mssv: ");
        String mssv = scanner.nextLine();

        System.out.print("Nhap vao lop: ");
        String lop = scanner.nextLine();

        System.out.print("Nhap vao sdt: ");
        String SoDienThoai = scanner.nextLine();

        System.out.print("Nhap vao gioi tinh: ");
        String gioitinh = scanner.nextLine();

        // Xuất thông tin
        System.out.println("\n========== THONG TIN SINH VIEN ==========");
        System.out.println("Ho ten: " + name);
        System.out.println("Nam sinh: " + age);
        System.out.println("Ma so sinh vien: " + mssv);
        System.out.println("Lop: " + lop);
        System.out.println("So dien thoai: " + SoDienThoai);
        System.out.println("Gioi tinh: " + gioitinh);

        scanner.close();
    }
}
