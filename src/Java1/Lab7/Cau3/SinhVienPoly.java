package Java1.Lab7.Cau3;

// Lớp trừu tượng SinhVienPoly
abstract class SinhVienPoly {
    protected String hoTen;
    protected String nganh;

    // Constructor
    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    // Phương thức trừu tượng getDiem() - bắt buộc lớp con phải ghi đè
    public abstract double getDiem();

    // Xếp loại học lực dựa vào điểm
    public String getHocLuc() {
        double diem = getDiem();
        if (diem < 5) return "Yếu";
        else if (diem < 6.5) return "Trung bình";
        else if (diem < 7.5) return "Khá";
        else if (diem < 9) return "Giỏi";
        else return "Xuất sắc";
    }

    // Xuất thông tin sinh viên
    public void xuat() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngành: " + nganh);
        System.out.println("Điểm: " + getDiem());
        System.out.println("Học lực: " + getHocLuc());
        System.out.println("----------------------");
    }
}

