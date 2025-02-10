package Java1.Lab5;

import java.util.ArrayList;
import java.util.Scanner;

/* Bài 1 (2 điểm)
Nhập danh sách số thực với số lượng tùy ý từ bàn phím sau đó xuất danh sách vừa
nhập và tổng của nó.
HƯỚNG DẪN:
✓ Sử dụng ArrayList<Double> để duy trì danh sách số thực được nhập từ bàn
phím
✓ Sử dụng vòng lặp while để nhập số lượng tùy ý while(true){
Double x = scanner.nextDouble();
list.add(x);
System.out.print(“Nhập thêm (Y/N)? ”);
if(scanner.nextLine().equals(“N”)){
break;
}
}
✓ Sử dụng vòng lặp for-each để duyệt và xuất các phần tử của list ra màn hình
Name: Chau Nhat Duy
MSSV: Ps44284
Date: 7/2/2025
 */
public class Cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();

        while (true) {
            System.out.print("Nhập số thực: ");
            if (sc.hasNextDouble()) {
                double num = sc.nextDouble();
                list.add(num);
            } else {
                System.out.println("Lỗi: Bạn phải nhập số thực!");
                sc.next();
                continue;
            }

            System.out.print("Nhập thêm (Y/N)? ");
            sc.nextLine();
            String choice = sc.nextLine().trim().toUpperCase();
            if (choice.equals("N")) {
                break;
            }
        }

        // Xuất danh sách số thực
        System.out.println("Danh sách số thực đã nhập:");
        double sum = 0;
        for (double num : list) {
            System.out.print(num + " ");
            sum += num;
        }

        // In tổng các số thực
        System.out.println("\nTổng các số thực: " + sum);
        sc.close();
    }
}