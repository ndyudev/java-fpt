package Java1.BaoVeASM;

import java.util.Scanner;

public class NhanVien {
    private String maNv;
    private String hoVaTenNV;
    private int tuoi;
    private double ngayCong;
    private double ngayLuong;

    public void nhapThongTinNhanVien(Scanner sc) {
        System.out.println("Nhap ma nhan vien: ");
        maNv = sc.nextLine();
        System.out.println("Nhap ten nhan vien: ");
        hoVaTenNV = sc.nextLine();
        System.out.println("Nhap tuoi nhan vien: ");
        tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ngay cong:");
        ngayCong = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ngay luong");
        ngayLuong = sc.nextDouble();
        sc.nextLine();
    }

    public void xuatThongTinNhanVien() {
        System.out.println("Ma Nhan Vien: " + maNv );
        System.out.println("Ho va ten Nhan Vien: " + hoVaTenNV );
        System.out.println("Tuoi nhan vien: " + tuoi );
        System.out.println("Ngay Cong: " + ngayCong );
        System.out.println("Ngay Luong: " + ngayLuong );
    }

//    public double getThueThuNhap() {
//        if (ngayCong * ngayLuong > 20000000 ) {
//
//        }
//    }

    @Override
    public String toString() {
        return "Ma Nhan Vien:" + maNv + "\nTen Nhan Vien:" + hoVaTenNV + "\nTuoi:" + tuoi + "\nNgay Cong:" + ngayCong + "\nNgay Luong:" + ngayLuong;
    }
}
