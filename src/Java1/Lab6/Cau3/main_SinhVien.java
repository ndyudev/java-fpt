package Java1.Lab6.Cau3;

import java.util.ArrayList;
import java.util.Scanner;

public class main_SinhVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SinhVien> danhSach = new ArrayList<>();

        // Nhập danh sách sinh viên
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");

            System.out.print("Nhập họ tên: ");
            String hoTen = scanner.nextLine();

            String email;
            do {
                System.out.print("Nhập email: ");
                email = scanner.nextLine();
                if (!SinhVien.kiemTraEmail(email)) {
                    System.out.println("❌ Email không hợp lệ. Vui lòng nhập lại!");
                }
            } while (!SinhVien.kiemTraEmail(email));

            String soDienThoai;
            do {
                System.out.print("Nhập số điện thoại: ");
                soDienThoai = scanner.nextLine();
                if (!SinhVien.kiemTraSoDienThoai(soDienThoai)) {
                    System.out.println("❌ Số điện thoại không hợp lệ. Vui lòng nhập lại!");
                }
            } while (!SinhVien.kiemTraSoDienThoai(soDienThoai));

            String cmnd;
            while (true) {
                try {
                    System.out.print("Nhập CMND: ");
                    cmnd = scanner.nextLine();

                    // Kiểm tra xem CMND có hợp lệ không
                    if (!SinhVien.kiemTraCMND(cmnd)) {
                        throw new IllegalArgumentException("❌ CMND phải có từ 9 đến 12 chữ số!");
                    }
                    break; // Nếu hợp lệ thì thoát vòng lặp
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            // Thêm sinh viên vào danh sách
            SinhVien sv = new SinhVien(hoTen, email, soDienThoai, cmnd);
            danhSach.add(sv);
        }

        // Xuất danh sách sinh viên
        System.out.println("\n===== DANH SÁCH SINH VIÊN =====");
        for (SinhVien sv : danhSach) {
            sv.hienThiThongTin();
        }
    }
}