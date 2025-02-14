package Java1.Lab6;

import java.util.Scanner;

/**
 * Nhập họ và tên từ bàn phím. Xuất tên, họ và tên đệm ra màn hình trong đó tên và
 * họ xuất IN HOA.
 */
public class Cau1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Nhập họ và tên từ bàn phím
        System.out.print("Nhập họ và tên: ");
        String fullName = scanner.nextLine().trim();

        // Tìm vị trí khoảng trắng đầu tiên và cuối cùng
        int firstSpace = fullName.indexOf(" ");
        int lastSpace = fullName.lastIndexOf(" ");

        // Xử lý họ, tên đệm và tên
        String ho = fullName.substring(0, firstSpace).toUpperCase();
        String ten = fullName.substring(lastSpace + 1).toUpperCase();
        String tenDem = fullName.substring(firstSpace + 1, lastSpace);

        // Xuất kết quả
        System.out.println("Họ: " + ho);
        System.out.println("Tên đệm: " + tenDem);
        System.out.println("Tên: " + ten);

        scanner.close();
    }
}
