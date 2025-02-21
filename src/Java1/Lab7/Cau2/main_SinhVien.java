package Java1.Lab7.Cau2;

public class main_SinhVien {
        public static void main(String[] args) {
            SinhVienPoly sv1 = new SinhVienIT("Nguyễn Văn A", 8, 7, 6);
            SinhVienPoly sv2 = new SinhVienBiz("Trần Thị B", 7, 9);

            sv1.xuat();
            sv2.xuat();
        }
}
