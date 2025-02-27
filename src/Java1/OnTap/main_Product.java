package Java1.OnTap;

import java.util.ArrayList;
import java.util.Scanner;

public class main_Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> listProduct = new ArrayList<>();

        System.out.print("Nhập số lượng sản phẩm: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập sản phẩm thứ " + (i + 1) + ":");
            Product product = new Product();
            product.nhapInfoSanPham(sc);
            listProduct.add(product);
        }

        System.out.println("\nDanh sách sản phẩm:");
        for (Product temp : listProduct) {
            System.out.println(temp);
        }

        sc.close();
    }
}
