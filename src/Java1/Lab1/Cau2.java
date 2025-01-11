package Java1.Lab1;

import java.util.Scanner;

/* Viết chương trình nhập từ bàn phím 2 cạnh của hình chữ nhật. Tính và xuất chu vi,
diện tích và cạnh nhỏ của hình chữ nhật.
 Chau Nhat Duy
 MSSV : PS44284
 Date: 6/1/2025
 */

public class Cau2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều dài và chiều rộng từ bàn phím
        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        double chieuDai = scanner.nextDouble(); //Sử dụng kiểu double để lưu số thực

        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        double chieuRong = scanner.nextDouble();

        // Tính chu vi hình chữ nhật
        double chuVi = 2 * (chieuDai + chieuRong);

        // Tính diện tích hình chữ nhật
        double dienTich = chieuDai * chieuRong;

        // Tìm cạnh nhỏ (giả sử chiều rộng luôn nhỏ hơn hoặc bằng chiều dài)
        double canhNho = Math.min(chieuDai, chieuRong);

        // In kết quả ra màn hình
        System.out.println("Chu vi hình chữ nhật: " + chuVi);
        System.out.println("Diện tích hình chữ nhật: " + dienTich);
        System.out.println("Cạnh nhỏ nhất của hình chữ nhật: " + canhNho);

        scanner.close(); // Đóng scanner để giải phóng tài nguyên
    }
}