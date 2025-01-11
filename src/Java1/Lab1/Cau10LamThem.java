package Java1.Lab1;

/*
Viết chương trình nhập vào 4 số nguyên a, b, c, d.
Tính giá trị trung bình cộng của 4 số trên và in kết quả ra màn hình.
Name : Chau Nhat Duy
MSSV: PS44284
Date : 11/1/2025
*/

import java.util.Scanner;

public class Cau10LamThem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Tạo đối tượng Scanner để nhập dữ liệu

        // Nhập 4 số nguyên
        System.out.print("Nhap so nguyen a: "); // Yêu cầu nhập số nguyên a
        int a = scanner.nextInt(); // Đọc số nguyên a

        System.out.print("Nhap so nguyen b: "); // Yêu cầu nhập số nguyên b
        int b = scanner.nextInt(); // Đọc số nguyên b

        System.out.print("Nhap so nguyen c: "); // Yêu cầu nhập số nguyên c
        int c = scanner.nextInt(); // Đọc số nguyên c

        System.out.print("Nhap so nguyen d: "); // Yêu cầu nhập số nguyên d
        int d = scanner.nextInt(); // Đọc số nguyên d

        // Tính trung bình cộng
        double trungBinhCong = (a + b + c + d) / 4.0; // Tính trung bình cộng của 4 số

        // Hiển thị kết quả
        System.out.println("\n========== KET QUA =========="); // In tiêu đề kết quả
        System.out.printf("Trung binh cong cua 4 so %d, %d, %d, %d la: %.2f\n", a, b, c, d, trungBinhCong); // In kết quả với định dạng

        scanner.close(); // Đóng đối tượng Scanner
    }
}