package Java1.Lab3;

/* Viết chương trình nhập mảng số nguyên từ bàn phím.
✓ Sắp xếp và xuất mảng vừa nhập ra màn hình.
✓ Xuất phần tử có giá trị nhỏ nhất ra màn hình
✓ Tính và xuất ra màn hình trung bình cộng các phần tử chia hết cho 3
Name : Chau Nhat Duy
MSSV: PS44284
Date: 14/1/2025
 */

import java.util.Arrays;
import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số phần tử của mảng
        System.out.print("Nhap so phan tu cho mang: ");
        int n = scanner.nextInt();

        int arr[] = new int[n];

        // Nhập các phần tử của mảng
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap phan tu cua mang tai [%d]: ", i);
            arr[i] = scanner.nextInt();
        }

        // Sắp xếp mảng tăng dần
        Arrays.sort(arr);
        System.out.println("Mang sau khi sap xep tang dan: " + Arrays.toString(arr));

        // Tìm phần tử nhỏ nhất
        int min = arr[0];
        System.out.println("Phan tu nho nhat trong mang: " + min);

        // Tính trung bình cộng các phần tử chia hết cho 3
        int sum = 0, count = 0;
        for (int num : arr) {
            if (num % 3 == 0) {
                sum += num;
                count++;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.printf("Trung binh cong cac phan tu chia het cho 3: %.2f%n", average);
        } else {
            System.out.println("Khong co phan tu nao chia het cho 3 trong mang.");
        }

        scanner.close();
    }
}
