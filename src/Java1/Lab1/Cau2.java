package Java1.Lab1;

import java.util.Scanner;

/* Viết chương trình nhập từ bàn phím 2 cạnh của hình chữ nhật. Tính và xuất chu vi,
diện tích và cạnh nhỏ của hình chữ nhật. */

public class Cau2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu dai cua hinh chu nhat:");
        Double chieudai = scanner.nextDouble();
        System.out.print("Nhap chieu rong cua hinh chu nhat:");
        Double chieurong = scanner.nextDouble();
        Double chuvi = ( chieudai + chieurong ) * 2;
        Double dientich = chieudai * chieurong;
        System.out.printf("Chu vi HCN:\n" + chuvi);
        System.out.printf("\nDien tich HCN:\n" + dientich);
        scanner.close();
    }
}
