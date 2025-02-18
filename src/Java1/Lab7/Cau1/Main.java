package Java1.Lab7.Cau1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Nhập 2 hình chữ nhật
            System.out.print("Nhập chiều dài hình chữ nhật 1: ");
            double dai1 = scanner.nextDouble();
            System.out.print("Nhập chiều rộng hình chữ nhật 1: ");
            double rong1 = scanner.nextDouble();
            ChuNhat cn1 = new ChuNhat(dai1, rong1);

            // Nhập hình vuông
            System.out.print("Nhập cạnh của hình vuông: ");
            double canh = scanner.nextDouble();
            ChuNhat vu = new Vuong(canh); // Định nghĩa kiểu cha nhưng dùng lớp con

            // Xuất thông tin
            cn1.xuat();
            vu.xuat();

            scanner.close();
    }
}
