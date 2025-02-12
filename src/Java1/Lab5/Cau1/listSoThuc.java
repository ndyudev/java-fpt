package Java1.Lab5.Cau1;

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
public class listSoThuc {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập số thực cho list: ");
            double x = sc.nextDouble();
            list.add(x);
            sc.nextLine();
            System.out.print("Bạn muốn tiếp tục nhập không? Y/N: ");
            String response = sc.nextLine().trim();
            if (response.equalsIgnoreCase("N")) {
                System.out.println("Thoát chương trình");
                break;
            } else if (!response.equalsIgnoreCase("Y")) {
                System.out.println("Chỉ nhập Y hoặc N");
            }
        }

        double sum = 0;
        System.out.println("Các số đã nhập:");
        for (double temp : list) {
            System.out.println(temp);
            sum += temp;
        }

        System.out.println("Tổng: " + sum);
    }
}
