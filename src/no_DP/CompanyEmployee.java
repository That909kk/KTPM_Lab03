package no_DP;
public class CompanyEmployee {
    private String name;
    private String role;

    public CompanyEmployee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void displayDuties() {
        System.out.println("Tên: " + name);
        System.out.println("Chức Vụ: " + role);
        System.out.println("Nhiệm Vụ:");

        switch (role) {
            case "DoiTruong":
                doiTruongDuties();
                break;
            case "GiamDoc":
                giamDocDuties();
                break;
            case "NhanVienVP":
                nhanVienVPDuties();
                break;
            case "NhanVienXuong":
                nhanVienXuongDuties();
                break;
            case "KeToanTruong":
                keToanTruongDuties();
                break;
            default:
                System.out.println("Unknown role");
        }
    }

    private void doiTruongDuties() {
        System.out.println("1. Quản lý nhóm nhân viên");
        System.out.println("2. Phân công công việc");
        System.out.println("3. Báo cáo tiến độ công việc");
        System.out.println("4. Đánh giá hiệu suất nhân viên");
    }

    private void giamDocDuties() {
        System.out.println("1. Hoạch định chiến lược công ty");
        System.out.println("2. Ra quyết định quan trọng");
        System.out.println("3. Đại diện công ty đối ngoại");
        System.out.println("4. Quản lý toàn bộ hoạt động");
    }

    private void nhanVienVPDuties() {
        System.out.println("1. Pha cà phê");
        System.out.println("2. Phê duyệt văn bản");
        System.out.println("3. Xử lý công việc hành chính");
        System.out.println("4. Tiếp khách");
    }

    private void nhanVienXuongDuties() {
        System.out.println("1. Vận hành máy móc");
        System.out.println("2. Sản xuất sản phẩm");
        System.out.println("3. Kiểm tra chất lượng");
        System.out.println("4. Báo cáo sản lượng");
    }

    private void keToanTruongDuties() {
        System.out.println("1. Quản lý tài chính");
        System.out.println("2. Lập báo cáo kế toán");
        System.out.println("3. Kiểm soát chi tiêu");
        System.out.println("4. Thanh toán lương");
    }

    public static void main(String[] args) {

        CompanyEmployee employee1 = new CompanyEmployee("Nguyen Van A", "NhanVienVP");
        employee1.displayDuties();

        System.out.println("\n-------------------\n");

        CompanyEmployee employee2 = new CompanyEmployee("Tran Thi B", "NhanVienVP");
        employee2.displayDuties();
    }
}