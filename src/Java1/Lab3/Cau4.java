package Java1.Lab3;

import java.util.Scanner;

/*
Viết chương trình nhập 2 mảng họ tên và điểm của sinh viên.
✓ Xuất 2 mảng đã nhập, mỗi sinh viên có thêm học lực
  o Yếu: điểm < 5
  o Trung bình: 5 <= điểm < 6.5
  o Khá: 6.5 <= điểm < 7.5
  o Giỏi: 7.5 <= điểm < 9
  o Xuất sắc: điểm >= 9
✓ Sắp xếp danh sách sinh viên đã nhập tăng dần theo điểm
Name: Chau Nhat Duy
Date: 16/1/2025
MSSV: PS44284
*/
public class Cau4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng sinh viên
        System.out.print("Nhap so luong sinh vien: ");
        int n = scanner.nextInt();

        // Khai báo mảng lưu điểm và tên sinh viên
        Double[] diem = new Double[n];
        String[] name = new String[n];

        // Nhập thông tin sinh viên
        scanner.nextLine(); // Xóa bộ đệm sau khi nhập số
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap ten sinh vien thu %d: ", i + 1);
            name[i] = scanner.nextLine();

            System.out.printf("Nhap diem sinh vien thu %d: ", i + 1);
            diem[i] = scanner.nextDouble();
            scanner.nextLine(); // Xóa bộ đệm sau khi nhập điểm
        }

        // Sắp xếp danh sách sinh viên tăng dần theo điểm
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (diem[i] > diem[j]) {
                    // Đổi chỗ điểm
                    Double tempDiem = diem[i];
                    diem[i] = diem[j];
                    diem[j] = tempDiem;

                    // Đổi chỗ tên tương ứng
                    String tempName = name[i];
                    name[i] = name[j];
                    name[j] = tempName;
                }
            }
        }

        // Xuất thông tin sinh viên sau khi sắp xếp
        System.out.println("\nDanh sach sinh vien sau khi sap xep:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Ten: %s - Diem: %.2f - Hoc luc: ", name[i], diem[i]);

            // Xác định học lực
            if (diem[i] < 5) {
                System.out.println("Yeu");
            } else if (diem[i] < 6.5) {
                System.out.println("Trung Binh");
            } else if (diem[i] < 7.5) {
                System.out.println("Kha");
            } else if (diem[i] < 9) {
                System.out.println("Gioi");
            } else {
                System.out.println("Xuat Sac");
            }
        }

        scanner.close();
    }
}
