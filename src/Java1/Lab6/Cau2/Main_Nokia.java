package Java1.Lab6.Cau2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_Nokia {
    public static void main(String[] args) {
        ArrayList<Nokia> danhSach = new ArrayList<>(); // Danh sách chứa sản phẩm

        Scanner scanner = new Scanner(System.in);

        // Nhập 5 sản phẩm
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin sản phẩm thứ " + (i + 1) + ":");
            Nokia sp = new Nokia("", 0, "");
            sp.nhap(); // Gọi hàm nhập dữ liệu
            danhSach.add(sp);
        }

        // Xuất các sản phẩm có hãng "Nokia"
        System.out.println("\nDanh sách sản phẩm thuộc hãng Nokia:");
        for (Nokia sp : danhSach) {
            if (sp.hang.equalsIgnoreCase("Nokia")) {
                sp.xuat(); // Xuất thông tin sản phẩm Nokia
            }
        }
        scanner.close();
    }
}
