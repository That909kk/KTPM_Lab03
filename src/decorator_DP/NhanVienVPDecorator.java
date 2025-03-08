package decorator_DP;

public class NhanVienVPDecorator extends EmployeeDecorator {
    private int documentsProcessed;
    private int coffeesMade;

    public NhanVienVPDecorator(IEmployee employee) {
        super(employee);
        this.documentsProcessed = 0;
        this.coffeesMade = 0;
    }

    @Override
    public void performDuties() {
        super.performDuties();
        System.out.println("\nCông việc của Nhân Viên Văn Phòng:");
        makeCoffee();
        processDocuments();
        handleAdminWork();
        serveGuests();
    }

    private void makeCoffee() {
        coffeesMade++;
        System.out.println("Pha cà phê:");
        System.out.println("- Pha cà phê lần thứ " + coffeesMade + " trong ngày");
        System.out.println("- Chuẩn bị đồ uống cho khách");
        System.out.println("- Duy trì khu vực pha chế");
    }

    private void processDocuments() {
        documentsProcessed += 5;
        System.out.println("\nXử lý văn bản:");
        System.out.println("- Phê duyệt " + documentsProcessed + " văn bản");
        System.out.println("- Sắp xếp hồ sơ");
        System.out.println("- Lưu trữ tài liệu");
    }

    private void handleAdminWork() {
        System.out.println("\nCông việc hành chính:");
        System.out.println("- Trả lời email và điện thoại");
        System.out.println("- Lập lịch họp");
        System.out.println("- Quản lý văn phòng phẩm");
    }

    private void serveGuests() {
        System.out.println("\nTiếp khách:");
        System.out.println("- Đón tiếp khách đến văn phòng");
        System.out.println("- Hướng dẫn phòng họp");
        System.out.println("- Chuẩn bị tài liệu cho khách");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + 
               " + Nhân Viên VP [Documents: " + documentsProcessed + 
               ", Coffees: " + coffeesMade + "]";
    }
}