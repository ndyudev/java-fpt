package Java1.Lab6.Cau3;

import java.util.regex.Pattern;

class SinhVien {
    private String hoTen;
    private String email;
    private String soDienThoai;
    private String cmnd;

    // Constructor
    public SinhVien(String hoTen, String email, String soDienThoai, String cmnd) {
        this.hoTen = hoTen;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.cmnd = cmnd;
    }

    // Getter để hiển thị thông tin
    public void hienThiThongTin() {
        System.out.println("Họ Tên: " + hoTen);
        System.out.println("Email: " + email);
        System.out.println("SĐT: " + soDienThoai);
        System.out.println("CMND: " + cmnd);
        System.out.println("-----------------------");
    }

    // Kiểm tra email hợp lệ
    public static boolean kiemTraEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        return Pattern.matches(emailRegex, email);
    }

    // Kiểm tra số điện thoại hợp lệ (10 chữ số, bắt đầu bằng 0)
    public static boolean kiemTraSoDienThoai(String soDienThoai) {
        String phoneRegex = "^0\\d{9}$";
        return Pattern.matches(phoneRegex, soDienThoai);
    }

    // Kiểm tra CMND hợp lệ (9 hoặc 12 số)
    public static boolean kiemTraCMND(String cmnd) {
        String cmndRegex = "^(\\d{9}|\\d{12})$";
        return Pattern.matches(cmndRegex, cmnd);
    }
}