package Java1.Lab7.Cau3;

// Lớp SinhVienIT kế thừa từ SinhVienPoly
class SinhVienIT extends SinhVienPoly {
    private double diemJava;
    private double diemHtml;
    private double diemCss;

    // Constructor
    public SinhVienIT(String hoTen, double diemJava, double diemHtml, double diemCss) {
        super(hoTen, "IT");
        this.diemJava = diemJava;
        this.diemHtml = diemHtml;
        this.diemCss = diemCss;
    }

    // Triển khai phương thức getDiem() cho SinhVienIT
    @Override
    public double getDiem() {
        return (2 * diemJava + diemHtml + diemCss) / 4; // Trọng số: Java quan trọng hơn
    }
}
