package Java1.Lab5.Cau3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ManagerProduct {
    private ArrayList<Product> productList;
    private Scanner scanner;

    public ManagerProduct() {
        productList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // 1. Nhập danh sách sản phẩm
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

    // 2. Sắp xếp danh sách theo giá giảm dần
    public void sortProducts() {
        productList.sort(Comparator.comparingDouble(Product::getPrice).reversed());
        System.out.println("Danh sách sau khi sắp xếp giảm dần theo giá:");
        displayProducts();
    }

    // 3. Tìm và xóa sản phẩm theo tên
    public void deleteProductByName() {
        System.out.print("Nhập tên sản phẩm cần xóa: ");
        String nameToDelete = scanner.nextLine();
        boolean removed = productList.removeIf(product -> product.getName().equalsIgnoreCase(nameToDelete));

        if (removed) {
            System.out.println("Đã xóa sản phẩm: " + nameToDelete);
        } else {
            System.out.println("Không tìm thấy sản phẩm cần xóa.");
        }

        displayProducts();
    }

    // 4. Xuất giá trung bình của danh sách sản phẩm
    public void displayAveragePrice() {
        if (productList.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
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
            System.out.println("Danh sách sản phẩm trống.");
        } else {
            for (Product p : productList) {
                System.out.println(p);
            }
        }
    }

    // Menu lựa chọn
    public void menu() {
        int choice;
        do {
            System.out.println("\n----- MENU QUẢN LÝ SẢN PHẨM -----");
            System.out.println("1. Nhập danh sách sản phẩm");
            System.out.println("2. Sắp xếp giảm dần theo giá và xuất danh sách");
            System.out.println("3. Tìm và xóa sản phẩm theo tên");
            System.out.println("4. Xuất giá trung bình của các sản phẩm");
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
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập lại.");
            }
        } while (choice != 5);
    }

    public static void main(String[] args) {
        ManagerProduct manager = new ManagerProduct();
        manager.menu();
    }
}
