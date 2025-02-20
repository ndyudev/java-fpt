package Java1.ASM;

public class TiepThi extends NhanVien {
    private double doanhSo;
    private double hoaHong;

    public TiepThi(String maNhanVien, double salary, String hoVaTen, double doanhSo, double hoaHong) {
        super(maNhanVien, salary, hoVaTen);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public double getHoaHong() {
        return hoaHong;
    }

    public double getThuNhap() {
        return ( getDoanhSo() / getHoaHong() ) + getSalary();
    }
}
