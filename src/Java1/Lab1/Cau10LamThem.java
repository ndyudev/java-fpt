package Java1.Lab1;

/*
Viết chương trình nhập vào 4 số nguyên a, b, c, d.
Tính giá trị trung bình cộng của 4 số trên và in kết quả ra màn hình.
*/

import java.util.Scanner;

public class Cau10LamThem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập 4 số nguyên
        System.out.print("Nhap so nguyen a: ");
        int a = scanner.nextInt();

        System.out.print("Nhap so nguyen b: ");
        int b = scanner.nextInt();

        System.out.print("Nhap so nguyen c: ");
        int c = scanner.nextInt();

        System.out.print("Nhap so nguyen d: ");
        int d = scanner.nextInt();

        // Tính trung bình cộng
        double trungBinhCong = (a + b + c + d) / 4.0;

        // Hiển thị kết quả
        System.out.println("\n========== KET QUA ==========");
        System.out.printf("Trung binh cong cua 4 so %d, %d, %d, %d la: %.2f\n", a, b, c, d, trungBinhCong);

        scanner.close();
    }
}
