import java.util.*;

/**
 * Lớp quản lý danh sách họ và tên sử dụng ArrayList và lập trình hướng đối tượng
 */
public class Student {
    private List<String> names;

    /**
     * Constructor khởi tạo danh sách tên
     */
    public Student() {
        names = new ArrayList<>();
    }

    /**
     * Phương thức nhập danh sách họ và tên từ người dùng
     */
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng tên: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập tên thứ " + (i + 1) + ": ");
            names.add(scanner.nextLine());
        }
    }

    /**
     * Phương thức xuất danh sách họ và tên
     */
    public void xuat() {
        System.out.println("Danh sách họ và tên:");
        for (String name : names) {
            System.out.println(name);
        }
    }

    /**
     * Phương thức xáo trộn danh sách một cách ngẫu nhiên
     */
    public void ngauNhien() {
        Collections.shuffle(names);
        System.out.println("Danh sách sau khi xáo trộn ngẫu nhiên:");
        xuat();
    }

    /**
     * Phương thức sắp xếp danh sách theo thứ tự giảm dần
     */
    public void sapXep() {
        Collections.sort(names);
        Collections.reverse(names);
        System.out.println("Danh sách sau khi sắp xếp giảm dần:");
        xuat();
    }

    /**
     * Phương thức tìm và xóa họ và tên nhập từ bàn phím
     */
    public void xoa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên cần xóa: ");
        String tenXoa = scanner.nextLine();
        Iterator<String> iterator = names.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            if (iterator.next().equalsIgnoreCase(tenXoa)) {
                iterator.remove();
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Đã xóa thành công!");
        } else {
            System.out.println("Không tìm thấy tên cần xóa.");
        }
        xuat();
    }

    /**
     * Phương thức hiển thị menu và xử lý lựa chọn của người dùng
     */
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Nhập danh sách họ và tên");
            System.out.println("2. Xuất danh sách vừa nhập");
            System.out.println("3. Xuất danh sách ngẫu nhiên");
            System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
            System.out.println("5. Tìm và xóa họ tên nhập từ bàn phím");
            System.out.println("6. Kết thúc");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    ngauNhien();
                    break;
                case 4:
                    sapXep();
                    break;
                case 5:
                    xoa();
                    break;
                case 6:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 6);
    }

    /**
     * Phương thức main để chạy chương trình
     */
    public static void main(String[] args) {
        Student manager = new Student();
        manager.menu();
    }
}
