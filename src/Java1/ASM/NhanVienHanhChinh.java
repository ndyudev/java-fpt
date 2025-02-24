package Java1.ASM;

public class NhanVienHanhChinh extends NhanVien {
    // Sử dụng constructor của lớp cha
    public NhanVienHanhChinh(String maNV, String hoTen, double luong) {
        super(maNV, hoTen, luong);
    }

    @Override
    public String toString() {
        return "Nhân viên hành chính - " + super.toString();
    }
}