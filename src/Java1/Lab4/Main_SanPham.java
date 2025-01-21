package Java1.Lab4;

/* PHẦN I
Bài 1 (2 điểm)
Tạo lớp SanPham gồm 3 thuộc tính là tên, giá và giảm giá. Lớp cũng gồm 2
phương thức là tính thuế nhập khẩu (10% giá sản phẩm) và xuất thông tin ra màn
hình. Thông tin xuất ra màn hình gồm:
✓ Tên sản phẩm:
✓ Đơn giá:
✓ Giảm giá:
✓ Thuế nhập khẩu:
HƯỚNG DẪN:
✓ Khai báo lớp theo mô hình sau
SanPham
+tenSp: String
+donGia: double
+giamGia: double
+getThueNhapKhau(): double
+xuat(): void
+nhap():void
Bài 2 (2 điểm)
Viết chương trình tạo ra 2 sản phẩm thông tin được nhập từ bàn phím sau đó gọi
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
PHẦN II
Bài 3 (2 điểm)
Nâng cấp lớp SanPham bằng cách bổ sung public cho các đặt tả truy xuất cho
phương thức xuat() và private cho getThueThuNhap(). Đồng thời bổ sung 2 hàm
tạo, hàm tạo thứ nhất gồm 3 tham số là tên, giá và giảm giá, hàm tạo thứ 2 gồm 2
tham số là tên và giá (ngầm hiểu không giảm giá).
Viết chương trình tạo 2 sản phẩm có giảm giá và không giảm giá sau đó xuất
thông tin 2 sản phẩm ra màn hình
HƯỚNG DẪN:
✓ Bổ sung 2 hàm tạo
public SanPham(String tenSp, double donGia, double giamGia){
this.tenSp = tenSp;
…
}
public SanPham(String tenSp, double donGia){
this(tenSp, donGia, 0)
}
✓ Sử dụng hàm tạo để tạo sản phẩm
SanPham sp1 = new SanPham(tenSp, donGia)
Bài 4 (2 điểm)
Nâng cấp lớp SanPham bằng cách khai báo các trường dữ liệu với đặc tả truy xuất
là private để hạn chế truy xuất trực tiếp đến các trường này sau đó bổ sung các
phương thức getter và setter để đọc ghi dữ liệu các trường.
MOB1014 – LẬP TRÌNH JAVA 1
TRANG 2
LAB4: LỚP VÀ ĐỐI TƯỢNG
HƯỚNG DẪN:
✓ Cứ mỗi trường dữ liệu được khai private bạn cần định nghĩa một cập
phương thức getter/setter để cho phép đọc ghi dữ liệu thông qua các
phương thức này. Với cách làm này bạn dễ dàng nâng cấp lớp để bảo vệ
hoặc thực hiện các tính toán cần thiết trước khi thức hiện các thao tác đọc
ghi dữ liệu
public String getTenSp(){
return this.tenSp;
}
public void setTenSp(String tenSp){
this.tenSp = tenSp;
}
Name: Chau Nhat Duy
MSSV: PS44284
Date: 21/1/2025
 */
public class Main_SanPham {
    public static void main(String[] args) {
        // Tạo sản phẩm và thiết lập dữ liệu bằng setter
        SanPham sp1 = new SanPham();
        sp1.setTenSp("Laptop");
        sp1.setDonGia(15000);
        sp1.setGiamGia(2000);

        SanPham sp2 = new SanPham();
        sp2.setTenSp("Điện thoại");
        sp2.setDonGia(10000);
        sp2.setGiamGia(0);

        // Xuất thông tin sản phẩm
        System.out.println("Thông tin sản phẩm thứ nhất:");
        sp1.xuat();

        System.out.println("\nThông tin sản phẩm thứ hai:");
        sp2.xuat();
    }
}
