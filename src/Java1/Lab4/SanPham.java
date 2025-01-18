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

public class SanPham {
    public String nameProduct;
    public double price;
    public double giamGia;
    public double tax;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap ten san pham:");
        nameProduct = sc.nextLine();
        System.out.print("Nhap gia san pham:");
        price = sc.nextDouble();
        System.out.print("Nhap giam gia:");
        giamGia = sc.nextDouble();
        System.out.print("Nhap thue san pham");
        tax = sc.nextDouble();
    }

    public void ouput() {
        System.out.printf("Ten giam pham: %s\n", nameProduct);
        System.out.printf("Gia san pham: %.2f\n", price);
        System.out.printf("Giam gia: %.2f\n", giamGia);
        System.out.printf("Thue: %.2f\n", tax);
    }
}