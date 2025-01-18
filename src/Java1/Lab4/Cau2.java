package Java1.Lab4;

import java.util.Scanner;

/* Viết chương trình tạo ra 2 sản phẩm thông tin được nhập từ bàn phím sau đó gọi
phương thức xuất để xuất thông tin 2 đối tượng sản phẩm đã tạo
HƯỚNG DẪN:
MOB1014 – LẬP TRÌNH JAVA 1
TRANG 1
LAB4: LỚP VÀ ĐỐI TƯỢNG
✓ Tạo lớp chứa phương thức main()
✓ Trong phương thức main() tạo 2 đối tượng sp1 và sp2 từ lớp sản phẩm
✓ Gọi phương thức nhap() của 2 đối tượng sp1 và sp2 để nhập dữ liệu từ bàn
phím
✓ Gọi phương thức xuat() của 2 đối tượng sp1 và sp2 để xuất thông tin của
mỗi đối tượng ra màn hình
Name : Chau Nhat Duy
MSSV: PS44284
Date: 17/1/2025
 */
public class Cau2 {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();
        sp1.input();
        sp1.ouput();
        sp2.input();
        sp1.ouput();
    }
}