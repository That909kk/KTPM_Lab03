package decorator_DP;

public class DoiTruongDecorator extends EmployeeDecorator {
    private int teamSize;

    public DoiTruongDecorator(IEmployee employee) {
        super(employee);
        this.teamSize = 10; // Default team size
    }

    @Override
    public void performDuties() {
        super.performDuties();
        System.out.println("\nCông việc của Đội Trưởng:");
        manageTeam();
        assignTasks();
        monitorProgress();
        evaluatePerformance();
    }

    private void manageTeam() {
        System.out.println("Quản lý nhóm:");
        System.out.println("- Điều phối đội " + teamSize + " nhân viên");
        System.out.println("- Tổ chức họp nhóm hàng tuần");
        System.out.println("- Giải quyết vấn đề nội bộ");
    }

    private void assignTasks() {
        System.out.println("\nPhân công công việc:");
        System.out.println("- Lập kế hoạch công việc");
        System.out.println("- Phân chia nhiệm vụ");
        System.out.println("- Đặt mục tiêu và deadline");
    }

    private void monitorProgress() {
        System.out.println("\nTheo dõi tiến độ:");
        System.out.println("- Kiểm tra công việc hàng ngày");
        System.out.println("- Cập nhật trạng thái dự án");
        System.out.println("- Báo cáo cho cấp trên");
    }

    private void evaluatePerformance() {
        System.out.println("\nĐánh giá hiệu suất:");
        System.out.println("- Đánh giá KPI nhân viên");
        System.out.println("- Đề xuất khen thưởng");
        System.out.println("- Góp ý cải thiện");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Đội Trưởng [Team size: " + teamSize + "]";
    }
}