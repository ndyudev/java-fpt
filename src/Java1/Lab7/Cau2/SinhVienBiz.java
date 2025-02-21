package Java1.Lab7.Cau2;

// Lớp SinhVienBiz kế thừa từ SinhVienPoly
class SinhVienBiz extends SinhVienPoly {
    private double diemMarketing;
    private double diemSales;

    // Constructor
    public SinhVienBiz(String hoTen, double diemMarketing, double diemSales) {
        super(hoTen, "Business");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    // Triển khai phương thức getDiem() cho SinhVienBiz
    @Override
    public double getDiem() {
        return (diemMarketing + diemSales * 2) / 3; // Trọng số: Sales quan trọng hơn
    }
}
