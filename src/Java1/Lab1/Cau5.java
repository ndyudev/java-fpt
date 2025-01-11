package Java1.Lab1;
/* Viết chương trình tính trung bình của 3 số nguyên (ép kiểu) */
import java.util.Scanner;

public class Cau5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao gia tri cho a: ");
        int a = scanner.nextInt();
        System.out.print("Nhap vao gia tri cho b: ");
        int b = scanner.nextInt();
        System.out.print("Nhap vao gia tri cho c: ");
        int c = scanner.nextInt();

        double trungBinh = (a + b + c) / 3.0;

        System.out.printf("Trung binh 3 so a, b, c: %.2f\n", trungBinh);

        scanner.close();
    }
}
