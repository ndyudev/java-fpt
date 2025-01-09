package Java1.Lab1;
import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap ten cua ban:\n");
        String ten = scanner.nextLine();
        System.out.printf("Nhap tuoi cua ban:\n");
        Double age = scanner.nextDouble();
        System.out.printf("Ten cua sinh vien:\n" + ten);
        System.out.print("\nTuoi cua sinh vien:" + age);
    }
}
