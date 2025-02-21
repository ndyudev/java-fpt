package Java1.Lab7.Cau3;

import java.util.Scanner;

public class main_SinhVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin SinhVienIT
        System.out.println("Nhập thông tin Sinh viên IT:");
        System.out.print("Họ tên: ");
        String tenIT = scanner.nextLine();
        System.out.print("Điểm Java: ");
        double java = scanner.nextDouble();
        System.out.print("Điểm HTML: ");
        double html = scanner.nextDouble();
        System.out.print("Điểm CSS: ");
        double css = scanner.nextDouble();
        scanner.nextLine(); // Clear buffer
        SinhVienIT svIT = new SinhVienIT(tenIT, java, html, css);

        // Nhập thông tin SinhVienBiz
        System.out.println("\nNhập thông tin Sinh viên Biz:");
        System.out.print("Họ tên: ");
        String tenBiz = scanner.nextLine();
        System.out.print("Điểm Marketing: ");
        double marketing = scanner.nextDouble();
        System.out.print("Điểm Sales: ");
        double sales = scanner.nextDouble();
        SinhVienBiz svBiz = new SinhVienBiz(tenBiz, marketing, sales);

        // Xuất thông tin sinh viên
        System.out.println("\n===== Thông tin Sinh Viên =====");
        svIT.xuat();
        svBiz.xuat();

        scanner.close();
    }
}
