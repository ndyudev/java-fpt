package Java1.Lab8;

// Class XPoly - Thư viện tiện ích chứa các phương thức tĩnh
public final class XPoly {
    // Phương thức tính tổng các số (Bài 1)
    public static double sum(double... x) {
        double total = 0;
        for (double num : x) {
            total += num;
        }
        return total;
    }

    // Phương thức tìm số nhỏ nhất (Bài 2)
    public static double min(double... x) {
        if (x.length == 0) return 0; // Trường hợp mảng rỗng
        double minValue = x[0];
        for (double num : x) {
            if (num < minValue) {
                minValue = num;
            }
        }
        return minValue;
    }

    // Phương thức tìm số lớn nhất (Bài 2)
    public static double max(double... x) {
        if (x.length == 0) return 0; // Trường hợp mảng rỗng
        double maxValue = x[0];
        for (double num : x) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }

    // Phương thức chuyển ký tự đầu mỗi từ thành chữ hoa (Bài 3)
    public static String toUpperFirstChar(String s) {
        String[] words = s.split(" "); // Tách chuỗi thành mảng các từ
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) { // Kiểm tra từ không rỗng
                char firstChar = words[i].charAt(0);
                String upperFirstChar = String.valueOf(firstChar).toUpperCase();
                words[i] = upperFirstChar + words[i].substring(1);
            }
        }
        return String.join(" ", words); // Nối lại các từ
    }
}