package Java1.OnTap;

import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cho mang: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Gia tri tai [%d]: " , i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Nhap gia tri so nguyen cai tim: ");
        int find = sc.nextInt();
        boolean kiemTra = false;
        for (int i = 0; i < n; i++) {
            if (find == arr[i]) {
                System.out.printf("%d nằm tại vị trí [%d]\n", find, i);
                kiemTra = true;
            }
        }
        if (kiemTra == false) {
            System.out.println("Gia tri can tim khong co trong mang!");
        }
    }
}
