package Java1.Lab7.Cau4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class QuanLySinhVien {
    private ArrayList<SinhVienPoly> danhSach = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // 1. Nhập danh sách sinh viên
    public void nhap() {
        while (true) {
            System.out.println("Chọn loại sinh viên: 1 - IT, 2 - Business, 0 - Thoát");
            int loai = scanner.nextInt();
            scanner.nextLine(); // Xóa buffer

            if (loai == 0) break;

            System.out.print("Họ tên: ");
            String hoTen = scanner.nextLine();

            if (loai == 1) { // Sinh viên IT
                System.out.print("Điểm Java: ");
                double java = scanner.nextDouble();
                System.out.print("Điểm HTML: ");
                double html = scanner.nextDouble();
                System.out.print("Điểm CSS: ");
                double css = scanner.nextDouble();
                scanner.nextLine();
                danhSach.add(new SinhVienIT(hoTen, java, html, css));
            } else if (loai == 2) { // Sinh viên Business
                System.out.print("Điểm Marketing: ");
                double marketing = scanner.nextDouble();
                System.out.print("Điểm Sales: ");
                double sales = scanner.nextDouble();
                scanner.nextLine();
                danhSach.add(new SinhVienBiz(hoTen, marketing, sales));
            }
        }
    }

    // 2. Xuất danh sách sinh viên
    public void xuat() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        System.out.println("\n===== DANH SÁCH SINH VIÊN =====");
        for (SinhVienPoly sv : danhSach) {
            sv.xuat();
        }
    }

    // 3. Xuất danh sách sinh viên có học lực giỏi
    public void xuatSinhVienGioi() {
        System.out.println("\n===== SINH VIÊN GIỎI =====");
        for (SinhVienPoly sv : danhSach) {
            if (sv.getHocLuc().equals("Giỏi") || sv.getHocLuc().equals("Xuất sắc")) {
                sv.xuat();
            }
        }
    }

    // 4. Sắp xếp danh sách theo điểm tăng dần
    public void sapXepTheoDiem() {
        Collections.sort(danhSach, Comparator.comparingDouble(SinhVienPoly::getDiem));
        System.out.println("\nĐã sắp xếp danh sách theo điểm!");
    }
}
