package Java1.ASM;

public class TruongPhong extends NhanVien {
    double luongTrachNhiem; // Lương trách nhiệm

    public TruongPhong(String maNV, String hoTen, double luong, double luongTrachNhiem) {
        super(maNV, hoTen, luong);
        this.luongTrachNhiem = luongTrachNhiem;
    }

    @Override
    public double getThuNhap() {
        return luong + luongTrachNhiem; // Thu nhập = lương + lương trách nhiệm
    }

    @Override
    public String toString() {
        return "Trưởng phòng - " + super.toString() +
                ", Lương trách nhiệm: " + luongTrachNhiem;
    }
}