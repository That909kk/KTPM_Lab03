package decorator_DP;

public class GiamDocDecorator extends EmployeeDecorator {
    private double companyBudget;
    private int employeeCount;

    public GiamDocDecorator(IEmployee employee) {
        super(employee);
        this.companyBudget = 10000000000.0; // 10 billion VND default budget
        this.employeeCount = 100; // Default employee count
    }

    @Override
    public void performDuties() {
        super.performDuties();
        System.out.println("\nCông việc của Giám Đốc:");
        planStrategy();
        makeDecisions();
        representCompany();
        manageOperations();
    }

    private void planStrategy() {
        System.out.println("Hoạch định chiến lược:");
        System.out.println("- Xây dựng tầm nhìn và sứ mệnh công ty");
        System.out.println("- Lập kế hoạch phát triển 5 năm");
        System.out.println("- Định hướng thị trường mục tiêu");
    }

    private void makeDecisions() {
        System.out.println("\nRa quyết định:");
        System.out.println("- Phê duyệt ngân sách: " + formatCurrency(companyBudget) + " VND");
        System.out.println("- Quyết định đầu tư và mở rộng");
        System.out.println("- Phê duyệt các dự án lớn");
    }

    private void representCompany() {
        System.out.println("\nĐại diện công ty:");
        System.out.println("- Đàm phán với đối tác");
        System.out.println("- Tham dự hội nghị ngành");
        System.out.println("- Xây dựng quan hệ đối ngoại");
    }

    private void manageOperations() {
        System.out.println("\nQuản lý hoạt động:");
        System.out.println("- Điều hành " + employeeCount + " nhân viên");
        System.out.println("- Giám sát các phòng ban");
        System.out.println("- Đảm bảo hiệu quả hoạt động");
    }

    private String formatCurrency(double amount) {
        return String.format("%,.0f", amount);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + 
               " + Giám Đốc [Budget: " + formatCurrency(companyBudget) + 
               " VND, Employees: " + employeeCount + "]";
    }
}