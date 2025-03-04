package Java1.BaoVeASM;

import java.util.ArrayList;
import java.util.Scanner;

public class main_NhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> listNhanVien = new ArrayList<>();

        System.out.println("Nhap so luong nhan vien: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap nhan vien thu " + (i + 1) + ":");
            NhanVien nhanvien = new NhanVien();
            nhanvien.nhapThongTinNhanVien(sc);
            listNhanVien.add(nhanvien);
        }
        System.out.println("Danh Sach Nhan Vien:");
        for (NhanVien temp : listNhanVien) {
            System.out.println(temp);
        }
    }

//    public static int menu() {
//        boolean kiemTra = false;
//        int choice = -1;
//        do {
//            System.out.println("N");
//        } while (false);
//        return choice;
//    }
}
