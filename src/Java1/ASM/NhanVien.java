package Java1.ASM;

public class NhanVien {
    protected String maNV;    // Mã nhân viên
    protected String hoTen;   // Họ tên
    protected double luong;   // Lương tháng

    // Constructor
    public NhanVien(String maNV, String hoTen, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    // Getters
    public String getMaNV() {
        return maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getLuong() {
        return luong;
    }

    // Phương thức để tính thu nhập (sẽ được ghi đè bởi các lớp con)
    public double getThuNhap() {
        return luong; // Mặc định, thu nhập = lương (cho nhân viên hành chính)
    }

    // Phương thức để tính thuế thu nhập (chung cho tất cả)
    public double tinhThueThuNhap() {
        double thuNhap = getThuNhap();
        if (thuNhap < 9000000) {
            return 0; // Không đóng thuế
        } else if (thuNhap <= 15000000) {
            return thuNhap * 0.1; // Đóng 10%
        } else {
            return thuNhap * 0.12; // Đóng 12%
        }
    }

    @Override
    public String toString() {
        return "Mã: " + maNV + ", Tên: " + hoTen +
                ", Lương: " + luong + ", Thu nhập: " + getThuNhap() +
                ", Thuế: " + tinhThueThuNhap();
    }
}