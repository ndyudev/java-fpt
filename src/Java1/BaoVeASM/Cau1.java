package Java1.BaoVeASM;

import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang:");
        int n = sc.nextInt();
        int m = 2;
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap gia tri phan tử tại [%d]: ", i);
            arr[i] = sc.nextInt();
        }
        xuatMang(n, arr);
        kiemTraChiaHet(m, n, arr);
    }

    public static void xuatMang(int n , int arr[]){
        for (int i = 0; i < n; i++) {
            System.out.printf("Gia tri phan tử tại [%d]: %d\n", i , arr[i] );
        }
    }

    public static void kiemTraChiaHet(int m, int n, int arr[]) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % m == 0) {
                System.out.printf("%d chia het %d\n", arr[i] , m);
                sum += arr[i];
            }
        }
        System.out.println("Tong cac phan tu chia het cho m la:" + sum);
    }
}
