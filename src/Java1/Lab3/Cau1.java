package Java1.Lab3;

import java.util.Scanner;

/*
Viết chương trình nhập một số nguyên từ bàn phím và cho biết số đó có phải là số
nguyên tố hay không (số nguyên tố là số chỉ chia hết cho 1 và chính nó).
Name : Chau Nhat Duy
MSSV: PS44284
Date: 14/1/2025
*/
public class Cau1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Kiểm tra đầu vào có phải là số nguyên không.
        try {
            System.out.print("Nhập số nguyên bạn muốn kiểm tra: ");
            int n = scanner.nextInt();
            // Số nguyên tố thì bé hơn 2
            if (n < 2) {
                System.out.println(n + " không phải là số nguyên tố.");
            } else {
                boolean isPrime = true;
                for (int i = 2; i <= n / 2; i++) {
                    // Kiểm tra từ 2 đến n/2
                    if (n % i == 0) {
                        isPrime = false;
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
            System.out.println("Lỗi! Vui lòng chỉ nhập số nguyên.");
        } finally {
            System.out.println("Chương trình kết thúc!");
            scanner.close();
        }
    }
}
