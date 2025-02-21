package Java1.Lab7.Cau4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLySinhVien qlsv = new QuanLySinhVien();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU QUẢN LÝ SINH VIÊN =====");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Xuất danh sách sinh viên");
            System.out.println("3. Xuất sinh viên có học lực giỏi");
            System.out.println("4. Sắp xếp danh sách theo điểm");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            int chon = scanner.nextInt();
            scanner.nextLine(); // Xóa buffer

            switch (chon) {
                case 1:
                    qlsv.nhap();
                    break;
                case 2:
                    qlsv.xuat();
                    break;
                case 3:
                    qlsv.xuatSinhVienGioi();
                    break;
                case 4:
                    qlsv.sapXepTheoDiem();
                    qlsv.xuat();
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Chọn sai! Vui lòng chọn lại.");
            }
        }
    }
}
