package Java1.Lab5.Cau4;

import java.util.HashMap;
import java.util.Scanner;

public class MapStudent {
    public static void main(String[] args) {
        // Tạo HashMap để lưu danh sách sinh viên
        HashMap<String, String> students = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Thêm sinh viên vào danh sách
        students.put("PC08044", "Ly Chi Thanh");
        students.put("PC08122", "Nguyen Thanh Dat");
        students.put("PC08503", "Nguyen Nhat Tien");
        students.put("PC09014", "Nguyen Van Vi");

        // 1. Người dùng nhập mã số sinh viên để tìm tên
        System.out.print("Nhập mã số sinh viên cần tìm: ");
        String maSV = scanner.nextLine();
        if (students.containsKey(maSV)) {
            System.out.println("Tên sinh viên có mã " + maSV + " là: " + students.get(maSV));
        } else {
            System.out.println("Không tìm thấy sinh viên có mã " + maSV);
        }

        // 2. Người dùng nhập tên để tìm mã sinh viên
        System.out.print("Nhập tên sinh viên cần tìm mã số: ");
        String tenSV = scanner.nextLine();
        String maTimThay = null;
        for (String key : students.keySet()) {
            if (students.get(key).equalsIgnoreCase(tenSV)) { // Không phân biệt hoa thường
                maTimThay = key;
                break;
            }
        }
        if (maTimThay != null) {
            System.out.println("Mã số của sinh viên " + tenSV + " là: " + maTimThay);
        } else {
            System.out.println("Không tìm thấy sinh viên có tên " + tenSV);
        }

        // 3. Kiểm tra xem một sinh viên bất kỳ có trong danh sách không
        System.out.print("Nhập tên sinh viên cần kiểm tra: ");
        String tenCanTim = scanner.nextLine();
        boolean found = students.containsValue(tenCanTim);
        if (found) {
            System.out.println(tenCanTim + " có trong danh sách.");
        } else {
            System.out.println(tenCanTim + " không có trong danh sách.");
        }

        scanner.close();
    }
}
