package Java1.Lab7.Cau4;

class SinhVienBiz extends SinhVienPoly {
    private double diemMarketing, diemSales;

    public SinhVienBiz(String hoTen, double diemMarketing, double diemSales) {
        super(hoTen, "Business");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem() {
        return (2 * diemMarketing + diemSales) / 3;
    }
}
