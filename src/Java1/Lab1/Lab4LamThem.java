package Java1.Lab1;

/*
Viết chương trình nhập vào 2 số nguyên dương a và b,
cho biết kết quả chia lấy phần nguyên và phần dư của a với b.
*/

import java.util.Scanner;

public class Lab4LamThem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên dương a
        System.out.print("Nhap vao so nguyen duong a: ");
        int a = scanner.nextInt();
        while (a <= 0) {
            System.out.print("Vui long nhap so nguyen duong (a > 0): ");
            a = scanner.nextInt();
        }

        // Nhập số nguyên dương b
        System.out.print("Nhap vao so nguyen duong b: ");
        int b = scanner.nextInt();
        while (b <= 0) {
            System.out.print("Vui long nhap so nguyen duong (b > 0): ");
            b = scanner.nextInt();
        }

        // Tính toán phần nguyên và phần dư
        int phanNguyen = a / b;
        int phanDu = a % b;

        // Hiển thị kết quả
        System.out.println("\n========== KET QUA ==========");
        System.out.println("Phan nguyen cua a chia b: " + phanNguyen);
        System.out.println("Phan du cua a chia b: " + phanDu);

        scanner.close();
    }
}
