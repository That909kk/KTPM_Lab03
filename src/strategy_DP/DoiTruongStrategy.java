package strategy_DP;

public class DoiTruongStrategy implements RoleStrategy {

	@Override
    public void performDuties() {
        System.out.println("Đội Trưởng");
        System.out.println("1. Quản lý nhóm nhân viên");
        System.out.println("2. Phân công công việc");
        System.out.println("3. Báo cáo tiến độ công việc");
        System.out.println("4. Đánh giá hiệu suất nhân viên");
    }


}
