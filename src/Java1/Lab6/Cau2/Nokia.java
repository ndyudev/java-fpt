package Java1.Lab6.Cau2;

import java.util.Scanner;

public class Nokia {
    public String tenSp;
    public double donGia;
    public String hang;

    // Constructor
    public Nokia(String tenSp, double donGia, String hang) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.hang = hang;
    }

    // Hàm nhập dữ liệu từ bàn phím
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        this.tenSp = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        this.donGia = scanner.nextDouble();
        scanner.nextLine(); // Đọc dòng trống
        System.out.print("Nhập hãng sản phẩm: ");
        this.hang = scanner.nextLine();
    }

    // Hàm xuất dữ liệu
    public void xuat() {
        System.out.println("Tên: " + tenSp + " | Giá: " + donGia + " | Hãng: " + hang);
    }
}