package Java1.Lab5;

import java.util.ArrayList;
import java.util.Scanner;

/* Viết chương trình thực hiện các chức năng sau
1. Nhập danh sách họ và tên
2. Xuất danh sách vừa nhập
3. Xuất danh sách ngẫu nhiên
4. Sắp xếp giảm dần và xuất danh sách
5. Tìm và xóa họ tên nhập từ bàn phím
6. Kết thúc
Name: Chau Nhat Duy
MSSV: PS44284
Date: 11/2/2025
 */
public class Cau2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        while (true) {
            System.out.print("Nhap so thuc:");
            if (scanner.hasNextDouble()) {
                double num = scanner.nextDouble();
                list.add(num);
                scanner.next();
            } else {
                System.out.print("Khong duoc nhap so thuc");
                scanner.next();
                continue;
            }

            System.out.print("Ban muon nhap tiep? ( Y/N )");
            if (scanner.nextLine().equals("N")) {
                break;
            }
        }
    }
}
