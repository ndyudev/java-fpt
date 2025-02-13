package Java1.Lab5.Cau3;

import Java1.Lab5.Cau3.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ManagerProduct {
    private ArrayList<Product> productList;
    private Scanner scanner;

    public ManagerProduct() {
        productList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // Nhập danh sách sản phẩm
    public void inputProducts() {
        System.out.print("Nhập số lượng sản phẩm: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập tên sản phẩm thứ " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Nhập giá của sản phẩm: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            productList.add(new Product(name, price));
        }
    }

    // Sắp xếp danh sách theo giá giảm dần
    public void sortProducts() {
        Collections.sort(productList, (p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()));
        System.out.println("Danh sách sau khi sắp xếp:");
        displayProducts();
    }

    // Xóa sản phẩm theo tên
    public void deleteProductByName() {
        System.out.print("Nhập tên sản phẩm cần xóa: ");
        String nameToDelete = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().equalsIgnoreCase(nameToDelete)) {
                productList.remove(i);
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Đã xóa sản phẩm " + nameToDelete);
        } else {
            System.out.println("Không tìm thấy sản phẩm cần xóa.");
        }
        displayProducts();
    }

    // Xuất giá trung bình của danh sách sản phẩm
    public void displayAveragePrice() {
        if (productList.isEmpty()) {
            System.out.println("Danh sách trống.");
            return;
        }

        double total = 0;
        for (Product p : productList) {
            total += p.getPrice();
        }

        double average = total / productList.size();
        System.out.println("Giá trung bình của các sản phẩm: " + average);
    }

    // Hiển thị danh sách sản phẩm
    public void displayProducts() {
        if (productList.isEmpty()) {
            System.out.println("Danh sách trống.");
        } else {
            for (Product p : productList) {
                p.display();
            }
        }
    }

    // Chạy chương trình
    public void run() {
        int choice;
        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Nhập sản phẩm");
            System.out.println("2. Sắp xếp giảm dần theo giá");
            System.out.println("3. Xóa sản phẩm theo tên");
            System.out.println("4. Tính giá trung bình");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    inputProducts();
                    break;
                case 2:
                    sortProducts();
                    break;
                case 3:
                    deleteProductByName();
                    break;
                case 4:
                    displayAveragePrice();
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 5);
    }

    public static void main(String[] args) {
        ManagerProduct manager = new ManagerProduct();
        manager.run();
    }
}
