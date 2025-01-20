package Java1.Lab3;

import java.util.Scanner;

/* Viết hàm tìm số chẵn cuối cùng có trong mảng, nếu không tồn tại số chẵn hàm trả
về -1 .
Name: Chau Nhat Duy
MSSV: PS44284
Date: 18/1/2025
 */
public class Cau85LamThem {
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

        // Bước 3: Gọi hàm tìm số chẵn cuối cùng và in kết quả
        int result = findLastEvenNumber(arr);
        if (result == -1) {
            System.out.println("Không có số chẵn nào trong mảng.");
        } else {
            System.out.println("Số chẵn cuối cùng trong mảng là: " + result);
        }
    }

    // Hàm tìm số chẵn cuối cùng trong mảng
    public static int findLastEvenNumber(int[] arr) {
        // Duyệt ngược mảng để tìm số chẵn đầu tiên
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                return arr[i];
            }
        }
        return -1; // Không tìm thấy số chẵn
    }
}
