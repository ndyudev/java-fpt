package Java1.Lab3;

/* Viết chương trình nhập một số nguyên từ bàn phím và cho biết số đó có phải là số
nguyên tố hay không (số nguyên tố là số chỉ chia hết cho 1 và chính nó).
Name : Chau Nhat Duy
MSSV: PS44284
Date: 14/1/2025
*/

import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập số nguyên bạn muốn kiểm tra: ");
            int n = scanner.nextInt();

            // Kiểm tra nếu số nhỏ hơn 2
            if (n < 2) {
                System.out.println("Đây không phải là số nguyên tố (số nguyên tố phải >= 2).");
            } else {
                boolean isPrime = true;

                // Kiểm tra số nguyên tố bằng cách xét ước số từ 2 đến √n
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        isPrime = false; // Nếu tìm thấy ước số, không phải số nguyên tố
                        break;
                    }
                }

                // In kết quả
                if (isPrime) {
                    System.out.println(n + " là số nguyên tố.");
                } else {
                    System.out.println(n + " không phải là số nguyên tố.");
                }
            }
        } catch (Exception e) {
            // Xử lý khi người dùng nhập không đúng kiểu dữ liệu
            System.out.println("Lỗi! Chỉ nhập số nguyên.");
        } finally {
            // Đóng Scanner và kết thúc chương trình
            System.out.println("Chương trình kết thúc!");
            scanner.close();
        }
    }
}
