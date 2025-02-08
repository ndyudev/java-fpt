package Java1.Lab5;

import java.util.ArrayList;

public class Cau1 {
    public static void main(String[] args) {
        // Khởi tạo ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Thêm phần tử
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // Truy cập phần tử
        System.out.println("Phần tử đầu tiên: " + list.get(0));

        // Cập nhật phần tử
        list.set(1, "JavaScript");

        // Duyệt qua các phần tử
        System.out.println("Danh sách ban đầu:");
        for (String item : list) {
            System.out.println(item);
        }

        // Xóa phần tử
        list.remove("C++");

        // Kiểm tra kích thước
        System.out.println("Kích thước danh sách sau khi xóa: " + list.size());

        // Kiểm tra phần tử có tồn tại không
        if (list.contains("Java")) {
            System.out.println("Danh sách chứa 'Java'");
        }

        // Xóa toàn bộ phần tử
        list.clear();
        System.out.println("Danh sách sau khi xóa toàn bộ: " + list);
    }
}