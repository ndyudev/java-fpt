package Java1.ASM;

import java.util.Scanner;

/* Công ty Rồng Việt đang hoạt động trong lĩnh vực quảng cáo. Họ có nhiều nhân viên và được chia
nhiều phòng ban. Do tính chất công việc khác nhau nên việc tính lương cũng phải áp dụng các
công thức khác nhau.
Cụ thể thì nhân viên hành chính sẽ được trả lương tháng, trưởng phòng ngoài lương tháng còn có
lương trách nhiệm còn nhân viên tiếp thị thì một phần ít lương tháng cố định và huê hồng từ
doanh số bán hàng của mỗi nhân viên.
Công ty Rồng Việt muốn thuê bạn xây dựng phần mền quản lý nhân sự tiền lương bao gồm các
chức năng sau
✓ Nhập và xuất danh sách nhân viên
✓ Xóa nhân viên hoặc cập nhật thông tin nhân viên
✓ Tìm kiếm nhân viên theo lương
✓ Sắp xếp nhân viên theo họ tên và thu nhập
✓ Xuất 5 nhân viên có thu nhập cao nhất công ty
Trong đó nhân viên được chia làm 3 loại: nhân viên hành chánh, nhân viên tiếp thị và trưởng
phòng.
✓ Thông tin mỗi nhân viên hành chính gồm mã, họ tên, lương
✓ Nhân viên tiếp thị cần thêm doanh số bán hàng và tỉ lệ huê hồng
✓ Trưởng phòng sẽ lương trách nhiệm
Mỗi nhân viên cần được tính thu nhập và thuế thu nhập.
✓ Thu nhập được tính bẳng tổng các khoản thu
✓ Thuế thu nhập được tính theo phương pháp lũy tiến
o Dưới 9 triệu: không đóng thuế
o Từ 9-15 triệu: đóng 10%
o Trên 15 triệu: đóng 12%
Là một lập trình viên bạn hãy xây dựng ứng dụng quản lý nhân sự tiền lương theo yêu cầu của
công ty Rồng Việt cụ thể như sau:
YÊU CẦU:
Y1. Nhập danh sách nhân viên từ bàn phím.
Y2. Xuất danh sách nhân viên ra màn hình.
Y3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.
Y4. Xóa nhân viên theo mã nhập từ bàn phím.
Y5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím
Y6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím.
Y7. Sắp xếp nhân viên theo họ và tên.
Y8. Sắp xếp nhân viên theo thu nhập.
Y9. Xuất 5 nhân viên có thu nhập cao nhất.
Name: Chau Nhat Duy
MSSV: PS44284
Date: 18/1/2025
 */
public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            choice = Menu();
            switch (choice) {
                case 1:
                    System.out.println("Nhập danh sách nhân viên ( Đang phát triển )");
                    break;
                case 2:
                    System.out.println("Xuất danh sách nhân viên ( Đang phát triển )");
                    break;
                case 3:
                    System.out.println("Tìm nhân viên theo mã ( Đang phát triển )");
                    break;
                case 4:
                    System.out.println("Xóa nhân viên theo mã ( Đang phát triển )");
                    break;
                case 5:
                    System.out.println("Cập nhật thông tin nhân viên ( Đang phát triển )");
                    break;
                case 6:
                    System.out.println("Tìm nhân viên theo khoảng lương ( Đang phát triển )");
                    break;
                case 7:
                    System.out.println("Sắp xếp nhân viên theo họ tên ( Đang phát triển )");
                    break;
                case 8:
                    System.out.println("Sắp xếp nhân viên theo thu nhập ( Đang phát triển )");
                    break;
                case 9:
                    System.out.println("Xuất 5 nhân viên có thu nhập cao nhất ( Đang phát triển )");
                    break;
                case 0:
                    System.out.println("Thoát chương trình. Cảm ơn đã sử dụng!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 0);
    }

    public static int Menu() {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        boolean valid = false;

        do {
            try {
                System.out.println("+---------------------------------------+");
                System.out.println("|       QUẢN LÝ NHÂN VIÊN RỒNG VIỆT     |");
                System.out.println("+---------------------------------------+");
                System.out.println("|  1. Nhập danh sách nhân viên          |");
                System.out.println("|  2. Xuất danh sách nhân viên          |");
                System.out.println("|  3. Tìm nhân viên theo mã             |");
                System.out.println("|  4. Xóa nhân viên theo mã             |");
                System.out.println("|  5. Cập nhật thông tin nhân viên      |");
                System.out.println("|  6. Tìm nhân viên theo khoảng lương   |");
                System.out.println("|  7. Sắp xếp nhân viên theo họ tên     |");
                System.out.println("|  8. Sắp xếp nhân viên theo thu nhập   |");
                System.out.println("|  9. Xuất 5 nhân viên thu nhập cao nhất|");
                System.out.println("|  0. Thoát                             |");
                System.out.println("+---------------------------------------+");
                System.out.print("  Vui lòng chọn chức năng: ");

                choice = Integer.parseInt(sc.nextLine());
                if (choice < 0 || choice > 9) {
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập số từ 0 đến 9.");
                } else {
                    valid = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập số nguyên!");
            }
        } while (!valid);

        return choice;
    }
}
