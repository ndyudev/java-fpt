package Java1.Lab8;

public class Main {
    public static void main(String[] args) {
        // Test phương thức sum
        double sumResult = XPoly.sum(1.5, 2.5, 3.5, 4.5);
        System.out.println("Tong cac so: " + sumResult); // Kết quả: 12.0

        // Test phương thức min
        double minResult = XPoly.min(5.5, 2.3, 8.1, 1.2);
        System.out.println("So nho nhat: " + minResult); // Kết quả: 1.2

        // Test phương thức max
        double maxResult = XPoly.max(5.5, 2.3, 8.1, 1.2);
        System.out.println("So lon nhat: " + maxResult); // Kết quả: 8.1

        // Test phương thức toUpperFirstChar
        String text = "nguyen van teo";
        String result = XPoly.toUpperFirstChar(text);
        System.out.println("Chuoi sau khi chuyen doi: " + result);
        // Kết quả: "Nguyen Van Teo"
    }
}