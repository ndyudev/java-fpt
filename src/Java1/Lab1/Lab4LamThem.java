package Java1.Lab1;

/*
Viết chương trình nhập vào 2 số nguyên dương a và b,
cho biết kết quả chia lấy phần nguyên và phần dư của a với b.
Chau Nhat Duy
MSSV: PS44284
SD20305
Date: 11/1/2005
*/

import java.util.Scanner;

public class Lab4LamThem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Tạo đối tượng Scanner để nhập dữ liệu

        // Nhập số nguyên dương a
        System.out.print("Nhap vao so nguyen duong a: "); // Yêu cầu nhập số nguyên dương a
        int a = scanner.nextInt(); // Đọc số nguyên a
        // Kiểm tra nếu a không phải là số nguyên dương
        while (a <= 0) {
            System.out.print("Vui long nhap so nguyen duong (a > 0): "); // Yêu cầu nhập lại
            a = scanner.nextInt(); // Đọc lại số nguyên a
        }

        // Nhập số nguyên dương b
        System.out.print("Nhap vao so nguyen duong b: "); // Yêu cầu nhập số nguyên dương b
        int b = scanner.nextInt(); // Đọc số nguyên b
        // Kiểm tra nếu b không phải là số nguyên dương
        while (b <= 0) {
            System.out.print("Vui long nhap so nguyen duong (b > 0): "); // Yêu cầu nhập lại
            b = scanner.nextInt(); // Đọc lại số nguyên b
        }

        // Tính toán phần nguyên và phần dư
        int phanNguyen = a / b; // Tính phần nguyên của a chia b
        int phanDu = a % b; // Tính phần dư của a chia b

        // Hiển thị kết quả
        System.out.println("\n========== KET QUA =========="); // In tiêu đề kết quả
        System.out.println("Phan nguyen cua a chia b: " + phanNguyen); // In phần nguyên
        System.out.println("Phan du cua a chia b: " + phanDu); // In phần dư

        scanner.close(); // Đóng đối tượng Scanner
    }
}