package Java1.OnTap.De2;

import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Nhap gia tri tai [%d]: ", i);
            arr[i] = sc.nextInt();
        }

        tinhChanLe(arr);
        kiemTraSoNguyenTo(arr);
    }

    public static void tinhChanLe(int[] arr) {
        int tongChan = 0;
        int tongLe = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 == 0) {
                tongChan += arr[i];
            } else {
                tongLe += arr[i];
            }
        }
        System.out.println("Tong cac gia tri chan trong mang la: " + tongChan);
        System.out.println("Tong cac gia tri le trong mang la: " + tongLe);
    }

    public static void kiemTraSoNguyenTo(int[] arr) {
        System.out.print("Cac so nguyen to trong mang: ");
        for (int i = 0; i < 10; i++) {
            if (isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
