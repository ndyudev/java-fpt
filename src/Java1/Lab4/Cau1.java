package Java1.Lab4;

import java.util.Scanner;

/*
Tạo lớp SanPham gồm 3 thuộc tính là tên, giá và giảm giá.
Lớp cũng gồm 2 phương thức là tính thuế nhập khẩu (10% giá sản phẩm)
và xuất thông tin ra màn hình.
Thông tin xuất ra màn hình gồm:
✓ Tên sản phẩm:
✓ Đơn giá:
✓ Giảm giá:
✓ Thuế nhập khẩu:
Name: Chau Nhat Duy
MSSV: PS44284
Date: 17/1/2025
 */

public class Cau1 {

    // Lớp SanPham
    public static class SanPham {
        // Thuộc tính
        private String nameProd;
        private double price;
        private double giamGia;

        // Constructor: Dùng để khởi tạo đối tượng
        public SanPham(String nameProd, double price, double giamGia) {
            this.nameProd = nameProd;
            this.price = price;
            this.giamGia = giamGia;
        }

        // Phương thức tính thuế nhập khẩu (10% giá sản phẩm)
        public double tinhThueNhapKhau() {
            return price * 0.1;
        }

        // Phương thức xuất thông tin sản phẩm
        public void xuatThongTin() {
            System.out.println("Tên sản phẩm: " + nameProd);
            System.out.println("Đơn giá: " + price);
            System.out.println("Giảm giá: " + giamGia);
            System.out.println("Thuế nhập khẩu: " + tinhThueNhapKhau());
        }
    }

    // Phương thức chính
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin sản phẩm từ người dùng
        System.out.print("Nhập tên sản phẩm: ");
        String nameProd = scanner.nextLine();

        System.out.print("Nhập giá sản phẩm: ");
        double price = scanner.nextDouble();

        System.out.print("Nhập mức giảm giá: ");
        double giamGia = scanner.nextDouble();

        // Tạo đối tượng SanPham
        SanPham sp = new SanPham(nameProd, price, giamGia);

        // Xuất thông tin sản phẩm
        System.out.println("\n--- Thông tin sản phẩm ---");
        sp.xuatThongTin();
    }
}
