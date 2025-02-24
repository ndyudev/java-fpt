package Java1.ASM;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyNhanSu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> listNhanVien = new ArrayList<>();
        int choice;

        do {
            choice = showMenu(sc);
            switch (choice) {
                case 1:
                    nhapDanhSachNhanVien(listNhanVien, sc);
                    break;
                case 2:
                    xuatDanhSachNhanVien(listNhanVien);
                    break;
                case 3:
                    timNhanVienTheoMa(listNhanVien, sc);
                    break;
                case 4:
                    xoaNhanVienTheoMa(listNhanVien, sc);
                    break;
                case 5:
                    capNhatThongTinNhanVien(listNhanVien, sc);
                    break;
                case 6:
                    timNhanVienTheoKhoangThuNhap(listNhanVien, sc);
                    break;
                case 7:
                    sapXepTheoHoTen(listNhanVien);
                    break;
                case 8:
                    sapXepTheoThuNhap(listNhanVien);
                    break;
                case 9:
                    xuat5NhanVienThuNhapCaoNhat(listNhanVien);
                    break;
                case 0:
                    System.out.println("Thoát chương trình. Cảm ơn bạn!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
            }
        } while (choice != 0);
        sc.close();
    }

    public static int showMenu(Scanner sc) {
        System.out.println("+-------------------------------+");
        System.out.println("|   QUẢN LÝ NHÂN VIÊN RỒNG VIỆT  |");
        System.out.println("+-------------------------------+");
        System.out.println("| 1. Nhập danh sách nhân viên    |");
        System.out.println("| 2. Xuất danh sách nhân viên    |");
        System.out.println("| 3. Tìm nhân viên theo mã       |");
        System.out.println("| 4. Xóa nhân viên theo mã       |");
        System.out.println("| 5. Cập nhật thông tin nhân viên|");
        System.out.println("| 6. Tìm nhân viên theo thu nhập |");
        System.out.println("| 7. Sắp xếp theo họ tên         |");
        System.out.println("| 8. Sắp xếp theo thu nhập       |");
        System.out.println("| 9. 5 nhân viên thu nhập cao nhất|");
        System.out.println("| 0. Thoát                       |");
        System.out.println("+-------------------------------+");
        System.out.print("Chọn chức năng (0-9): ");

        int choice = -1;
        try {
            choice = Integer.parseInt(sc.nextLine());
            if (choice < 0 || choice > 9) {
                System.out.println("Vui lòng nhập số từ 0 đến 9!");
                return -1; // Yêu cầu nhập lại
            }
        } catch (NumberFormatException e) {
            System.out.println("Vui lòng nhập số nguyên!");
            return -1; // Yêu cầu nhập lại
        }
        return choice;
    }

    // 1. Nhập danh sách nhân viên
    public static void nhapDanhSachNhanVien(ArrayList<NhanVien> list, Scanner sc) {
        System.out.print("Nhập số nhân viên: ");
        int n = 0;
        try {
            n = Integer.parseInt(sc.nextLine());
            if (n <= 0) {
                System.out.println("Số nhân viên phải lớn hơn 0! Vui lòng nhập lại.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Vui lòng nhập số nguyên!");
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Nhân viên thứ " + (i + 1) + ":");
            System.out.print("Loại nhân viên (1: Hành chính, 2: Tiếp thị, 3: Trưởng phòng): ");
            int type = 0;
            try {
                type = Integer.parseInt(sc.nextLine());
                if (type < 1 || type > 3) {
                    System.out.println("Loại nhân viên không hợp lệ! Vui lòng nhập lại (1-3).");
                    i--;
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số nguyên!");
                i--;
                continue;
            }

            System.out.print("Mã nhân viên: ");
            String maNV = sc.nextLine();
            if (maNV.isEmpty()) {
                System.out.println("Mã nhân viên không được để trống! Vui lòng nhập lại.");
                i--;
                continue;
            }
            // Kiểm tra mã nhân viên trùng
            for (NhanVien nv : list) {
                if (nv.getMaNV().equals(maNV)) {
                    System.out.println("Mã đã tồn tại! Vui lòng nhập lại.");
                    i--;
                    continue;
                }
            }

            System.out.print("Họ tên: ");
            String hoTen = sc.nextLine();
            if (hoTen.isEmpty()) {
                System.out.println("Họ tên không được để trống! Vui lòng nhập lại.");
                i--;
                continue;
            }

            System.out.print("Lương: ");
            double luong = 0;
            try {
                luong = Double.parseDouble(sc.nextLine());
                if (luong < 0) {
                    System.out.println("Lương không được âm! Vui lòng nhập lại.");
                    i--;
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số hợp lệ!");
                i--;
                continue;
            }

            switch (type) {
                case 1: // Nhân viên hành chính
                    list.add(new NhanVienHanhChinh(maNV, hoTen, luong));
                    break;
                case 2: // Nhân viên tiếp thị
                    System.out.print("Doanh số: ");
                    double doanhSo = 0;
                    try {
                        doanhSo = Double.parseDouble(sc.nextLine());
                        if (doanhSo < 0) {
                            System.out.println("Doanh số không được âm! Vui lòng nhập lại.");
                            i--;
                            continue;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Vui lòng nhập số hợp lệ!");
                        i--;
                        continue;
                    }

                    System.out.print("Tỉ lệ huê hồng (%): ");
                    double tiLe = 0;
                    try {
                        tiLe = Double.parseDouble(sc.nextLine());
                        if (tiLe < 0 || tiLe > 100) {
                            System.out.println("Tỉ lệ huê hồng phải từ 0 đến 100! Vui lòng nhập lại.");
                            i--;
                            continue;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Vui lòng nhập số hợp lệ!");
                        i--;
                        continue;
                    }
                    list.add(new TiepThi(maNV, hoTen, luong, doanhSo, tiLe / 100));
                    break;
                case 3: // Trưởng phòng
                    System.out.print("Lương trách nhiệm: ");
                    double luongTrach = 0;
                    try {
                        luongTrach = Double.parseDouble(sc.nextLine());
                        if (luongTrach < 0) {
                            System.out.println("Lương trách nhiệm không được âm! Vui lòng nhập lại.");
                            i--;
                            continue;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Vui lòng nhập số hợp lệ!");
                        i--;
                        continue;
                    }
                    list.add(new TruongPhong(maNV, hoTen, luong, luongTrach));
                    break;
            }
        }
        System.out.println("Nhập danh sách thành công!");
    }

    // 2. Xuất danh sách nhân viên
    public static void xuatDanhSachNhanVien(ArrayList<NhanVien> list) {
        if (list.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        System.out.println("Danh sách nhân viên:");
        for (NhanVien nv : list) {
            System.out.println(nv);
        }
    }

    // 3. Tìm nhân viên theo mã
    public static void timNhanVienTheoMa(ArrayList<NhanVien> list, Scanner sc) {
        System.out.print("Nhập mã nhân viên cần tìm: ");
        String maNV = sc.nextLine();
        if (maNV.isEmpty()) {
            System.out.println("Mã nhân viên không được để trống!");
            return;
        }

        boolean found = false;
        for (NhanVien nv : list) {
            if (nv.getMaNV().equals(maNV)) {
                System.out.println("Thông tin nhân viên:");
                System.out.println(nv);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy nhân viên!");
        }
    }

    // 4. Xóa nhân viên theo mã
    public static void xoaNhanVienTheoMa(ArrayList<NhanVien> list, Scanner sc) {
        System.out.print("Nhập mã nhân viên cần xóa: ");
        String maNV = sc.nextLine();
        if (maNV.isEmpty()) {
            System.out.println("Mã nhân viên không được để trống!");
            return;
        }

        boolean found = false;
        for (NhanVien nv : list) {
            if (nv.getMaNV().equals(maNV)) {
                list.remove(nv);
                System.out.println("Đã xóa nhân viên!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy nhân viên!");
        }
    }

    // 5. Cập nhật thông tin nhân viên
    public static void capNhatThongTinNhanVien(ArrayList<NhanVien> list, Scanner sc) {
        System.out.print("Nhập mã nhân viên cần cập nhật: ");
        String maNV = sc.nextLine();
        if (maNV.isEmpty()) {
            System.out.println("Mã nhân viên không được để trống!");
            return;
        }

        boolean found = false;
        for (NhanVien nv : list) {
            if (nv.getMaNV().equals(maNV)) {
                found = true;
                System.out.print("Họ tên mới: ");
                String hoTen = sc.nextLine();
                if (hoTen.isEmpty()) {
                    System.out.println("Họ tên không được để trống! Vui lòng nhập lại.");
                    return;
                }

                System.out.print("Lương mới: ");
                double luong = 0;
                try {
                    luong = Double.parseDouble(sc.nextLine());
                    if (luong < 0) {
                        System.out.println("Lương không được âm! Vui lòng nhập lại.");
                        return;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Vui lòng nhập số hợp lệ!");
                    return;
                }

                if (nv instanceof NhanVienHanhChinh) {
                    ((NhanVienHanhChinh) nv).luong = luong;
                    ((NhanVienHanhChinh) nv).hoTen = hoTen;
                } else if (nv instanceof TiepThi) {
                    ((TiepThi) nv).luong = luong;
                    ((TiepThi) nv).hoTen = hoTen;
                    System.out.print("Doanh số mới: ");
                    double doanhSo = 0;
                    try {
                        doanhSo = Double.parseDouble(sc.nextLine());
                        if (doanhSo < 0) {
                            System.out.println("Doanh số không được âm! Vui lòng nhập lại.");
                            return;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Vui lòng nhập số hợp lệ!");
                        return;
                    }

                    System.out.print("Tỉ lệ huê hồng mới (%): ");
                    double tiLe = 0;
                    try {
                        tiLe = Double.parseDouble(sc.nextLine());
                        if (tiLe < 0 || tiLe > 100) {
                            System.out.println("Tỉ lệ huê hồng phải từ 0 đến 100! Vui lòng nhập lại.");
                            return;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Vui lòng nhập số hợp lệ!");
                        return;
                    }
                    ((TiepThi) nv).doanhSo = doanhSo;
                    ((TiepThi) nv).tiLeHueHong = tiLe / 100;
                } else if (nv instanceof TruongPhong) {
                    ((TruongPhong) nv).luong = luong;
                    ((TruongPhong) nv).hoTen = hoTen;
                    System.out.print("Lương trách nhiệm mới: ");
                    double luongTrach = 0;
                    try {
                        luongTrach = Double.parseDouble(sc.nextLine());
                        if (luongTrach < 0) {
                            System.out.println("Lương trách nhiệm không được âm! Vui lòng nhập lại.");
                            return;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Vui lòng nhập số hợp lệ!");
                        return;
                    }
                    ((TruongPhong) nv).luongTrachNhiem = luongTrach;
                }
                System.out.println("Cập nhật thành công!");
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy nhân viên!");
        }
    }

    // 6. Tìm nhân viên theo khoảng thu nhập
    public static void timNhanVienTheoKhoangThuNhap(ArrayList<NhanVien> list, Scanner sc) {
        System.out.print("Nhập thu nhập thấp nhất: ");
        double min = 0;
        try {
            min = Double.parseDouble(sc.nextLine());
            if (min < 0) {
                System.out.println("Thu nhập không được âm! Vui lòng nhập lại.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Vui lòng nhập số hợp lệ!");
            return;
        }

        System.out.print("Nhập thu nhập cao nhất: ");
        double max = 0;
        try {
            max = Double.parseDouble(sc.nextLine());
            if (max < 0) {
                System.out.println("Thu nhập không được âm! Vui lòng nhập lại.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Vui lòng nhập số hợp lệ!");
            return;
        }

        if (min > max) {
            System.out.println("Thu nhập thấp nhất phải nhỏ hơn hoặc bằng thu nhập cao nhất! Vui lòng nhập lại.");
            return;
        }

        boolean found = false;
        System.out.println("Nhân viên có thu nhập từ " + min + " đến " + max + ":");
        for (NhanVien nv : list) {
            double thuNhap = nv.getThuNhap();
            if (thuNhap >= min && thuNhap <= max) {
                System.out.println(nv);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy nhân viên nào!");
        }
    }

    // 7. Sắp xếp theo họ tên
    public static void sapXepTheoHoTen(ArrayList<NhanVien> list) {
        list.sort(Comparator.comparing(NhanVien::getHoTen));
        xuatDanhSachNhanVien(list);
    }

    // 8. Sắp xếp theo thu nhập
    public static void sapXepTheoThuNhap(ArrayList<NhanVien> list) {
        list.sort((n1, n2) -> Double.compare(n2.getThuNhap(), n1.getThuNhap()));
        xuatDanhSachNhanVien(list);
    }

    // 9. 5 nhân viên thu nhập cao nhất
    public static void xuat5NhanVienThuNhapCaoNhat(ArrayList<NhanVien> list) {
        if (list.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        sapXepTheoThuNhap(list); // Sắp xếp giảm dần theo thu nhập
        int count = Math.min(5, list.size());
        System.out.println("5 nhân viên thu nhập cao nhất:");
        for (int i = 0; i < count; i++) {
            System.out.println(list.get(i));
        }
    }
}