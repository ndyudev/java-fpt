package Java1.Lab3;

/* Viết chương trình xuất ra màn hình bảng cửu chương
*  Name: Chau Nhat Duy
* Date: 14/1/2025
* MSSV: PS44284
*  */

import java.util.Scanner;

public class Cau2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhap so nguyen de in bang cuu chuong:");
            int n = scanner.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d\n", n , i , n * i);
            }
        } catch ( Exception e) {
            System.out.print("Loi! Chi Duoc Nhap So Nguyen");
        } finally {
            scanner.close();
        }
    }
}
