package Java1.ASM;

public class TruongPhong extends NhanVien {
    private double trachNhiem;

    public TruongPhong(String maNhanVien, double salary, String hoVaTen, double trachNhiem) {
        super(maNhanVien, salary, hoVaTen);
        this.trachNhiem = trachNhiem;
    }

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public double getThuNhap() {
        return getSalary() + getThuNhap();
    }
}
