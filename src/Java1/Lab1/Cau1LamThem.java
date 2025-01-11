package Java1.Lab1;

/*
1. Nhập thông tin sinh viên từ người dùng.
2. Xuất thông tin sinh viên ra màn hình theo định dạng yêu cầu.
3. Thông tin bao gồm: Họ tên, Mã số sinh viên, Lớp, Số điện thoại, Giới tính.
Chau Nhat Duy
PS44284
Date : 11/1/2025
*/

import java.util.Scanner;

public class Cau1LamThem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Tạo đối tượng Scanner để nhập dữ liệu

        // Nhập thông tin
        System.out.print("Nhap vao ho ten sinh vien: "); // Yêu cầu nhập họ tên
        String name = scanner.nextLine(); // Đọc họ tên

        System.out.print("Nhap vao nam sinh: "); // Yêu cầu nhập năm sinh
        int age = scanner.nextInt(); // Đọc năm sinh
        scanner.nextLine(); // Đọc bỏ ký tự xuống dòng còn sót

        System.out.print("Nhap vao mssv: "); // Yêu cầu nhập mã số sinh viên
        String mssv = scanner.nextLine(); // Đọc mã số sinh viên

        System.out.print("Nhap vao lop: "); // Yêu cầu nhập lớp
        String lop = scanner.nextLine(); // Đọc lớp

        System.out.print("Nhap vao sdt: "); // Yêu cầu nhập số điện thoại
        String SoDienThoai = scanner.nextLine(); // Đọc số điện thoại

        System.out.print("Nhap vao gioi tinh: "); // Yêu cầu nhập giới tính
        String gioitinh = scanner.nextLine(); // Đọc giới tính

        // Xuất thông tin
        System.out.println("\n========== THONG TIN SINH VIEN =========="); // In tiêu đề
        System.out.println("Ho ten: " + name); // In họ tên
        System.out.println("Nam sinh: " + age); // In năm sinh
        System.out.println("Ma so sinh vien: " + mssv); // In mã số sinh viên
        System.out.println("Lop: " + lop); // In lớp
        System.out.println("So dien thoai: " + SoDienThoai); // In số điện thoại
        System.out.println("Gioi tinh: " + gioitinh); // In giới tính

        scanner.close(); // Đóng đối tượng Scanner
    }
}