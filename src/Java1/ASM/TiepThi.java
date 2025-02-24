package Java1.ASM;

public class TiepThi extends NhanVien {
    double doanhSo;       // Doanh số bán hàng
    double tiLeHueHong;   // Tỉ lệ huê hồng (dạng thập phân, ví dụ 0.1 cho 10%)

    public TiepThi(String maNV, String hoTen, double luong, double doanhSo, double tiLeHueHong) {
        super(maNV, hoTen, luong);
        this.doanhSo = doanhSo;
        this.tiLeHueHong = tiLeHueHong;
    }

    @Override
    public double getThuNhap() {
        return luong + (doanhSo * tiLeHueHong); // Thu nhập = lương + huê hồng
    }

    @Override
    public String toString() {
        return "Nhân viên tiếp thị - " + super.toString() +
                ", Doanh số: " + doanhSo + ", Tỉ lệ huê hồng: " + (tiLeHueHong * 100) + "%";
    }
}