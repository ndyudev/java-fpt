package Java1.OnTap;

import java.util.Scanner;

public class Product {
    private int maSp;
    private float price;
    private String nameSp;

//    public Product() {
//    }
//
////    public Product(int maSp, String nameSp, float price) {
////        this.maSp = maSp;
////        this.nameSp = nameSp;
////        this.price = price;
////    }

    public void nhapInfoSanPham(Scanner sc) {
        System.out.print("Nhập mã sản phẩm: ");
        maSp = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhập tên sản phẩm: ");
        nameSp = sc.nextLine();

        System.out.print("Nhập giá sản phẩm: ");
        price = sc.nextFloat();
    }

    public void xuatDanhSachSanPham() {
        System.out.println("Mã sản phẩm: " + maSp);
        System.out.println("Tên sản phẩm: " + nameSp);
        System.out.println("Giá sản phẩm: " + price);
    }

    @Override
    public String toString() {
        return "Mã: " + maSp + ", Tên: " + nameSp + ", Giá: " + price;
    }
}
