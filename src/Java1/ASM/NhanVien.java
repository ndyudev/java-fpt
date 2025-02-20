package Java1.ASM;

public class NhanVien {
    private String maNhanVien;
    private String hoVaTen;
    private double salary;

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public NhanVien(String maNhanVien, double salary, String hoVaTen) {
        this.maNhanVien = maNhanVien;
        this.salary = salary;
        this.hoVaTen = hoVaTen;
    }
    @Override
    public String toString() {
        return "Ho va ten: " + hoVaTen + "\nMa Nhan Vien: " + maNhanVien + "\nLuong: " + salary;
    }
}
