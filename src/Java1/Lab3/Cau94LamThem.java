package Java1.Lab3;

import java.util.Scanner;

/* Viết hàm đếm các phần tử là số nguyên tố trong mảng.
Name: Chau Nhat Duy
MSSV: PS44284
Date: 18/1/2025
 */
public class Cau94LamThem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bước 1: Nhập độ dài mảng
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = sc.nextInt();

        // Bước 2: Khởi tạo mảng và nhập giá trị
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Bước 3: Gọi hàm đếm số nguyên tố và in kết quả
        int count = countPrimeNumbers(arr);
        System.out.println("Số lượng số nguyên tố trong mảng là: " + count);
    }

    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false; // Số nhỏ hơn 2 không phải số nguyên tố
        }
        for (int i = 2; i <= Math.sqrt(number); i++) { // Chỉ cần kiểm tra đến căn bậc hai của số
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Hàm đếm số nguyên tố trong mảng
    public static int countPrimeNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }
}
