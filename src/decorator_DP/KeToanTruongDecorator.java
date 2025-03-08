package decorator_DP;

public class KeToanTruongDecorator extends EmployeeDecorator {
    private double monthlyBudget;

    public KeToanTruongDecorator(IEmployee employee) {
        super(employee);
        this.monthlyBudget = 1000000000; // 1 billion VND default budget
    }

    @Override
    public void performDuties() {
        super.performDuties();
        System.out.println("\nCông việc của Kế Toán Trưởng:");
        manageBudget();
        prepareReports();
        handlePayroll();
        performAudit();
    }

    private void manageBudget() {
        System.out.println("Quản lý ngân sách:");
        System.out.println("- Quản lý ngân sách hàng tháng: " + formatCurrency(monthlyBudget) + " VND");
        System.out.println("- Phân bổ ngân sách cho các phòng ban");
        System.out.println("- Theo dõi chi tiêu và doanh thu");
    }

    private void prepareReports() {
        System.out.println("\nBáo cáo tài chính:");
        System.out.println("- Lập báo cáo thu chi hàng tháng");
        System.out.println("- Chuẩn bị báo cáo thuế");
        System.out.println("- Phân tích hiệu quả tài chính");
    }

    private void handlePayroll() {
        System.out.println("\nQuản lý lương thưởng:");
        System.out.println("- Tính toán lương nhân viên");
        System.out.println("- Quản lý phúc lợi");
        System.out.println("- Xử lý bảo hiểm xã hội");
    }

    private void performAudit() {
        System.out.println("\nKiểm toán nội bộ:");
        System.out.println("- Kiểm tra sổ sách kế toán");
        System.out.println("- Đảm bảo tuân thủ quy định");
        System.out.println("- Đề xuất cải thiện quy trình");
    }

    private String formatCurrency(double amount) {
        return String.format("%,.0f", amount);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + 
               " + Kế Toán Trưởng [Budget: " + formatCurrency(monthlyBudget) + " VND]";
    }
}